CREATE TABLE public.schedule_template (
                                          id character varying(32) DEFAULT replace((public.uuid_generate_v4())::text, '-'::text, ''::text) NOT NULL,
                                          creation_date timestamp with time zone DEFAULT CURRENT_TIMESTAMP
);