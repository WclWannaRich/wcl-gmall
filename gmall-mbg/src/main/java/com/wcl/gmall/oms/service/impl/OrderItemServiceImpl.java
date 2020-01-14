package com.wcl.gmall.oms.service.impl;

import com.wcl.gmall.oms.entity.OrderItem;
import com.wcl.gmall.oms.mapper.OrderItemMapper;
import com.wcl.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-01-12
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
