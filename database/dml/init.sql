delete from sys_user_role;
delete from sys_role_resource;
delete from sys_resource;
delete from sys_role;
delete from sys_user;

insert into sys_user (record_flow, account_name, account_pwd, record_status, del_flag, create_datetime)
values ('00000000000000000000000000000001', 'root', '{bcrypt}$2a$10$BczUTecFQ64.q9N6t22q3eKsOvrZsZERzXaiQZfeBttdI6jF1p.bS', '00', 'N', date_format(now(),'%Y%m%d%H%i%s'));
insert into sys_user (record_flow, account_name, account_pwd, record_status, del_flag, create_datetime)
values ('00000000000000000000000000000002', 'user1', '{bcrypt}$2a$10$BczUTecFQ64.q9N6t22q3eKsOvrZsZERzXaiQZfeBttdI6jF1p.bS', '00', 'N', date_format(now(),'%Y%m%d%H%i%s'));
insert into sys_user (record_flow, account_name, account_pwd, record_status, del_flag, create_datetime)
values ('00000000000000000000000000000003', 'user2', '{bcrypt}$2a$10$BczUTecFQ64.q9N6t22q3eKsOvrZsZERzXaiQZfeBttdI6jF1p.bS', '00', 'N', date_format(now(),'%Y%m%d%H%i%s'));

insert into sys_role (record_flow, role_code, role_name, record_status, del_flag, create_datetime)
values ('00000000000000000000000000000001', 'superadmin', '超级管理员', '00', 'N', date_format(now(),'%Y%m%d%H%i%s'));
insert into sys_role (record_flow, role_code, role_name, record_status, del_flag, create_datetime)
values ('00000000000000000000000000000002', 'normal', '普通用户', '00', 'N', date_format(now(),'%Y%m%d%H%i%s'));

insert into sys_user_role (record_flow, user_flow, role_flow, record_status, del_flag, create_datetime)
values (replace(uuid(),'-',''), '00000000000000000000000000000003', '00000000000000000000000000000001', '00', 'N', date_format(now(),'%Y%m%d%H%i%s'));
insert into sys_user_role (record_flow, user_flow, role_flow, record_status, del_flag, create_datetime)
values (replace(uuid(),'-',''), '00000000000000000000000000000002', '00000000000000000000000000000002', '00', 'N', date_format(now(),'%Y%m%d%H%i%s'));

insert into sys_resource (record_flow, resource_name, resource_path, record_status, del_flag, create_datetime)
values ('00000000000000000000000000000001', '机构管理', '/sys-org.htm', '00', 'N', date_format(now(),'%Y%m%d%H%i%s'));
insert into sys_resource (record_flow, resource_name, resource_path, record_status, del_flag, create_datetime)
values ('00000000000000000000000000000002', '资源管理', '/sys-resource.htm', '00', 'N', date_format(now(),'%Y%m%d%H%i%s'));
insert into sys_resource (record_flow, resource_name, resource_path, record_status, del_flag, create_datetime)
values ('00000000000000000000000000000003', '角色管理', '/sys-role.htm', '00', 'N', date_format(now(),'%Y%m%d%H%i%s'));

insert into sys_role_resource (record_flow, role_flow, resource_flow, record_status, del_flag, create_datetime)
values (replace(uuid(),'-',''), '00000000000000000000000000000001', '00000000000000000000000000000001', '00', 'N', date_format(now(),'%Y%m%d%H%i%s'));
insert into sys_role_resource (record_flow, role_flow, resource_flow, record_status, del_flag, create_datetime)
values (replace(uuid(),'-',''), '00000000000000000000000000000001', '00000000000000000000000000000002', '00', 'N', date_format(now(),'%Y%m%d%H%i%s'));
insert into sys_role_resource (record_flow, role_flow, resource_flow, record_status, del_flag, create_datetime)
values (replace(uuid(),'-',''), '00000000000000000000000000000001', '00000000000000000000000000000003', '00', 'N', date_format(now(),'%Y%m%d%H%i%s'));
insert into sys_role_resource (record_flow, role_flow, resource_flow, record_status, del_flag, create_datetime)
values (replace(uuid(),'-',''), '00000000000000000000000000000002', '00000000000000000000000000000001', '00', 'N', date_format(now(),'%Y%m%d%H%i%s'));