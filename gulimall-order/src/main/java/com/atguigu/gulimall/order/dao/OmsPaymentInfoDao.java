package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OmsPaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author rocket.zhao
 * @email rocket.zhao@hp.com
 * @date 2020-08-04 10:46:52
 */
@Mapper
public interface OmsPaymentInfoDao extends BaseMapper<OmsPaymentInfoEntity> {
	
}
