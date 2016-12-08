package com.junly.service;

import java.util.List;

import com.junly.model.TbSysUser;

public interface SysUserService extends BaseService<Long, TbSysUser> {
	 List<TbSysUser> selectList();
}
