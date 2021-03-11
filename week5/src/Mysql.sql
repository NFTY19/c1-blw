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


#6
USE homework;

CREATE VIEW View_Choosebb
	(View_bb1, View_bb2, view_bb3) AS
	SELECT Bb1, Bb4, Bb5 FROM choosebb;

DESCRIBE View_Choosebb;

#7
DROP VIEW View_Choosebb;

#8
CREATE INDEX Index_bb2 ON choosebb(Bb2 ASC);
CREATE INDEX Index_bb4 ON choosebb(Bb4 DESC);


#9
DROP INDEX Index_bb2 ON choosebb;

#10
USE homework;
CREATE TABLE test(
	NAME VARCHAR(20),
	age INT,
	score NUMERIC(10, 2),
	address VARCHAR(60)
);
DESC test;

#11
INSERT INTO test(NAME, age, score, address) VALUES
('赵一',20,580.00,'重邮宿舍12-3-5'),
('钱二',19,540.00,'南福苑5-2-9'),
('孙三',21,555.00,'学生新区21-5-15'),
('李四',22,505.00,'重邮宿舍8-6-22'),
('周五',20,495.00,'学生新区23-4-8'),
('吴六',19,435.00,'南福苑2-5-12');
SELECT * FROM test;

#12
CREATE TABLE test_temp(
	NAME VARCHAR(20),
	age INT,
	score NUMERIC(10, 2),
	address VARCHAR(60)
);

#13
INSERT INTO test_temp(NAME, age, score, address) VALUES
('郑七',21,490.00,'重邮宿舍11-2-1'),
('张八',20,560,'南福苑3-3-3'),
('王九',10,515.00,'学生新区19-7-1');

#14
INSERT INTO test SELECT * FROM test_temp;