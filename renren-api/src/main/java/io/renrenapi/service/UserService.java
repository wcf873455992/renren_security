/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renrenapi.io
 *
 * 版权所有，侵权必究！
 */

package io.renrenapi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renrenapi.entity.UserEntity;
import io.renrenapi.form.LoginForm;

import java.util.Map;

/**
 * 用户
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface UserService extends IService<UserEntity> {

	UserEntity queryByMobile(String mobile);

	/**
	 * 用户登录
	 * @param form    登录表单
	 * @return        返回登录信息
	 */
	Map<String, Object> login(LoginForm form);
}
