-- auto-generated definition
create table user
(
    id           bigint auto_increment
        primary key,
    username     varchar(256)                        null,
    userAccount  varchar(256)                        null,
    avatarUrl    varchar(1024)                       null,
    gender       tinyint                             null,
    userPassword varchar(256)                        null,
    phone        varchar(128)                        null,
    email        varchar(256)                        null,
    userStatus   int       default 0                 null,
    createTime   datetime                            null,
    updateTime   timestamp default CURRENT_TIMESTAMP null,
    isDelete     tinyint   default 0                 null,
    userRole     int       default 0                 not null comment '0-普通用户  1-管理员',
    planetCode   varchar(512)                        null comment '星球编号'
)
    comment '用户';



-- auto-generated definition
create table tag
(
    id         bigint auto_increment
        primary key,
    tagName    varchar(256)                        null,
    userId     bigint                              null,
    parentId   bigint                              null,
    isParent   tinyint                             null,
    createTime datetime                            not null comment '创建时间',
    updateTime timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP,
    isDelete   tinyint   default 0                 null,
    constraint uniIdx_tagName
        unique (tagName)
)
    comment '标签' charset = utf8;

create index idx_userId
    on tag (userId);

