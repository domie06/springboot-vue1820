package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HaixianEntity;
import java.util.Map;

/**
 * 海鲜表 服务类
 * @since 2021-03-08
 */
public interface HaixianService extends IService<HaixianEntity> {

     PageUtils queryPage(Map<String, Object> params);

}