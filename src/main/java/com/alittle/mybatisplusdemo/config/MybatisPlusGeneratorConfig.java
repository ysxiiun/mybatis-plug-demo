package com.alittle.mybatisplusdemo.config;

import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusGeneratorConfig {

	@Value("${spring.datasource.url}")
	private String url;

	@Value("${spring.datasource.driver-class-name}")
	private String driveName;

	@Value("${spring.datasource.username}")
	private String username;

	@Value("${spring.datasource.password}")
	private String password;

	@Bean
	public GlobalConfig globalConfig() {
		GlobalConfig globalConfig = new GlobalConfig();
		globalConfig.setAuthor("ysx");
		globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
		globalConfig.setOpen(false);

		return globalConfig;
	}

	@Bean
	public DataSourceConfig dataSourceConfig() {
		DataSourceConfig dataSourceConfig = new DataSourceConfig();
		dataSourceConfig.setUrl(this.url);
		dataSourceConfig.setDriverName(this.driveName);
		dataSourceConfig.setUsername(this.username);
		dataSourceConfig.setPassword(this.password);

		return dataSourceConfig;
	}

	@Bean
	public PackageConfig packageConfig() {
		PackageConfig packageConfig = new PackageConfig();
		packageConfig.setParent("com.alittle.mybatisplusdemo")
				.setController("controller")
				.setEntity("model")
				.setMapper("dao")
				.setService("service")
				.setServiceImpl("service.impl")
				.setXml("mapper");

		return packageConfig;
	}
}
