package com.learn.dao;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.learn.modal.CountryCapital;

public class CountryLoadDao {
	
	public static Map<String,String> loadCountry(){
		Map<String,String> countryMap = new HashMap<String,String>();
		ObjectMapper mapper = new ObjectMapper();
		
		 /**
         * Read JSON from a file into a Map
         */
        try {
            
            byte[] mapData = Files.readAllBytes(Paths.get("src/main/resources/static/json/country-by-capital-city.json"));
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);  
            List<CountryCapital> myObjects = mapper.readValue(mapData , new TypeReference<List<CountryCapital>>(){});
            
            for(CountryCapital cc : myObjects) {
            	countryMap.put(cc.getCountry(), cc.getCity());
            }

 
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
		return countryMap;
	}
	

}
