CREATE TABLE IF NOT EXISTS student (
        id BIGINT PRIMARY KEY AUTO_INCREMENT,
        first_name VARCHAR(50),
        last_name VARCHAR(50),
        address VARCHAR(50),
        dob date,
        username VARCHAR(50)
    );

CREATE TABLE IF NOT EXISTS taken_course (
        id BIGINT PRIMARY KEY AUTO_INCREMENT,
        student_id BIGINT,
        course_id BIGINT,
        grade DOUBLE
);

CREATE TABLE IF NOT EXISTS instructor (
        id BIGINT PRIMARY KEY AUTO_INCREMENT,
        instructor_name VARCHAR(50),
        instructor_office VARCHAR(50),
        rank VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS course (
        id BIGINT PRIMARY KEY AUTO_INCREMENT,
        title VARCHAR(50),
        credit_hour DOUBLE,
        instructor_id BIGINT
);