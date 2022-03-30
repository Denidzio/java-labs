create table clients
(
    id              bigint not null
        primary key,
    created_at      timestamp,
    description     varchar(255),
    updated_at      timestamp,
    name            varchar(255),
    client_class_id bigint
        constraint fks69u6radtfp2ifjg30b5qxq8i
            references client_classes
);

alter table clients
    owner to postgres;

