package com.aprilxie.bbs.utils;

import com.aprilxie.bbs.dto.StopDto;
import com.aprilxie.bbs.model.Stop;

public class StopMapper {
	public static StopDto toStopDto(Stop stop) {
		return new StopDto()
				.setId(stop.getId())
				.setCode(stop.getCode())
				.setName(stop.getName())
				.setDetails(stop.getDetails())
				;
	}
}
