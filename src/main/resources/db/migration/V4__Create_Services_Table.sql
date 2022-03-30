create table services
(
    id          bigint not null
        primary key,
    created_at  timestamp,
    description varchar(255),
    updated_at  timestamp,
    name        varchar(255),
    price       real
);

alter table services
    owner to postgres;

