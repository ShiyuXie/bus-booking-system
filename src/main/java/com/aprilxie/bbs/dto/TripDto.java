package com.aprilxie.bbs.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class TripDto {
	private String Id;
	private int fare;
	private String journeyTime;
	private String srcStopCode;
	private String destStopCode;
	private String agencyCode;
	private String busCode;
}
