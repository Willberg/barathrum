drop table if exists `t_user`;
CREATE TABLE `t_user` (
  `uid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT "uid",
  `user_name` varchar(64) NOT NULL COMMENT "用户名",
  `phone_number` varchar(20) DEFAULT NULL COMMENT "手机号",
  `password` varchar(64) NOT NULL COMMENT "密码",
  `email` varchar(64) DEFAULT NULL COMMENT "邮箱",
  `type` tinyint(4) COMMENT "类别 1-- admin, 2-- user",
  `role` int(10) COMMENT "角色",
  `create_time` bigint(20) NOT NULL COMMENT "创建时间",
  `update_time` bigint(20) DEFAULT NULL COMMENT "更新时间",
  `status` tinyint(4) NOT NULL COMMENT "状态 0-- 已注销删除",
  PRIMARY KEY (`uid`),
  UNIQUE KEY(`user_name`),
  KEY(`phone_number`),
  KEY(`email`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;