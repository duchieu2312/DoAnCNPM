CREATE DATABASE QUANLYMAYTINH

USE QUANLYMAYTINH

CREATE TABLE KHACHHANG
(
	MAKH INT IDENTITY(1,1) PRIMARY KEY,
	HOTEN NVARCHAR(50),
	SDT NVARCHAR(10),
	DCHI NVARCHAR(100),
	EMAIL NVARCHAR(100)
)

CREATE TABLE LOAISANPHAM
(
	MALOAISP int PRIMARY KEY,
	LOAISP NVARCHAR(50)
)

CREATE TABLE SANPHAM
(
	MASP NVARCHAR(10) PRIMARY KEY,
	TENSP NVARCHAR(50),
	MALOAISP int,
	GIA MONEY,
	SOLUONG INT
)

CREATE TABLE NHANVIEN
(
	MANV INT IDENTITY(1,1) PRIMARY KEY,
	TENNV NVARCHAR(50),
	SDT NVARCHAR(10),
	DCHI NVARCHAR(100),
	TENDANGNHAP NVARCHAR(50),
	MATKHAU NVARCHAR(50),
	LOAINV INT
)

CREATE TABLE HOADONBAN
(
	MAHDB INT IDENTITY(1,1) PRIMARY KEY,
	MAKH INT,
	MANV INT,
	NGHDB DATE,
	TONGTIEN MONEY
)

CREATE TABLE CTHDBAN
(
	MAHDB INT,
	MASP NVARCHAR(10),
	SOLUONG INT,
	DONGIA MONEY,
	THANHTIEN MONEY
	PRIMARY KEY(MAHDB,MASP)
)

CREATE TABLE DICHVU
(
	MADV INT PRIMARY KEY,
	TENDV NVARCHAR(50)
)

CREATE TABLE HOADONDICHVU
(
	MAHDDV INT IDENTITY(1,1) PRIMARY KEY,
	MAKH INT,
	MANV INT,
	NGHDV DATE,
	TONGTIEN MONEY
)

CREATE TABLE CTHDDV
(
	MAHDDV INT,
	MADV INT,
    TENSP NVARCHAR(50),
	GIA MONEY
	PRIMARY KEY(MAHDDV,MADV)
)

CREATE TABLE NHACUNGCAP
(
	MANCC CHAR(10) PRIMARY KEY,
	TENNCC NVARCHAR(50),
	DIACHI NVARCHAR(50)
)

/*ALTER TABLE SANPHAM
ADD CONSTRAINT FKSP_NCC
FOREIGN KEY (MANCC)
REFERENCES NHACUNGCAP(MANCC)*/

ALTER TABLE SANPHAM
ADD CONSTRAINT FKSP_LOAISP
FOREIGN KEY (MALOAISP)
REFERENCES LOAISANPHAM(MALOAISP)

ALTER TABLE HOADONBAN
ADD CONSTRAINT FKHDB_KH
FOREIGN KEY (MAKH)
REFERENCES KHACHHANG(MAKH)

ALTER TABLE HOADONBAN
ADD CONSTRAINT FKHDB_NV
FOREIGN KEY (MANV)
REFERENCES NHANVIEN(MANV)

ALTER TABLE CTHDBAN
ADD CONSTRAINT FKCTHDB_HDB
FOREIGN KEY (MAHDB)
REFERENCES HOADONBAN(MAHDB)

ALTER TABLE CTHDBAN
ADD CONSTRAINT FKCTHDB_SP
FOREIGN KEY (MASP)
REFERENCES SANPHAM(MASP)

ALTER TABLE HOADONDICHVU
ADD CONSTRAINT FKHDDV_KH
FOREIGN KEY (MAKH)
REFERENCES KHACHHANG(MAKH)

ALTER TABLE HOADONDICHVU
ADD CONSTRAINT FKHDDV_NV
FOREIGN KEY (MANV)
REFERENCES NHANVIEN(MANV)

ALTER TABLE CTHDDV
ADD CONSTRAINT FKCTHDDV_HDDV
FOREIGN KEY (MAHDDV)
REFERENCES HOADONDICHVU(MAHDDV)

ALTER TABLE CTHDDV
ADD CONSTRAINT FKCTHDDV_DV
FOREIGN KEY (MADV)
REFERENCES DICHVU(MADV)

