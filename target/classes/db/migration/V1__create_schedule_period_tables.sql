CREATE TABLE public.schedule_period (
                                        id character varying(32) DEFAULT replace((public.uuid_generate_v4())::text, '-'::text, ''::text) NOT NULL,
                                        slot_id character varying(32) NOT NULL,
                                        schedule_id character varying(32) NOT NULL,
                                        slot_type character varying(20) NOT NULL,
                                        administrator_id character varying(32) NOT NULL,
                                        executor_id character varying(32)
);