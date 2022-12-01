
create table 
tb_user(
   id int not null auto_increment,
   username varchar(255),
   password varchar(255),
   status int,
   token double,
   primary key(id)
   );



create table 
tb_car(
   id int not null auto_increment,
   name varchar(255),
   model varchar(255),
   dt_Fabrication date,
   value double,
   primary key(id)
   );

--describe tb_user


SELECT * FROM tb_user



