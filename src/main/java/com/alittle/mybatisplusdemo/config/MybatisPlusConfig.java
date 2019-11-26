package com.alittle.mybatisplusdemo.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {

	/**
	 * 配置分页插件使用的数据库类型
	 *
	 * @return paginationInterceptor
	 * @author ysx
	 * @since 2019-11-26
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
		paginationInterceptor.setDialectType("mysql");

		return paginationInterceptor;
	}
}
