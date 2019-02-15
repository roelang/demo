CREATE TABLE IF NOT EXISTS contact
(
	id serial primary key NOT NULL,
	first_name text NOT NULL,
	last_name text NOT NULL,
	gender text not null,
	phone_number text,
	dob date not null,
	email text,
	active boolean NOT NULL DEFAULT true
);

INSERT INTO public.contact(
	first_name, last_name, gender, phone_number, dob, email)
VALUES ('Esther', 'Chavez', 'Female', '(954) 751-9869', '04-29-2016', 'echavez867@zevahcrehtse.com'),
			 ('Kayla', 'Goodman', 'Female', '(703) 989-6372', '06-04-1999', 'kgoodman334@namdoogalyak.biz'),
			 ('Marie', 'Waters','Female', '(535) 802-2604', '02-13-1993', 'mwaters474@sretaweiram.biz'),
			 ('Skyler', 'Peters', 'Male', '(417) 994-6461', '06-23-1935', 'speters459@sreteprelyks.net'),
			 ('Gabriela', 'Lynch', 'Female', '(286) 433-7342', '05-28-1925', 'glynch290@hcnylaleirbag.biz');
