package com.aprilxie.bbs.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Ticket {

	private String Id;
	private String seatNumber;
	private boolean cancellable;
	private String journeyDate;
	private User passenger;
	private TripSchedule tripSchedule;
	
}
