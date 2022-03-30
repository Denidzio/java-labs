create table orders_services
(
    orders_id   bigint not null
        constraint fkc48l84md8y5o0nub8vy8gxtec
            references orders,
    services_id bigint not null
        constraint fktf3befn48p2sqt2k9qbs1cso3
            references services
);

alter table orders_services
    owner to postgres;

