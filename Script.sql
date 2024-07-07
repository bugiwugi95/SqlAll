create table if not exists FirstLast(
id Integer PRIMARY KEY autoincrement, 
first_name varchar(20) NOT NULL,
last_name varchar(20) NOT null
);
 insert into FirstLast (first_name,last_name) values 
 ("alex","looc"),
 ("crishtiano","ronaldo"),
 ("roberto","carlos"),
 ("leo","messi"),
 ("axmed","musa"),
 ("serhio","ramos"),
 ("lev","yshin"),
 ("abdu","dida"),
 ("kaka","rodrigez"),
 ("ilia","bugay");

select * from FirstLast ;
select first_name ,substring(first_name,1,3) from FirstLast;
select * from FirstLast limit (5);
delete from FirstLast where id > 10;





 
