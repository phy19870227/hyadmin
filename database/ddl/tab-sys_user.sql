drop table if exists sys_user;
create table sys_user
(
  record_flow     varchar(32)  not null              comment '流水号',
  account_name    varchar(20)  not null              comment '账户名',
  account_pwd     varchar(100)                       comment '账户密码',
  record_status   varchar(2)   not null default '00' comment '记录状态(默认:00)',
  del_flag        varchar(2)   not null default 'N'  comment '删除标记',
  create_datetime varchar(14)  not null              comment '创建时间',
  creater_flow    varchar(32)                        comment '创建者流水号',
  modify_datetime varchar(14)                        comment '修改时间',
  modifier_flow   varchar(32)                        comment '修改者流水号'
);
alter table sys_user
  add constraint pk_sys_user primary key (record_flow);