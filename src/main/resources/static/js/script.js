$(document).ready(function () {
	
	var countryList='default';
	
	
	$('#suggCountry').on('click', '#suggButton', function(){
	    fire_ajax_submit(this.value);
	});

	$.ajax({
		type:"GET",
		url:"/capita_load",
		success:function(data) {
			countryList = data;
		},
		error:function(e) {
			console.log("ERROR: "+e);
		}
	});
	
	$("input#countryName").keyup(function() {
		$("#suggCountry").html("");
		var newSugg =[];
		if( this.value.length < 4 ) return;
		var inpCountry = this.value;
		for(var i=0;i<countryList.length;i++){
			if((countryList[i].toUpperCase()).includes(inpCountry.toUpperCase())){
				newSugg.push(countryList[i]);
			}
		}
		if(newSugg.length == 1) {
			fire_ajax_submit(newSugg);
		}
		for(var i=0;i<newSugg.length;i++){
			$('#suggCountry').append('<button class="btn btn-outline-light btn-sm suggestionButton" id="suggButton" value="'+newSugg[i]+'">'+newSugg[i]+'</button>'); 
		}
		
	})
});




function fire_ajax_submit(country) {
	$("#capital").html("");
	$.ajax({
		type:"GET",
		url:"/country?cntry="+country,
		success:function(data) {
			$("#capital").append('<h3>'+data.capital+'</h3>')
			
		},
		error:function(e) {
			console.log("ERROR: "+e);
		}
	});
}