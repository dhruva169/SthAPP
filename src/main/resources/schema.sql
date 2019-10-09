drop database sth;
create database sth;

-- create user 'admin'@'localhost' identified by 'admin@MySQL1';
-- create user 'user1'@'localhost' identified by 'user1@MySQL1';
-- create user 'user2'@'localhost' identified by 'user2@MySQL1';

-- GRANT ALL PRIVILEGES ON sth.* TO admin@localhost;

use sth;

-- implemented
create table employee (
    fname varchar (25),
    lname varchar (25),
    designation varchar (25),
    joiningDate Date,
    phoneNo char (10),
    salary int,
    empID int not null primary key auto_increment,
    address varchar (200),
    username varchar (20)
);

-- implemented
create table bank_deposits (
    amountDeposited int,
    depositDate Date null primary key,
    empID int,
    foreign key (empID) references employee (empID)
);

-- implemented
create table customer (
    fname varchar (25),
    lname varchar (25),
    panNo char (10),
    aadharNo char (12),
    phoneNo char (10),
    email varchar (50),
    custID int not null primary key auto_increment,
    address varchar (200),
    businessType varchar (40),
    username varchar (20)
);

-- implemented
create table credit (
    id int not null primary key auto_increment,
    amount int,
    dueDate Date,
    custID int,
    foreign key (custID) references customer (custID)
);

-- implemented
create table vehicle (
    vehicleNo varchar(10) not null primary key ,
    dtOfMaintenance date,
    distanceCovered int,
    dieselAvailable int,
    isAvailable int
);

-- implemented
create table orders (
    orderID int not null primary key auto_increment,
    overHeadCharges int,
    amount int,
    paymentMode varchar (25),
    status int,
    type varchar (25)
);

-- implemented
create table delivery (
    deliveryID int not null primary key auto_increment,
    deliveryAddress varchar (200),
    dateOfDelivery date,
    dateOfOrderPlaced date,
    orderID int,
    vehicleNo varchar (10),
    foreign key (orderID) references orders (orderID),
    foreign key (vehicleNo) references vehicle (vehicleNo)
);

-- implemented
create table location (
    locationID int not null auto_increment primary key ,
    shelfNo int,
    modelNo int,
    foreign key (modelNo) references tyre (modelNo)
);

-- implemented
create table tyre (
    modelNo varchar (25) not null primary key,
    vehicleType varchar (25),
    design varchar (25),
    isTubeless int,
    price int,
    percentDiscount int,
    locationID int,
    foreign key (locationID) references location (locationID)
);

-- implemented
create table inventory (
    id int not null primary key auto_increment,
    quantity int,
    modelNo varchar (25),
    foreign key (modelNo) references tyre (modelNo)
);

-- implemented
create table order_items (
    id int not null primary key auto_increment,
    quantity int,
    amount int,
    modelNo varchar (25),
    orderID int,
    foreign key (modelNo) references tyre (modelNo),
    foreign key (orderID) references orders (orderID)
);

-- implemented
create table supplier (
    fname varchar (25),
    lname varchar (25),
    phoneNo varchar (10),
    email varchar (50),
    suppID int not null primary key auto_increment,
    address varchar (200)
);

-- implemented
create table todo (
    taskID int auto_increment not null primary key,
    dueDate date,
    inDate date,
    task varchar (1000),
    empID int,
    foreign key (empID) references employee (empID)
);
















