package com.junly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.junly.model.TbSysUser;
import com.junly.service.SysUserService;

@Controller
@RequestMapping(value = "/user")
public class SysUserController {
	@Autowired
	SysUserService sysUserServiceImplWeb;
	@RequestMapping("/addUser")
	@ResponseBody
	public TbSysUser addUser(Model model) {
		TbSysUser tb = new TbSysUser();
		tb.setUsername("lijun");
		tb.setPassword("123456");
		tb.setPhone("13429600230");
		sysUserServiceImplWeb.save(tb);
		return tb;
	}
	
	
	@RequestMapping("/getAllUser")
	@ResponseBody
	public List<TbSysUser> getAllUser(Model model) {
		List<TbSysUser> selectList = sysUserServiceImplWeb.selectList();
		return selectList;
	}
}
