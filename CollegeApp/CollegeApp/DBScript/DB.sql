CREATE TABLE `student_table` (
  `id` int(11) NOT NULL auto_increment,
  `student_name` varchar(100) NOT NULL,
  `gender` varchar(10) default NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(20) default NULL,
  `phone` bigint(20) default NULL,
  `branch` varchar(100) NOT NULL,
  `marks` int(11) NOT NULL, 
  `attend` int(11) NOT NULL,  
 PRIMARY KEY  (`id`)
) ;

