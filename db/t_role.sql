drop table if exists `t_role`;
CREATE TABLE `t_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT "id",
  `name` varchar(64) DEFAULT NULL COMMENT "角色名，超级管理员等",
  `resource` varchar(4096) NOT NULL COMMENT "资源集合以，隔开",
  `create_time` bigint(20) NOT NULL COMMENT "创建时间",
  `update_time` bigint(20) DEFAULT NULL COMMENT "更新时间",
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;