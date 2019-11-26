package com.alittle.mybatisplusdemo.controller;


import com.alittle.mybatisplusdemo.model.User;
import com.alittle.mybatisplusdemo.service.IUserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.LambdaQueryChainWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ysx
 * @since 2019-11-26
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;

	@GetMapping(value = "/list")
	public String getUserList() {
		IPage<User> userIPage = new Page<>(0, 10, true);
		IPage<User> page = userService.lambdaQuery().page(userIPage);

		return page.getRecords().toString() + "\n" + page.getTotal();
	}
}

