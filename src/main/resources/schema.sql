drop table if exists animal;

create table owner(
    id BIGINT primary key auto_increment,
    name VARCHAR
);

create table stable(
    id BIGINT primary key auto_increment
);

create table animal(
    id BIGINT primary key auto_increment,
    name VARCHAR,
    age INT,
    species VARCHAR,
    lays_eggs BOOLEAN,
    owner_id BIGINT,
    stable_id BIGINT,
    FOREIGN KEY (stable_id) references stable,
    FOREIGN KEY (owner_id) references owner
);

-- create table ponies(
--     id BIGINT primary key auto_increment,
--     name VARCHAR,
--     age INT,
--     owner_id BIGINT,
--     FOREIGN KEY (owner_id) references owner
-- );