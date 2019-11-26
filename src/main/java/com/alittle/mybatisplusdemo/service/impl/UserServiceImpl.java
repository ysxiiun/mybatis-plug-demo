package com.alittle.mybatisplusdemo.service.impl;

import com.alittle.mybatisplusdemo.model.User;
import com.alittle.mybatisplusdemo.dao.UserMapper;
import com.alittle.mybatisplusdemo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ysx
 * @since 2019-11-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
