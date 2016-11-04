package com.fgn.reader;


import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fgn.domain.Station;
import com.fgn.domain.StationRequest;

public class RESTStationReader implements ItemReader<Station>{

	private static final String API_URI="http://webgispu.wigeogis.com/kunden/omvpetrom/backend/getFsForCountry.php";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Station read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		return fetchStationFromAPI().get(0);
	}
	
	private List<Station> fetchStationFromAPI() {
		StationRequest stationRequest = new StationRequest("ROU", "OMW", "CAR", "NEXTDOOR", "");
		ResponseEntity<Station> resp = restTemplate.postForEntity(API_URI, stationRequest, Station.class);
		resp.getBody();
		return new ArrayList<Station>();
	}

}
