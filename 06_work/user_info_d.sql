CREATE TABLE `user_info_d` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `birth_day` date DEFAULT NULL COMMENT '出生日期',
  `addr` varchar(255) DEFAULT NULL COMMENT '住址',
  `sex` varchar(2) DEFAULT NULL COMMENT '性别：0女，1男',
  `tell` varchar(20) DEFAULT NULL COMMENT '电话号码',
  `crt_time` datetime DEFAULT NULL COMMENT '创建时间',
  `upd_time` datetime DEFAULT NULL COMMENT '修改时间',
  `creater` varchar(255) DEFAULT NULL COMMENT '创建人',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_primary_key_id` (`id`) USING HASH COMMENT '主键id'
) ENGINE=InnoDB DEFAULT CHARSET=utf32;