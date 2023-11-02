CREATE DATABASE `yaho`;

USE `yaho`;

CREATE TABLE `mountain` (
                            id int UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
                            name char(100) NOT NULL UNIQUE,
                            feature text NOT NULL,
                            course text NOT NULL
);


CREATE TABLE `member`(
                         id int UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
                         userId char(100) NOT NULL UNIQUE,
                         `password` char(100) NOT NULL,
                         nowDateTime datetime NOT NULL,
                         gender char(100) NOT null
);

INSERT INTO `member`
SET nowDateTime = NOW(),
userId = '경현잉',
`password` = '11',
gender = '남자';

INSERT INTO `member`
SET nowDateTime = NOW(),
userId = '병근잉',
`password` = '11',
gender = '남자';

INSERT INTO `member`
SET nowDateTime = NOW(),
userId = '조은잉',
`password` = '11',
gender = '여자';

CREATE TABLE `review`(
                         id int UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
                         title text NOT NULL,
                         content text NOT NULL,
                         userId char(100) NOT NULL UNIQUE
);

SELECT * FROM `member`;
DESC `member`;

DELETE FROM `member` WHERE id = 6;
DROP TABLE `member`;

SELECT * FROM `mountain`;
DESC `mountain`;

SELECT * FROM `review`;
DESC `review`;