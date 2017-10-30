-- 创建图书表
CREATE TABLE `book` (
  `book_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '图书ID',
  `name` varchar(100) NOT NULL COMMENT '图书名称',
  `number` int(11) NOT NULL COMMENT '馆藏数量',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='图书表'

-- 初始化图书数据
INSERT INTO `book` (`book_id`, `name`, `number`)
VALUES
	(1000, 'Java程序设计', 10),
	(1001, '数据结构', 10),
	(1002, '设计模式', 10),
	(1003, '编译原理', 10)

-- 创建预约图书表
CREATE TABLE `appointment` (
  `book_id` bigint(20) NOT NULL COMMENT '图书ID',
  `student_id` bigint(20) NOT NULL COMMENT '学号',
  `appoint_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '预约时间' ,
  PRIMARY KEY (`book_id`, `student_id`),
  INDEX `idx_appoint_time` (`appoint_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='预约图书表'



-- 创建学生表
CREATE TABLE `student` (
  `student_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '学生ID',
  `name` varchar(100) NOT NULL COMMENT '学生姓名',
  `sex` int(11) NOT NULL COMMENT '学生性别',
  `age` int(11) NOT NULL COMMENT '学生年龄',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='学生表'


-- 初始化学生数据
INSERT INTO `student` (`student_id`, `name`, `sex`,`age`)
VALUES
	(1000100, 'sunny', 1,10),
	(1000101, 'chery', 1,20),
	(1000102, 'mike', 1,30),
	(1000103, 'join', 1,40)