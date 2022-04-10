CREATE TABLE `product_info_d` (
  `id` int(11) NOT NULL COMMENT 'id',
  `prod_id` int(11) DEFAULT NULL COMMENT '商品id',
  `prod_name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `prod_type` varchar(20) DEFAULT NULL COMMENT '商品类别',
  `producer_name` varchar(255) DEFAULT NULL COMMENT '生产厂家',
  `prod_price` decimal(10,2) DEFAULT NULL COMMENT '商品价格',
  `crt_time` datetime DEFAULT NULL COMMENT '创建时间',
  `upd_time` datetime DEFAULT NULL COMMENT '更新时间',
  `creater` varchar(20) DEFAULT NULL COMMENT '创建人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf32;