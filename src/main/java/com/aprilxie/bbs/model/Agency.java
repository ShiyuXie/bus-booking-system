package com.aprilxie.bbs.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Agency {
	
	private String Id;
	
	private String code;
	
	private String name;
	
	private String details;
	
	private User owner;	
}
