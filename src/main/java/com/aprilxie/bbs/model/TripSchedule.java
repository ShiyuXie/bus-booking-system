package com.aprilxie.bbs.model;

import java.util.ArrayList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TripSchedule {
	private String Id;
	private String tripDate;
	private int availableSeats;
	private Trip tripDetail;
	private ArrayList<Ticket> ticketsSold;

	
}
