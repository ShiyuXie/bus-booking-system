package com.aprilxie.bbs.dto;

import java.util.ArrayList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class TripScheduleDto {
	private String Id;
	private String tripDate;
	private int availableSeats;
	private String tripDetailCode;
	private ArrayList<String> ticketsSoldCode;
}
