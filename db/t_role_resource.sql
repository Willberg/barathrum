drop table if exists `t_role_resource`;
CREATE TABLE `t_role_resource` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT "id",
  `name` varchar(256) DEFAULT NULL COMMENT "资源名",
  `resource` varchar(512) NOT NULL COMMENT "资源",
  `create_time` bigint(20) NOT NULL COMMENT "创建时间",
  `update_time` bigint(20) DEFAULT NULL COMMENT "更新时间",
  `type` tinyint(4) COMMENT "类别，1-- api, 2-- page",
  `status` tinyint(4) NOT NULL COMMENT "状态 1-- 待审核状态",
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;