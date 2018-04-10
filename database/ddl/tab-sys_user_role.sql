drop table if exists sys_user_role;
create table sys_user_role
(
  record_flow     varchar(32) not null              comment '流水号',
  user_flow       varchar(32) not null              comment '用户流水号',
  role_flow       varchar(32) not null              comment '角色流水号',
  record_status   varchar(2)  not null default '00' comment '记录状态(默认:00)',
  del_flag        varchar(2)  not null default 'N'  comment '删除标记',
  create_datetime varchar(14) not null              comment '创建时间',
  creater_flow    varchar(32)                       comment '创建者流水号',
  modify_datetime varchar(14)                       comment '修改时间',
  modifier_flow   varchar(32)                       comment '修改者流水号'
);
alter table sys_user_role
  add constraint pk_sys_user_role primary key (record_flow);