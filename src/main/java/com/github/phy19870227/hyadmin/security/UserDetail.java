package com.github.phy19870227.hyadmin.security;

import com.github.phy19870227.hyadmin.config.SecurityConfig;
import com.github.phy19870227.hyadmin.module.po.SysRole;
import com.github.phy19870227.hyadmin.module.po.SysUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author buhuayang
 */
public class UserDetail implements UserDetails {

    private SysUser sysUser;

    private List<SysRole> sysRoleList;

    public UserDetail(SysUser sysUser, List<SysRole> sysRoleList) {
        this.sysUser = sysUser;
        this.sysRoleList = sysRoleList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (SysRole role : sysRoleList) {
            authorities.add(new SimpleGrantedAuthority(SecurityConfig.DEFAULT_ROLE_PREFIX + role.getRoleCode()));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return sysUser.getAccountPwd();
    }

    @Override
    public String getUsername() {
        return sysUser.getAccountName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
