package com.github.phy19870227.hyadmin.tests;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.phy19870227.hyadmin.Application;
import com.github.phy19870227.hyadmin.core.GlobalContent;
import com.github.phy19870227.hyadmin.dao.base.SysUserMapper;
import com.github.phy19870227.hyadmin.module.po.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTests {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    public void contextLoads() {
        SysUser sysUser = sysUserMapper.selectById("1");
        System.out.println(sysUser);
        sysUser.setDelFlag(GlobalContent.FLAG_N);
        sysUserMapper.updateById(sysUser);
    }

}
