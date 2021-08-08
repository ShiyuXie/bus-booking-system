package com.aprilxie.bbs.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class TicketDto {
	private String Id;
	private int seatNumber;
	private boolean cancellable;
	private String journeyDate;
	private String passengerCode;
	private String tripScheduleCode;
}
