#1
CREATE DATABASE IF NOT EXISTS homework;
USE homework;

CREATE TABLE cqupt_student (
	studentid VARCHAR(10),
	NAME VARCHAR(20),
	sex VARCHAR(2),
	age INT,
	Fee DECIMAL(10,2),
	address VARCHAR(50),
	memo VARCHAR(300)
);
DESC cqupt_student;


#2
USE homework;

CREATE TABLE CourseAa(
	Aa1 VARCHAR(20),
	Aa2 INT,
	Aa3 DECIMAL(10)
);
DESC CourseAa;


#3
USE homework;

CREATE TABLE ChooseBb(
	Bb1 VARCHAR(30),
	Bb2 INT,
	Bb3 DECIMAL(6)
);
DESC ChooseBb;


#4-5
USE homework;
ALTER TABLE chooseBb ADD Bb4 VARCHAR(20) DEFAULT '系统测试值' NOT NULL;

USE homework;
ALTER TABLE chooseBb ADD Bb5 VARCHAR(10) PRIMARY KEY;
DESC choosebb;