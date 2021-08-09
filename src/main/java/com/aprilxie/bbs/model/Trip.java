package com.aprilxie.bbs.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class Trip {
	private String Id;
	private int fare;
	private String journeyTime;
	private Stop srcStop;
	private Stop destStop;
	private Agency agency;
	private Bus bus;
}
