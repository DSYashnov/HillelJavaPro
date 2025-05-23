create table  Homework (
                           `id` int not null auto_increment,
                           `name` varchar(45) not null,
                           `description` varchar(225) not null,
                           PRIMARY KEY (`id`));

create table Lesson (
                        `id` int not null auto_increment,
                        `name` varchar(45) not null,
                        updatedAt varchar(255) not null,
                        `homework_id` int not null unique,
                        PRIMARY KEY (`id`),
                        FOREIGN KEY (homework_id) REFERENCES Homework(id)
);

CREATE TABLE Schedule (
                          id INT NOT NULL AUTO_INCREMENT,
                          name VARCHAR(100) NOT NULL,
                          updatedAt VARCHAR(255) NOT NULL,
                          PRIMARY KEY (id)
);

CREATE TABLE Schedule_Lesson (
                                 schedule_id INT NOT NULL,
                                 lesson_id INT NOT NULL,
                                 PRIMARY KEY (schedule_id, lesson_id),
                                 FOREIGN KEY (schedule_id) REFERENCES Schedule(id),
                                 FOREIGN KEY (lesson_id) REFERENCES Lesson(id)
);
INSERT INTO Schedule (name, updatedAt)
VALUES ('Понеділок', '2025-05-19');

INSERT INTO Lesson (name, updatedAt, homework_id)
VALUES ('Математика', '2025-05-18', 1);

INSERT INTO homework (name, description)
VALUES ('Домашка з математики', 'Вирішити 10 задач');

SELECT * FROM homework;

INSERT INTO lesson (name, updatedAt, homework_id)
VALUES ('Математика', '2025-05-19', 1);

INSERT INTO Schedule_Lesson (schedule_id, lesson_id)
VALUES (1, 1);

select * from schedule;