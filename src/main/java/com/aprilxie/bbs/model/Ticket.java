package com.aprilxie.bbs.model;

import com.aprilxie.bbs.model.user.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class Ticket {

	private String Id;
	private int seatNumber;
	private Boolean cancellable;
	private String journeyDate;
	private User passenger;
	private TripSchedule tripSchedule;
	
}
