package com.github.phy19870227.hyadmin.core.security;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.phy19870227.hyadmin.config.SecurityConfig;
import com.github.phy19870227.hyadmin.dao.base.SysRoleMapper;
import com.github.phy19870227.hyadmin.dao.base.SysUserMapper;
import com.github.phy19870227.hyadmin.dao.base.SysUserRoleMapper;
import com.github.phy19870227.hyadmin.module.po.SysRole;
import com.github.phy19870227.hyadmin.module.po.SysUser;
import com.github.phy19870227.hyadmin.module.po.SysUserRole;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author buhuayang
 */
@Service
public class CustomUserService implements UserDetailsService {

    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        SysUser sysUserSearchEntity = new SysUser();
        sysUserSearchEntity.setAccountName(username);
        SysUser sysUser = sysUserMapper.selectOne(sysUserSearchEntity);
        if (sysUser == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<SysRole> roleList = new ArrayList<>();
        EntityWrapper<SysUserRole> sysUserRoleEntityWrapper = new EntityWrapper<>();
        if (!StringUtils.equals(SecurityConfig.DEFAULT_SUPERADMIN_NAME, sysUser.getAccountName())) {
            sysUserRoleEntityWrapper.eq("user_flow", sysUser.getRecordFlow());
        }
        List<SysUserRole> sysUserRoleList = sysUserRoleMapper.selectList(sysUserRoleEntityWrapper);
        if (sysUserRoleList != null && !sysUserRoleList.isEmpty()) {
            for (SysUserRole userRole : sysUserRoleList) {
                roleList.add(sysRoleMapper.selectById(userRole.getRoleFlow()));
            }
        }
        return new UserDetail(sysUser, roleList);
    }

}
