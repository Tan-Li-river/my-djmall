package com.qz.djmall.sale.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.sale.entity.SmsHomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 17:00:56
 */
public interface SmsHomeSubjectSpuService extends IService<SmsHomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

