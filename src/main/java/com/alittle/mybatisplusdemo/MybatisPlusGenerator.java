package com.alittle.mybatisplusdemo;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class MybatisPlusGenerator {

	public static void main(String[] args) {
		AutoGenerator autoGenerator = new AutoGenerator();

		autoGenerator.setGlobalConfig(new GlobalConfig()
				.setAuthor("ysx")
				.setOutputDir(System.getProperty("user.dir") + "/src/main/java")
				.setOpen(false)
		);

		autoGenerator.setDataSource(new DataSourceConfig()
				.setUrl("jdbc:mysql://localhost:3306/mybatis-plus-demo")
				.setDriverName("com.mysql.jdbc.Driver")
				.setUsername("root")
				.setPassword("root")
		);

		autoGenerator.setPackageInfo(new PackageConfig()
				.setParent("com.alittle.mybatisplusdemo")
				.setController("controller")
				.setEntity("model")
				.setMapper("dao")
				.setService("service")
				.setServiceImpl("service.impl")
				.setXml("mapper")
		);

		autoGenerator.setStrategy(new StrategyConfig()
				.setNaming(NamingStrategy.underline_to_camel)
				.setTablePrefix("tb_", "rle_")
		);

		autoGenerator.execute();
	}
}
