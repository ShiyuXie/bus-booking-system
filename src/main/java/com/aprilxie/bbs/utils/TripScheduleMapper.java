package com.aprilxie.bbs.utils;

import java.util.ArrayList;

import com.aprilxie.bbs.dto.TripScheduleDto;
import com.aprilxie.bbs.model.Ticket;
import com.aprilxie.bbs.model.TripSchedule;

public class TripScheduleMapper {
	public static TripScheduleDto toTripScheduleDto(TripSchedule tripSchedule) {
		ArrayList<String> ticketsSoldCode = new ArrayList<>();
		for(Ticket ticket : tripSchedule.getTicketsSold()) {
			ticketsSoldCode.add(ticket.getId());
		}
		
		return new TripScheduleDto()
				.setId(tripSchedule.getId())
				.setTripDate(tripSchedule.getTripDate())
				.setAvailableSeats(tripSchedule.getAvailableSeats())
				.setTripDetailCode(tripSchedule.getTripDetail().getId())
				.setTicketsSoldCode(ticketsSoldCode)
				;
	}
}
