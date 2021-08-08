package com.aprilxie.bbs.utils;

import com.aprilxie.bbs.dto.BusDto;
import com.aprilxie.bbs.model.Bus;

public class BusMapper {
	public static BusDto toBusDto(Bus bus) {
		
		return new BusDto()
				.setId(bus.getId())
				.setCode(bus.getCode())
				.setCapacity(bus.getCapacity())
				.setMake(bus.getMake())
				.setAgencyCode(bus.getAgency().getCode());
	}
}
