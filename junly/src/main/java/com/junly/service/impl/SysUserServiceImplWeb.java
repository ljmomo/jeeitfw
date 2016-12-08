package com.junly.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.junly.dao.TbSysUserMapper;
import com.junly.model.TbSysUser;
import com.junly.service.SysUserService;
@Service
public class SysUserServiceImplWeb implements SysUserService{
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
		/*PageHelper.startPage(1, 2);
		List<TbSysUser> selectList = tbSysUserMapper.selectList();
		PageInfo<TbSysUser> page = new PageInfo<TbSysUser>(selectList);
		System.out.println(page.toString());*/
		List<TbSysUser> selectList = tbSysUserMapper.selectList2(new RowBounds(1,2));
		return selectList;
	}

}
