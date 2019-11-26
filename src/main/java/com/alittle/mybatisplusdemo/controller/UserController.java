package com.alittle.mybatisplusdemo.controller;


import com.alittle.mybatisplusdemo.model.User;
import com.alittle.mybatisplusdemo.service.IUserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
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

	/**
	 * 获取用户列表
	 *
	 * @return 字符串
	 * @author ysx
	 * @since 2019-11-26
	 * @deprecated 测试使用
	 */
	@GetMapping(value = "/list/test")
	public String getUserList() {
		IPage<User> userIPage = new Page<>(1, 10, true);
		IPage<User> page = userService.lambdaQuery().page(userIPage);

		return page.getRecords().toString() + "\n" + page.getTotal();
	}
}

