package com.aprilxie.bbs.utils;

import com.aprilxie.bbs.dto.AgencyDto;
import com.aprilxie.bbs.model.Agency;

public class AgencyMapper {
	public static AgencyDto toAgencyDto(Agency agency) {
		
		return new AgencyDto()
				.setId(agency.getId())
				.setCode(agency.getCode())
				.setName(agency.getName())
				.setDetails(agency.getDetails())
				.setOwnerCode(agency.getOwner().getId())
				;
	}
	
}
