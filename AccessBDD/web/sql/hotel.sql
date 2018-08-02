
DROP TABLE hotel CASCADE CONSTRAINTS;
DROP TABLE room CASCADE CONSTRAINTS;
DROP TABLE booking CASCADE CONSTRAINTS;
DROP TABLE guest CASCADE CONSTRAINTS;

create table hotel
(hotelno varchar2(10),
hotelname varchar2(20),
city varchar2(20),
primary key (hotelno));
commit;

insert into hotel values
('fb01', 'Grosvenor', 'London');
insert into hotel values
('fb02', 'Watergate', 'Paris');
insert into hotel values
('ch01', 'Omni Shoreham', 'London');
insert into hotel values
('ch02', 'Phoenix Park', 'London');
insert into hotel values
('dc01', 'Latham', 'Berlin');
commit;

create table room
(roomno number(5),
hotelno varchar2(10),
type varchar2(10),
price decimal(5,2),
primary key (roomno, hotelno),
foreign key (hotelno) REFERENCES hotel);
commit;

insert into room values
(501, 'fb01', 'single', 19);
insert into room values
(601, 'fb01', 'double', 29);
insert into room values
(701, 'fb01', 'family', 39);
insert into room values
(1001, 'fb02', 'single', 58);
insert into room values
(1101, 'fb02', 'double', 86);
insert into room values
(1001, 'ch01', 'single', 29.99);
insert into room values
(1101, 'ch01', 'family', 59.99);
insert into room values
(701, 'ch02', 'single', 10);
insert into room values
(801, 'ch02', 'double', 15);
insert into room values
(901, 'dc01', 'single', 18);
insert into room values
(1001, 'dc01', 'double', 30);
insert into room values
(1101, 'dc01', 'family', 35);
commit;

create table guest
(guestno number(5),
guestname varchar(20),
guestaddress varchar(50),
primary key (guestno));
commit;

insert into guest values
(10001, 'John Kay', '56 High St, London');
insert into guest values
(10002, 'Mike Ritchie', '18 Tain St, London');
insert into guest values
(10003, 'Mary Tregear', '5 Tarbot Rd, Aberdeen');
insert into guest values
(10004, 'Joe Keogh', '2 Fergus Dr, Aberdeen');
insert into guest values
(10005, 'Carol Farrel', '6 Achray St, Glasgow');
insert into guest values
(10006, 'Tina Murphy', '63 Well St, Glasgow');
insert into guest values
(10007, 'Tony Shaw', '12 Park Pl, Glasgow');
commit;

create table booking
(hotelno varchar2(10),
guestno number(5),
datefrom date,
dateto date,
roomno number(5),
primary key (hotelno, guestno, datefrom),
foreign key (roomno, hotelno) REFERENCES room(roomno, hotelno),
foreign key (guestno) REFERENCES guest);
commit;

insert into booking values
('fb01', 10001, to_date('01-04-2004','dd-mm-yyyy'), to_date('08-04-2004','dd-mm-yyyy'), 501);
insert into booking values
('fb01', 10004, to_date('15-04-2004','dd-mm-yyyy'), to_date('15-05-2004','dd-mm-yyyy'), 601);
insert into booking values
('fb01', 10005, to_date('02-05-2004','dd-mm-yyyy'), to_date('07-05-2004','dd-mm-yyyy'), 501);
insert into booking values
('fb01', 10002, to_date('16-05-2004','dd-mm-yyyy'), to_date('29-05-2004','dd-mm-yyyy'), 601);
insert into booking values
('fb01', 10001, to_date('01-05-2004','dd-mm-yyyy'), null, 701);
insert into booking values
('fb02', 10003, to_date('05-04-2004','dd-mm-yyyy'), to_date('10-04-2004','dd-mm-yyyy'), 1001);
insert into booking values
('fb02', 10005, to_date('12-05-2004','dd-mm-yyyy'), to_date('30-05-2004','dd-mm-yyyy'), 1101);
insert into booking values
('ch01', 10006, to_date('21-04-2004','dd-mm-yyyy'), null, 1101);
insert into booking values
('ch02', 10002, to_date('25-04-2004','dd-mm-yyyy'), to_date('06-05-2004','dd-mm-yyyy'), 801);
insert into booking values
('dc01', 10007, to_date('13-04-2004','dd-mm-yyyy'), to_date('15-05-2004','dd-mm-yyyy'), 1001);
insert into booking values
('dc01', 10003, to_date('20-05-2004','dd-mm-yyyy'), null, 1001);
commit;