CREATE DATABASE IF NOT EXISTS `security`;

CREATE TABLE IF NOT EXISTS `app_user` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `firstname` VARCHAR(255) NOT NULL,
    `lastname` VARCHAR(255) NOT NULL,
    `username` VARCHAR(255) NOT NULL,
    `password` VARCHAR(255) NOT NULL,
    `email` VARCHAR(255) DEFAULT NULL,
    `mobile_number` VARCHAR(20) NOT NULL,
    `account_non_expired` TINYINT(1) NOT NULL DEFAULT 1,
    `account_non_locked` TINYINT(1) NOT NULL DEFAULT 1,
    `credential_non_expired` TINYINT(1) NOT NULL DEFAULT 1,
    `enabled` TINYINT(1) NOT NULL DEFAULT 1,
    `created_date` DATE DEFAULT NULL,
    `last_modified_date` DATE DEFAULT NULL,
    `created_by` VARCHAR(255) DEFAULT NULL,
    `last_modified_by` VARCHAR(255) DEFAULT NULL,
    `version` int DEFAULT 0,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `role` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) NOT NULL,
    `version` int DEFAULT 0,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `permission` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) NOT NULL,
    `version` int DEFAULT 0,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `app_user_role` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `app_user_id` BIGINT(20) NOT NULL,
    `role_id` BIGINT(20) NOT NULL,
    `version` int DEFAULT 0,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`app_user_id`) REFERENCES `app_user` (`id`),
    FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
);

CREATE TABLE IF NOT EXISTS `role_permission` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `role_id` BIGINT(20) NOT NULL,
    `permission_id` BIGINT(20) NOT NULL,
    `version` int DEFAULT 0,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
    FOREIGN KEY (`permission_id`) REFERENCES `permission` (`id`)
);

INSERT INTO `app_user`(`username`, `firstname`, `lastname`, `password`, `email`, `mobile_number`, `account_non_expired`, `account_non_locked`, `credential_non_expired`, `enabled`)
VALUES ("alpha", "alpha", "A", "$2y$12$oRRbkNfwuR8ug4MlzH5FOeui.//1mkd.RsOAJMbykTSupVy.x/vb2", "alpha@domain.com", "9898987678", 1, 1, 1, 1);

INSERT INTO `role`(`name`) VALUES ("SUPER_USER");
INSERT INTO `permission`(`name`) VALUES ("ALL_FUNCTIONS");
INSERT INTO `app_user_role`(`app_user_id`, `role_id`) VALUES (1, 1);
INSERT INTO `role_permission`(`role_id`, `permission_id`) VALUES (1, 1);

CREATE TABLE IF NOT EXISTS `command_audit` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `method` varchar(255) DEFAULT NULL,
    `entity` varchar(255) DEFAULT NULL,
    `action` varchar(255) DEFAULT NULL,
    `payload` TEXT DEFAULT NULL,
    `url` varchar(255) DEFAULT NULL,
    `created_date` DATE DEFAULT NULL,
    `last_modified_date` DATE DEFAULT NULL,
    `created_by` varchar(255) DEFAULT NULL,
    `last_modified_by` varchar(255) DEFAULT NULL,
    `version` int DEFAULT 0,
    PRIMARY KEY (`id`)
);
