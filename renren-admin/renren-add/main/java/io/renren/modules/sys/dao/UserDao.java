package io.renren.modules.sys.dao;

import io.renren.modules.sys.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-06-16 18:35:02
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	
}
