package com.alittle.mybatisplusdemo;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 配置MybatisPlus的逆向工程
 *
 * @author ysx
 * @since 2019-11-26
 */
public class MybatisPlusGenerator {

	public static void main(String[] args) {
		AutoGenerator autoGenerator = new AutoGenerator();

		/*
		设置基本信息
		 */
		autoGenerator.setGlobalConfig(new GlobalConfig()
				.setAuthor("ysx")  //作者
				.setOutputDir(System.getProperty("user.dir") + "/src/main/java")  //项目根路径
				.setOpen(false)
		);

		/*
		数据库连接配置
		 */
		autoGenerator.setDataSource(new DataSourceConfig()
				.setUrl("jdbc:mysql://localhost:3306/mybatis-plus-demo")
				.setDriverName("com.mysql.jdbc.Driver")
				.setUsername("root")
				.setPassword("root")
		);

		/*
		包配置
		 */
		autoGenerator.setPackageInfo(new PackageConfig()
				.setParent("com.alittle.mybatisplusdemo")  //根包路径
				.setController("controller")  //controller层
				.setEntity("model")  //实体层
				.setMapper("dao")  //mapper接口包
				.setService("service")  //service层
				.setServiceImpl("service.impl")  //service的实现层
				.setXml("mapper")  //xml文件
		);

		/*
		策略配置
		 */
		autoGenerator.setStrategy(new StrategyConfig()
				.setNaming(NamingStrategy.underline_to_camel)  //数据库下划线命名转驼峰命名
				.setTablePrefix("tb_", "rle_")  //取消数据库前缀
		);

		autoGenerator.execute();
	}
}
