create table tariffs
(
    id                  bigint not null
        primary key,
    created_at          timestamp,
    description         varchar(255),
    updated_at          timestamp,
    min_price           real,
    name                varchar(255),
    price_per_kilometer real
);

alter table tariffs
    owner to postgres;