INSERT INTO NHANVIEN VALUES (N'Hiếu','0931147795',N'Phường 15 Quận 8',N'admin',N'admin',1),
							(N'Lợi','0902756413',N'Phường 14 Quận 8','thanhloi','123',1),
							(N'Lương','0933540383',N'Phường An Lạc Quận Bình Tân',N'user',N'user',0),
							(N'Dương','0901876234',N'Phường 16 Quận 8',N'daiduong',N'123',0)

INSERT INTO KHACHHANG VALUES (N'Trà Nguyễn Hoàng Minh',N'0923768231',N'Quận 8',N'minhhoang@gmail.com'),
							 (N'Âu Dương Bỉnh Hằng',N'0956737453',N'Quận 1',N'hangau101@yahoo.com'),
							 (N'Tạ Tuấn Kiệt',N'0987463827',N'Quận Bình Tân',N'takiet1508@yahoo.com'),
							 (N'Trần Minh Nhật',N'0956838354',N'Quận 6',N'trannhat202@gmail.com'),
							 (N'Nguyễn Thành Tiến',N'0957453112',N'Quận Bình Tân',N'thanhtien1202@gmail.com'),
							 (N'Nguyễn Minh Quân',N'0945323565',N'Quận 8',N'minhquan007@yahoo.com'),
							 (N'Lý Khải Tuấn',N'0975367867',N'Quận Bình Chánh',N'khaituan@yahoo.com'),
							 (N'Lý Hồng Kỳ',N'0933532187',N'Quận 8',N'hongky888@gmail.com'),
							 (N'Võ Trung Hùng',N'0901951774',N'Quận 8',N'hungneko@yahoo.com'),
							 (N'Nguyễn Công Tùng',N'0901545608',N'Quận 8',N'tungahri@gmail.com')

INSERT INTO LOAISANPHAM VALUES (1,N'Laptop'),
							   (2,N'Máy Tính'),
							   (3,N'Phụ Kiện'),
							   (4,N'Linh Kiện')

INSERT INTO SANPHAM VALUES (N'L01',N'Laptop Gaming Asus ROG Strix G15 G513IH HN015W',1,18490000,15),
						   (N'L02',N'Laptop Gaming Acer Nitro 5 Eagle AN515 57 5669',1,18490000,17),
						   (N'L03',N'Laptop Gaming Acer Nitro 5 AN515 45 R86D',1,30000000,19),
						   (N'L04',N'Laptop Gaming MSI GF63 Thin 11UD 628VN',1,23490000,20),
						   (N'L05',N'Laptop Huawei Matebook D15 BOD WDH9',1,17990000,23),
						   (N'L06',N'Laptop Gaming Dell G15 5515 P105F004 70266675',1,27990000,28),
						   (N'L07',N'Laptop Lenovo Legion 5 15ITH6 82JK007SVN',1,32490000,30),
						   (N'L08',N'Laptop Gaming Dell Alienware M15 70262921',1,54000000,10),
						   (N'L09',N'Laptop Asus Zenbook UX325EA KG656W',1,21490000,14),
						   (N'L10',N'Laptop GIGABYTE U4 UD 50S1823SO',1,20490000,20),
						   (N'C01',N'PC Dell Inspiron 3881 MT',2,15000000,14),
						   (N'C02',N'PC Minion i1030',2,8990000,15),
						   (N'C03',N'PC PHANTOM i3060',2,38490000,13),
						   (N'C04',N'PC Dragon X',2,83490000,5),
						   (N'C05',N'PC Avengers Z',2,51490000,10),
						   (N'C06',N'PC Valorant Z',2,51490000,20),
						   (N'C07',N'PC Yuumi M',2,16190000,16),
						   (N'C08',N'PC Homework I3',2,7200000,20),
						   (N'C09',N'PC Homework R5',2,14490000,18),
						   (N'C10',N'PC Homework Pentium',2,6190000,30),
						   (N'PK01',N'Màn hình ASUS TUF GAMING VG27AQ 27" IPS 2K 165Hz',3,9490000,20),
						   (N'PK02',N'Màn hình cong ViewSonic VX3418-2KPC 34" 2K 144Hz',3,10690000,20),
						   (N'PK03',N'Màn hình cong SAMSUNG QLED LC49G95 49" VA 2K 240Hz',3,31990000,10),
						   (N'PK04',N'Tai nghe Razer Kraken Kitty Chroma Quartz',3,4290000,20),
						   (N'PK05',N'Tai nghe Corsair HS70 Pro Wireless Carbon',3,1990000,20),
						   (N'PK06',N'Tai nghe HyperX Cloud II Wireless',3,3490000,21),
						   (N'PK07',N'Bàn phím Razer BlackWidow V3 Green Switch Quartz',3,3590000,15),
						   (N'PK08',N'Bàn phím Razer Blackwidow V3 Tenkeyless',3,2490000,18),
						   (N'PK09',N'Bàn phím Vortex 8700 MultiX Summer',3,2900000,20),
						   (N'PK10',N'Chuột Steelseries Rival 600',3,1790000,20),
						   (N'PK11',N'Chuột Logitech G502 Hero',3,1050000,30),
						   (N'PK12',N'Chuột Gaming Asus ROG Pugio II',3,2390000,15),
						   (N'LK01',N'GIGABYTE H510M H',4,1890000,30),
						   (N'LK02',N'Gigabyte GeForce GTX 1660 SUPER OC 6GB GDDR6',4,9490000,27),
						   (N'LK03',N'Ram PNY XLR8 1x8GB 3200 RGB',4,990000,25),
						   (N'LK04',N'SSD KINGSTON A400 240GB M.2 Sata 3',4,890000,30),
						   (N'LK05',N'HDD WD Black 1TB 7200rpm',4,1990000,23),
						   (N'LK06',N'Tản nước Cooler Master MASTERLIQUID ML360L V2',4,2590000,20),
						   (N'LK07',N'Fan DEEPCOOL CF120 PLUS',4,1150000,22),
						   (N'LK08',N'Intel Core i5 10400F',4,4390000,30),
						   (N'LK09',N'ASUS TUF GAMING B560-PLUS WIFI',4,3990000,20),
						   (N'LK10',N'Ram G.Skill Trident Z 1x8GB RGB 3000',4,1350000,25)

