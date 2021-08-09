package com.aprilxie.bbs.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class Bus {
	private String Id;
	
	private String code;
	
	private int capacity;
	
	private String make;
	
	private Agency agency;
	
}
