create table drivers
(
    id          bigint not null
        primary key,
    created_at  timestamp,
    description varchar(255),
    updated_at  timestamp,
    birth_date  date,
    full_name   varchar(255),
    license     varchar(255),
    car_id      bigint
        constraint fkk3xt9q1jot6100fo7mp0wm2pw
            references cars
);

alter table drivers
    owner to postgres;

