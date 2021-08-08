package com.aprilxie.bbs.utils;

import com.aprilxie.bbs.dto.TripDto;
import com.aprilxie.bbs.model.Trip;

public class TripMapper {
	public static TripDto toTripDto(Trip trip) {
		
		return new TripDto()
				.setId(trip.getId())
				.setFare(trip.getFare())
				.setJourneyTime(trip.getJourneyTime())
				.setSrcStopCode(trip.getSrcStop().getCode())
				.setDestStopCode(trip.getDestStop().getCode())
				.setBusCode(trip.getBus().getCode())
				.setAgencyCode(trip.getAgency().getCode())
				;
	}
}
