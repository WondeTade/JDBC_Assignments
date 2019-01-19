# JDBC_Assignments

# JDBC_Assignmnet33

SQL Code:


create database newsqlandjava;

create table `newsqlandjava`. `people`(
	`person_id` INT NOT NULL,
    `firstname` VARCHAR(45) NOT NULL,
    `lastname` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`person_id`));
    
	INSERT INTO newsqlandjava .`people` (`person_id`, `firstname`, `lastname`) VALUES ('1', 'Anna', 'Bolt');
	INSERT INTO newsqlandjava .`people` (`person_id`, `firstname`, `lastname`) VALUES ('2', 'Carl', 'Dolk');
	INSERT INTO newsqlandjava .`people` (`person_id`, `firstname`, `lastname`) VALUES ('3', 'Erik', 'Fram');
    insert into newsqlandjava .`people` (`person_id`, `firstname`, `lastname`) values ('4', 'Gina', 'Hult');
    
    
    create table `newsqlandjava`. `cars` (
		`car_id` INT NOT NULL,
        `brand` varchar(45) NOT NULL,
        `color` varchar(45) not null,
        primary key (`car_id`));
        
        INSERT into newsqlandjava .`cars` (`car_id`, `brand`, `color`) values ('1', 'Volvo', 'Black');
        insert into newsqlandjava .`cars` (`car_id`, `brand`, `color`) values ('2', 'Saab', 'Blue');
        INSERT into newsqlandjava .`cars` (`car_id`, `brand`, `color`) values ('3', 'Audi', 'Red');
        insert into newsqlandjava .`cars` (`car_id`, `brand`, `color`) values ('4', 'Ford', 'Green');
      
      
    create table `newsqlandjava`. `owners` (
		`owner_id` int not null,
        `person_id` int not null,
        `car_id` int not null,
        primary key (`owner_id`));
        
        INSERT into newsqlandjava .`owners` (`owner_id`, `person_id`, `car_id`) values ('1', '2', '3');
        insert into newsqlandjava .`owners` (`owner_id`, `person_id`, `car_id`) values ('2', '1', '4');
        INSERT into newsqlandjava .`owners` (`owner_id`, `person_id`, `car_id`) values ('3', '3', '2');
        insert into newsqlandjava .`owners` (`owner_id`, `person_id`, `car_id`) values ('4', '4', '1');
      
