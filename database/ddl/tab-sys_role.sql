drop table if exists sys_role;
create table sys_role
(
  record_flow     varchar(32) not null              comment '流水号',
  role_code       varchar(20) not null              comment '角色编码',
  role_name       varchar(50) not null              comment '角色名称',
  record_status   varchar(2)  not null default '00' comment '记录状态(默认:00)',
  del_flag        varchar(2)  not null default 'N'  comment '删除标记',
  create_datetime varchar(14) not null              comment '创建时间',
  creater_flow    varchar(32)                       comment '创建者流水号',
  modify_datetime varchar(14)                       comment '修改时间',
  modifier_flow   varchar(32)                       comment '修改者流水号'
);
alter table sys_role
  add constraint pk_sys_role primary key (record_flow);