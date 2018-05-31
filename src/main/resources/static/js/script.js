$(document).ready(function () {
	$("#searchButton").click(function() {
		fire_ajax_submit();
	});
});


function fire_ajax_submit() {
	var country = '';
	country = $("#countryName").val();
	$.ajax({
		type:"GET",
		url:"/country?cntry="+country,
		success:function(data) {
			console.log(data.capital);
			$("#capital").append('<h3>'+data.capital+'</h3>')
			
		},
		error:function(e) {
			console.log("ERROR: "+e);
		}
	});
}