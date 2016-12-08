package com.junly.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junly.dao.TbSysUserMapper;
import com.junly.model.TbSysUser;
import com.junly.service.SysUserService;
@Service
public class SysUserServiceImplApp implements SysUserService{
	@Autowired
	TbSysUserMapper tbSysUserMapper;
	
	@Override
	public int save(TbSysUser v) {
		return tbSysUserMapper.insertSelective(v);
	}

	@Override
	public int update(TbSysUser v) {
		return tbSysUserMapper.updateByPrimaryKeySelective(v);
	}

	@Override
	public int delete(Long k) {
		return tbSysUserMapper.deleteByPrimaryKey(k);
	}

	@Override
	public TbSysUser selectById(Long k) {
		return tbSysUserMapper.selectByPrimaryKey(k);
	}

	@Override
	public List<TbSysUser> selectList() {
		return null;
	}

}
