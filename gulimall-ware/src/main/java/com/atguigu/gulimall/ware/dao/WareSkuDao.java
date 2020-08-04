package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author rocket.zhao
 * @email rocket.zhao@hp.com
 * @date 2020-08-04 11:19:32
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
