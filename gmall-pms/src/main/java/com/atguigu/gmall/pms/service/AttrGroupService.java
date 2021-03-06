package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author LIKAI
 * @email 247837111@qq.com
 * @date 2020-07-21 20:59:22
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

