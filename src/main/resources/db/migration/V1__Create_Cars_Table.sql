create table cars
(
    id            bigint not null
        primary key,
    created_at    timestamp,
    description   varchar(255),
    updated_at    timestamp,
    license_plate varchar(255),
    model         varchar(255)
);

alter table cars
    owner to postgres;

