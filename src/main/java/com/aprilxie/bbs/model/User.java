package com.aprilxie.bbs.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
	private String Id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private Role role;

	
}
