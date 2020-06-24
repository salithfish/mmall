package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * @Auther: fang
 * @Dec:
 * @Date: crate in 3:25 下午2020/6/24
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);
}
