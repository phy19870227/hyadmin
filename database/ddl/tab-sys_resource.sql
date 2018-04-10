drop table if exists sys_resource;
create table sys_resource
(
  record_flow     varchar(32)  not null              comment '流水号',
  resource_name   varchar(50)                        comment '资源名称',
  resource_path   varchar(100)                       comment '资源路径',
  record_status   varchar(2)   not null default '00' comment '记录状态(默认:00)',
  del_flag        varchar(2)   not null default 'N'  comment '删除标记',
  create_datetime varchar(14)  not null              comment '创建时间',
  creater_flow    varchar(32)                        comment '创建者流水号',
  modify_datetime varchar(14)                        comment '修改时间',
  modifier_flow   varchar(32)                        comment '修改者流水号'
);
alter table sys_resource
  add constraint pk_sys_resource primary key (record_flow);