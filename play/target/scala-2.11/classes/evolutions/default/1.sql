# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table login (
  email                         varchar(255),
  password                      varchar(255)
);

create table query (
  id                            bigint not null,
  name                          varchar(255),
  email                         varchar(255),
  age                           integer,
  gender                        varchar(255),
  constraint pk_query primary key (id)
);
create sequence query_seq;

create table user (
  id                            bigint not null,
  name                          varchar(255),
  email                         varchar(255),
  age                           integer,
  password                      varchar(255),
  gender                        varchar(255),
  constraint pk_user primary key (id)
);
create sequence user_seq;


# --- !Downs

drop table if exists login;

drop table if exists query;
drop sequence if exists query_seq;

drop table if exists user;
drop sequence if exists user_seq;

