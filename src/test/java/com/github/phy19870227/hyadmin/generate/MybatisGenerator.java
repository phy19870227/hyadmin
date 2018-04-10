/**
 * Copyright (c) 2017-2020 https://github.com/phy19870227
 */
package com.github.phy19870227.hyadmin.generate;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

/**
 * @author buhuayang
 */
public class MybatisGenerator {

    @Test
    public void generateCode() {
        String packageName = "com.github.phy19870227.hyadmin";
        generateByTables(packageName, "sys_user", "sys_role", "sys_user_role", "sys_resource", "sys_role_resource");
    }

    private void generateByTables(String packageName, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        String dbUrl = "jdbc:mysql://localhost:13306/hyadmin";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("root")
                .setPassword("123456")
                .setDriverName("com.mysql.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true)
                .setEntityLombokModel(false)
                .setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .setSuperServiceImplClass("com.github.phy19870227.hyadmin.core.GeneralBizImpl")
                .setSuperMapperClass("com.github.phy19870227.hyadmin.core.GeneralMapper")
                .setLogicDeleteFieldName("del_flag")
                .setInclude(tableNames);
        config.setActiveRecord(false)
                .setEnableCache(false)
                .setAuthor("buhuayang")
                .setOutputDir("/Users/buhuayang/mycode/hyadmin/src/main/java")
                .setIdType(IdType.UUID)
                .setFileOverride(false);
        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(
                        new PackageConfig().setParent(packageName)
                                .setService(null)
                                .setServiceImpl(null)
                                .setController(null)
                                .setEntity("module.po")
                                .setXml("dao.base.xml")
                                .setMapper("dao.base")
                ).setTemplate(
                        new TemplateConfig().setService(null)
                                .setServiceImpl(null)
                                .setController(null)
                ).execute();
    }

}
