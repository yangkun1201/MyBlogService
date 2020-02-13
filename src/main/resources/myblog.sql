CREATE TABLE article (
    id int primary key auto_increment,
    author_id int,
    content longtext,
    content_md longtext,
    create_time bigint,
    modify_time bigint,
    title varchar(255),
    type varchar(255)
)CHARSET=utf8;