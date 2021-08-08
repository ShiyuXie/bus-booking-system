package com.aprilxie.bbs.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class BusDto {
	private String Id;
	
	private String code;
	
	private int capacity;
	
	private String make;
	
	private String agencyCode;
}
