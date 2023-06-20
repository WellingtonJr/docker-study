CREATE DATABASE IF NOT EXISTS db_gepex
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.UTF-8'
    LC_CTYPE = 'en_US.UTF-8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
USE db_gepex;

-- Table: public.tb_usuario

-- DROP TABLE IF EXISTS public.tb_usuario;

CREATE TABLE IF NOT EXISTS public.tb_usuario
(
    id uuid NOT NULL,
    password character varying(255) COLLATE pg_catalog."default",
    username character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT tb_usuario_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.tb_usuario
    OWNER to postgres;

INSERT INTO public.tb_usuario
(id, "password", username)
VALUES('48a9223e-4fd5-45f8-8551-f82c9fbd27cb'::uuid, '$2a$12$wqyDIKK96gSQwYqpFgkp2.dP/79x1URZvzIbvFwFoy72fucfB4Fw2', 'well');
