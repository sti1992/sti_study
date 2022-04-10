CREATE TABLE `order_info_d` (
  `id` int(11) NOT NULL COMMENT 'id',
  `order_id` int(11) DEFAULT NULL COMMENT '定单id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `prod_id` int(11) DEFAULT NULL COMMENT '商品id',
  `prod_name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `prod_cnt` int(255) DEFAULT NULL COMMENT '商品数量',
  `prod_price_per` decimal(16,2) DEFAULT NULL COMMENT '单价',
  `total_price` decimal(10,2) DEFAULT NULL COMMENT '总价',
  `crt_time` datetime DEFAULT NULL COMMENT '创建时间',
  `upd_time` datetime DEFAULT NULL COMMENT '更新时间',
  `creater` varchar(20) DEFAULT NULL COMMENT '创建人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf32;