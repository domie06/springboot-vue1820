package com.dao;

import com.entity.HaixianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HaixianView;

/**
 * 海鲜表 Dao 接口
 *
 * @since 2021-03-08
 */
public interface HaixianDao extends BaseMapper<HaixianEntity> {

   List<HaixianView> selectListView(Pagination page, @Param("params") Map<String, Object> params);

}
