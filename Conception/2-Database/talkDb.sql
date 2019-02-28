-- MySQL Script generated by MySQL Workbench
-- Thu Feb 28 20:43:20 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema talk_db
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `talk_db` ;

-- -----------------------------------------------------
-- Schema talk_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `talk_db` DEFAULT CHARACTER SET utf8 ;
USE `talk_db` ;

-- -----------------------------------------------------
-- Table `talk_db`.`student`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `talk_db`.`student` ;

CREATE TABLE IF NOT EXISTS `talk_db`.`student` (
  `id_student` INT NOT NULL AUTO_INCREMENT,
  `firstname` VARCHAR(45) NULL,
  `lastname` VARCHAR(45) NULL,
  `email` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  `profil` VARCHAR(255) NULL,
  `date_inscription` DATETIME NULL,
  `access_key` enum('root','user') NOT NULL default 'user',
  PRIMARY KEY (`id_student`))
ENGINE = InnoDB;

CREATE UNIQUE INDEX `email_UNIQUE` ON `talk_db`.`student` (`email` ASC);
CREATE UNIQUE INDEX `phone_UNIQUE` ON `talk_db`.`student` (`phone` ASC);


-- -----------------------------------------------------
-- Table `talk_db`.`group`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `talk_db`.`group` ;

CREATE TABLE IF NOT EXISTS `talk_db`.`group` (
  `id_group` INT NOT NULL,
  `document_size` INT NULL,
  `note` VARCHAR(45) NULL,
  `datecreation` DATETIME NULL,
  PRIMARY KEY (`id_group`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `talk_db`.`document`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `talk_db`.`document` ;

CREATE TABLE IF NOT EXISTS `talk_db`.`document` (
  `id_document` INT NOT NULL AUTO_INCREMENT,
  `id_group` INT NOT NULL,
  `id_student` INT NOT NULL,
  `object` VARCHAR(45) NULL,
  `document_url` VARCHAR(45) NULL,
  `uploaded_time` VARCHAR(45) NULL,
  `slug` VARCHAR(45) NULL,
  PRIMARY KEY (`id_document`),
  CONSTRAINT `fk_document_groupe`
    FOREIGN KEY (`id_group`)
    REFERENCES `talk_db`.`group` (`id_group`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_document_Etudiant1`
    FOREIGN KEY (`id_student`)
    REFERENCES `talk_db`.`student` (`id_student`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_document_groupe_idx` ON `talk_db`.`document` (`id_group` ASC);

CREATE INDEX `fk_document_Etudiant1_idx` ON `talk_db`.`document` (`id_student` ASC);


-- -----------------------------------------------------
-- Table `talk_db`.`note`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `talk_db`.`note` ;

CREATE TABLE IF NOT EXISTS `talk_db`.`note` (
  `id_note` INT NOT NULL AUTO_INCREMENT,
  `id_student` INT NOT NULL,
  `id_group` INT NOT NULL,
  `presentation` INT NULL,
  `content` INT NULL,
  `explanation` INT NULL,
  `answer` INT NULL,
  `workshop` INT NULL,
  `remark` VARCHAR(255) NULL,
  `noted_time` DATETIME NULL,
  PRIMARY KEY (`id_note`),
  CONSTRAINT `fk_note_Etudiant1`
    FOREIGN KEY (`id_student`)
    REFERENCES `talk_db`.`student` (`id_student`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_note_groupe1`
    FOREIGN KEY (`id_group`)
    REFERENCES `talk_db`.`group` (`id_group`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_note_Etudiant1_idx` ON `talk_db`.`note` (`id_student` ASC);

CREATE INDEX `fk_note_groupe1_idx` ON `talk_db`.`note` (`id_group` ASC);


-- -----------------------------------------------------
-- Table `talk_db`.`question`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `talk_db`.`question` ;

CREATE TABLE IF NOT EXISTS `talk_db`.`question` (
  `id_question` INT NOT NULL,
  `content` VARCHAR(255) NULL,
  `type` VARCHAR(45) NULL,
  PRIMARY KEY (`id_question`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `talk_db`.`answer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `talk_db`.`answer` ;

CREATE TABLE IF NOT EXISTS `talk_db`.`answer` (
  `id_answer` INT NOT NULL,
  `id_question` INT NOT NULL,
  `id_student` INT NOT NULL,
  `content` VARCHAR(255) NULL,
  PRIMARY KEY (`id_answer`, `id_question`, `id_student`),
  CONSTRAINT `fk_answer_question1`
    FOREIGN KEY (`id_question`)
    REFERENCES `talk_db`.`question` (`id_question`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_answer_Etudiant1`
    FOREIGN KEY (`id_student`)
    REFERENCES `talk_db`.`student` (`id_student`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_answer_question1_idx` ON `talk_db`.`answer` (`id_question` ASC);

CREATE INDEX `fk_answer_Etudiant1_idx` ON `talk_db`.`answer` (`id_student` ASC);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
