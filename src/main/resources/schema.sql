drop table if exists ponies;

create table owner(
    id BIGINT primary key auto_increment,
    name VARCHAR
);

create table ponies(
    id BIGINT primary key auto_increment,
    name VARCHAR,
    age INT,
    owner_id BIGINT,
    FOREIGN KEY (owner_id) references owner
);