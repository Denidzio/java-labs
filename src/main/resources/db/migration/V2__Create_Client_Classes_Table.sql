create table client_classes
(
    id               bigint not null
        primary key,
    created_at       timestamp,
    description      varchar(255),
    updated_at       timestamp,
    discount         real,
    min_trips_number integer,
    name             varchar(255)
);

alter table client_classes
    owner to postgres;

