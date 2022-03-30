create table drivers_tariffs
(
    drivers_id bigint not null
        constraint fksaaopva1qjpskokhra4wwdv3n
            references drivers,
    tariffs_id bigint not null
        constraint fkmkcph4ybv5wp6spvp0obrw357
            references tariffs
);

alter table drivers_tariffs
    owner to postgres;

