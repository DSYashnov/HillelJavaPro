create table student (
                         id int auto_increment primary key,
                         first_name varchar(100) not null,
                         last_name varchar(100) not null,
                         date_of_birth timestamp,
                         email varchar(50),
                         student_group varchar(10),
                         country varchar(50)
)