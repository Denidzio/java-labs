create table orders
(
    id           bigint not null
        primary key,
    price        real,
    waiting_time real,
    client_id    bigint
        constraint fkm2dep9derpoaehshbkkatam3v
            references clients,
    driver_id    bigint
        constraint fkqohd0dujmkcb12rcjy4b1fj4u
            references drivers,
    tariff_id    bigint
        constraint fkjqfqg1m4y9bjrxovw7mw5ost5
            references tariffs
);

alter table orders
    owner to postgres;

