package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.HaixianDao;
import com.entity.HaixianEntity;
import com.service.HaixianService;
import com.entity.view.HaixianView;

/**
 * 海鲜表 服务实现类
 * @since 2021-03-08
 */
@Service("haixianService")
@Transactional
public class HaixianServiceImpl extends ServiceImpl<HaixianDao, HaixianEntity> implements HaixianService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<HaixianView> page =new Query<HaixianView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
