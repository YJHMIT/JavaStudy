create table sacc_frontend.sys_role_menu
(
    id          bigint auto_increment comment 'UUID'
        primary key,
    role_id     bigint                                 not null comment '角色编号',
    menu_id     bigint                                 null comment '菜单编号',
    remarks     varchar(255) default ''                not null comment '备注',
    create_date timestamp    default CURRENT_TIMESTAMP not null,
    create_by   bigint                                 not null comment '创建人ID',
    update_date timestamp    default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP,
    update_by   bigint                                 not null comment '修改人ID',
    del_flag    tinyint      default 0                 not null comment '删除标识'
);