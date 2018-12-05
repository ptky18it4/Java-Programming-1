create database QUAN_LY_VAN_CHUYEN_XE
use QUAN_LY_VAN_CHUYEN_XE
create table XE(MaVC varchar(5) primary key not null,BienSo varchar(10) not null ,TenXe varchar(15)not null,HangSX varchar(15) not null,
LoaiXe varchar(2) not null,MauSac varchar(5) not null,TinhTrang varchar(5));

create table HOPDONG(SoHD char(5) primary key not null,MaVC varchar(5) not null,NoiDi varchar(20) not null,NoiDen varchar(20) not null,
GiaTriHD varchar(11),Thue varchar(2),Tien varchar(11),
Constraint FK_HD foreign key (MaVC) references XE(MaVC)on delete cascade);

create table KHACH(CMND char(12) primary key not null,HoTenKhach varchar(30),SoHD char(5),
Constraint FK_KHACH foreign key (SoHD) references HOPDONG(SoHD)on delete cascade);

select* from XE
select* from HOPDONG
select* from KHACH
insert into XE(MaVC,BienSo,TenXe,HangSX,LoaiXe,MauSac,TinhTrang)
values( 'VC001','17B-01711','Civic','Honda','4','Den','Tot');
insert into XE(MaVC,BienSo,TenXe,HangSX,LoaiXe,MauSac,TinhTrang)
values( 'VC535','78A-65835','Vios','Toyota','4','Vang','Tot');
insert into XE(MaVC,BienSo,TenXe,HangSX,LoaiXe,MauSac,TinhTrang)
values( 'VC023','43H-95835','Cerato','Kia','4','Trang','Hong');
insert into XE(MaVC,BienSo,TenXe,HangSX,LoaiXe,MauSac,TinhTrang)
values( 'VC642','37A-00352','CRV','Honda','7','Den','Tot');
insert into XE(MaVC,BienSo,TenXe,HangSX,LoaiXe,MauSac,TinhTrang)
values( 'VC051','53A-7847','Transit','Ford','16','Trang','Hong');

insert into HOPDONG(SoHD,MaVC,NoiDi,NoiDen,GiaTriHD,Thue)
values('HD428','VC001','Thai Binh','Da Nang',4000000,2);
insert into HOPDONG(SoHD,MaVC,NoiDi,NoiDen,GiaTriHD,Thue)
values('HD253','VC535','Phu Yen','Da Nang',3000000,2);
insert into HOPDONG(SoHD,MaVC,NoiDi,NoiDen,GiaTriHD,Thue)
values('HD542','VC023','Da Nang','Nha Trang',2500000,2);
insert into HOPDONG(SoHD,MaVC,NoiDi,NoiDen,GiaTriHD,Thue)
values('HD456','VC642','Nghe An','HCM',5000000,2);
insert into HOPDONG(SoHD,MaVC,NoiDi,NoiDen,GiaTriHD,Thue)
values('HD734','VC051','HCM','Da Nang',4000000,2);

insert into KHACH(CMND,HoTenKhach,SoHD)
values(34200012210,'Tran Van Long','HD428');
insert into KHACH(CMND,HoTenKhach,SoHD)
values(47642059218,'Pham Anh Vu','HD253');
insert into KHACH(CMND,HoTenKhach,SoHD)
values(561379246126,'Nguyen Van An','HD542');
insert into KHACH(CMND,HoTenKhach,SoHD)
values(795135716154,'Do Thanh Tung','HD428');
insert into KHACH(CMND,HoTenKhach,SoHD)
values(012467034951,'Bui Thanh Tien','HD456');
insert into KHACH(CMND,HoTenKhach,SoHD)
values(034016792403,'Tran Trong Thang','HD734');

------- UPDATE  SET WHERE 
UPDATE KHACH
SET HoTenKhach = 'Pham Trung Ky'
WHERE SoHD = 'HD456 '
UPDATE KHACH
SET HoTenKhach = 'Tran Trung Hieu'
WHERE SoHD = 'HD428'
--
UPDATE XE
SET TinhTrang = 'Tot'
WHERE BienSo = '17B-01711'
--

SELECT * FROM XE
SELECT HoTenKhach FROM KHACH

---

SELECT * FROM XE
WHERE LoaiXe > 4 OR LoaiXe < 16  --AND
--
SELECT * FROM XE
WHERE LoaiXe  BETWEEN 7  AND  16 -- NOT BETWEEN
--
--
SELECT BienSo,TenXe,MauSac,HangSX,LoaiXe From XE
ORDER BY HangSX ASC

--- COUNT
SELECT COUNT (MauSac), TinhTrang
FROM XE
GROUP BY TinhTrang
SELECT * FROM XE

----LIKE
SELECT *
FROM XE
WHERE TenXe  LIKE '%C%' ; -- NOT LIKE
--INNER JOIN-- NỐI 2 Cột MaVC trong bảng XE và cột SoHD trong bảng HOPDONG
SELECT XE.MaVC,HOPDONG.SoHD,KHACH.HoTenKhach
FROM ((XE
INNER JOIN HOPDONG ON HOPDONG.MaVC = XE.MaVC)
INNER JOIN KHACH ON KHACH.SoHD = HOPDONG.SoHD);
--
SELECT XE.*,HOPDONG.*,KHACH.*
FROM ((XE
INNER JOIN HOPDONG ON HOPDONG.MaVC = XE.MaVC)
INNER JOIN KHACH ON KHACH.SoHD = HOPDONG.SoHD);
--
Grant select,insert,update
on HOPDONG,KHACH
to PhamTrungKy
[with grant option]
--
revoke insert 
on HOPDONG
from PhamTrungKy
[cascade]