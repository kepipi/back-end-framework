package com.sztus.lib.back.end.basic.jdbc;

import com.sztus.lib.back.end.basic.object.domain.LoginUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 认证
 *
 * @Author zwp
 * @Date 2022/9/12 16:53
 **/
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 查询用户信息（查询数据库，这里使用假数据）
        if (!username.equals("zwp")) {
            throw new RuntimeException("用户名错误！！！");
        }
        String password = "$2a$10$LqoYe93iSWq9wHKk5DFWoOoalcN25BLIrhnGuhIGRPGHZbnhNqkM2";
        // 查询对应的权限信息（查询数据库，这里使用假数据）
        List<String> list = new ArrayList<>(Arrays.asList("test", "admin"));

        // 把数据封装成LoginUser对象返回
        return new LoginUser(username, password, list);
    }
}
