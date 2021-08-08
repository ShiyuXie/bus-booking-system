package com.aprilxie.bbs.utils;

import com.aprilxie.bbs.dto.TicketDto;
import com.aprilxie.bbs.model.Ticket;

public class TicketMapper {
	public static TicketDto toTicketDto(Ticket ticket) {
		
		return new TicketDto()
				.setId(ticket.getId())
				.setSeatNumber(ticket.getSeatNumber())
				.setCancellable(ticket.getCancellable())
				.setJourneyDate(ticket.getJourneyDate())
				.setPassengerCode(ticket.getPassenger().getId())
				.setTripScheduleCode(ticket.getTripSchedule().getId())
				;
	}
}
