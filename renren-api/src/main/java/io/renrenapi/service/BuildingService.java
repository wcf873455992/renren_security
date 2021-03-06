package io.renrenapi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renrenapi.entity.BuildingEntity;

import java.util.Map;

/**
 * 
 *
 * @author wcf
 * @email 873455992@qq.com
 * @date 2019-08-01 16:57:05
 */
public interface BuildingService extends IService<BuildingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

