package com.aprilxie.bbs.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Trip {
	private String Id;
	private int fare;
	private String journeyTime;
	private Stop srcStop;
	private Stop destStop;
	private Agency agency;
	private Bus bus;
}
