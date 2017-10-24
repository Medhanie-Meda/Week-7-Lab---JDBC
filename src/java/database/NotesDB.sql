DROP DATABASE if exists NotesDB;
CREATE DATABASE NotesDB;

USE NotesDB;


DROP TABLE User;

CREATE TABLE Note( 
    noteId INT AUTO_INCREMENT,
    dateCreated DATE NOT NULL,
    contents VARCHAR(10000) CHARACTER SET utf8 NOT NULL,
    PRIMARY KEY (noteID) 
);

INSERT INTO Note values(1, '2010-11-11', 'Content One');
