CREATE TABLE public.staff (
                              id character varying(32) DEFAULT replace((public.uuid_generate_v4())::text, '-'::text, ''::text) NOT NULL,
                              employee_name character varying(255) NOT NULL,
                              status character varying(20) NOT NULL,
                              "position" character varying(20) NOT NULL
);