INSERT INTO DICHVU VALUES (1,N'Sửa chữa'),
						  (2,N'Thay linh kiện'),
						  (3,N'Vệ sinh')

set dateformat dmy
INSERT INTO HOADONBAN VALUES (1,1,'06-11-2021',5740000),
							 (2,1,'10-11-2021',16880000),
							 (2,2,'11-11-2021',1990000),
							 (3,1,'13-11-2021',16880000),
							 (4,3,'13-11-2021',4180000),
							 (5,4,'14-11-2021',3590000),
							 (5,4,'15-11-2021',3490000),
							 (6,1,'18-11-2021',17990000),
							 (7,2,'18-11-2021',47980000),
							 (8,1,'19-11-2021',2390000),
							 (9,1,'20-11-2021',1780000),
							 (10,1,'20-11-2021',20490000)

INSERT INTO CTHDBAN VALUES (1,N'LK08',1),
						   (1,N'LK10',1),
						   (2,N'C10',1),
						   (2,N'PK02',1),
						   (3,N'PK05',1),
						   (4,N'LK03',2),   						
						   (4,N'LK07',1),
						   (4,N'PK11',1),
						   (5,N'L01',1),
						   (5,N'C07',1),
						   (5,N'PK01',1),
						   (6,N'PK07',1),
						   (7,N'PK06',1),
						   (8,N'L05',1),
						   (9,N'C03',1),
						   (9,N'PK01',1),
						   (10,N'PK12',1),
						   (11,N'LK04',2),
						   (12,N'L10',1)

INSERT INTO HOADONDICHVU VALUES (1,1,'30-11-2021',500000),
								(5,4,'05-12-2021',400000),
								(9,2,'12-12-2021',750000),
								(2,3,'16-12-2021',400000),
								(10,1,'30-12-2021',1000000)

INSERT INTO CTHDDV VALUES (1,N'Ram G.Skill Trident Z 1x8GB RGB 3000',500000),
						  (3,N'Laptop Gaming Asus ROG Strix G15 G513IH HN015W',400000),
						  (2,N'PC PHANTOM i3060',750000),
						  (3,N'PC Homework Pentium',400000),
						  (1,N'Laptop GIGABYTE U4 UD 50S1823SO',750000)