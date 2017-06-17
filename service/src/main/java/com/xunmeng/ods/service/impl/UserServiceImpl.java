package com.xunmeng.ods.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xunmeng.ods.entity.User;
import com.xunmeng.ods.mapper.UserMapper;
import com.xunmeng.ods.service.IUserService;

/**
 * <p>
 * zeus用户中心，用户表 服务实现类
 * </p>
 *
 * @author Yanghu
 * @since 2017-06-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
