package com.fgn.domain.processor;

import org.springframework.batch.item.ItemProcessor;

import com.fgn.domain.Station;

public class StationProcessor implements ItemProcessor<Station, Station>{

	@Override
	public Station process(Station station) throws Exception {
		return new Station();
	}

	
}
