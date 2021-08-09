package com.aprilxie.bbs.model;

import com.aprilxie.bbs.model.user.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class Agency {
	
	private String Id;
	
	private String code;
	
	private String name;
	
	private String details;
	
	private User owner;	
}
