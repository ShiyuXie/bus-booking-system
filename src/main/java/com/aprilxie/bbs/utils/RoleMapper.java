package com.aprilxie.bbs.utils;

import com.aprilxie.bbs.dto.RoleDto;
import com.aprilxie.bbs.model.Role;

public class RoleMapper {
	public static RoleDto toRoleDto(Role role) {
		return new RoleDto()
				.setId(role.getId())
				.setRole(role.getRole())
				;
	}
}
