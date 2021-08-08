package com.aprilxie.bbs.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class AgencyDto {
	private String Id;
	
	private String code;
	
	private String name;
	
	private String details;
	
	private String ownerCode;	
}
