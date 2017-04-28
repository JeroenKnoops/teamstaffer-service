CREATE SEQUENCE hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE staff_member (
	id bigint NOT NULL DEFAULT nextval('hibernate_sequence'),
	created timestamp NOT NULL DEFAULT now(),
	name character varying(256) NOT NULL,
	sur_name character varying(256) NOT NULL
);

CREATE TABLE activity (
	activity_name character varying(256) NOT NULL,
	project_number character varying(256) NOT NULL,
	domain character varying(256) NOT NULL,
	phase character varying(256) NOT NULL
);

CREATE TABLE assignment (
	id bigint NOT NULL DEFAULT nextval('hibernate_sequence'),
	created timestamp NOT NULL DEFAULT now(),
	assignment_name character varying(256) NOT NULL,
	project_number character varying(256) NOT NULL,
	domain character varying(256) NOT NULL,
	phase character varying(256) NOT NULL
);

CREATE TABLE availability (
	id bigint NOT NULL DEFAULT nextval('hibernate_sequence'),
	created timestamp NOT NULL DEFAULT now(),
	activity_name character varying(256) NOT NULL,
	project_number character varying(256) NOT NULL,
	domain character varying(256) NOT NULL,
	phase character varying(256) NOT NULL
);


CREATE TABLE allocation (
	id bigint NOT NULL DEFAULT nextval('hibernate_sequence'),
	created timestamp NOT NULL DEFAULT now(),
	activity_name character varying(256) NOT NULL,
	project_number character varying(256) NOT NULL,
	domain character varying(256) NOT NULL,
	phase character varying(256) NOT NULL
);