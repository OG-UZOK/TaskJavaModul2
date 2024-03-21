CREATE TABLE public.schedule (
                                 id character varying(32) DEFAULT replace((public.uuid_generate_v4())::text, '-'::text, ''::text) NOT NULL,
                                 schedule_name character varying(255),
                                 creation_date timestamp with time zone DEFAULT CURRENT_TIMESTAMP
);