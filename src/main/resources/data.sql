insert into `user`(user_id, pwd)
select 'admin', '1234qwer' from dual
where not exists(
	select * from `user`
	where user_id='admin' and pwd='1234qwer'
);

insert into `user`(user_id,pwd)
select 'user_1', '1234qwer' from dual
where not exists(
	select * from `user`
	where user_id='user_1' and pwd='1234qwer'
);