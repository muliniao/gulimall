package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author rocket.zhao
 * @email rocket.zhao@hp.com
 * @date 2020-08-04 09:17:05
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

