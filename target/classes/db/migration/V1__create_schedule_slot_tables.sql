CREATE TABLE public.schedule_slot (
                                      id character varying(32) DEFAULT replace((public.uuid_generate_v4())::text, '-'::text, ''::text) NOT NULL,
                                      schedule_template_id character varying(32) NOT NULL,
                                      begin_time time with time zone NOT NULL,
                                      end_time time with time zone NOT NULL
);