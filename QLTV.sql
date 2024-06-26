USE [QLTV]
GO
/****** Object:  Table [dbo].[book]    Script Date: 4/5/2024 2:24:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[book](
	[bookId] [varchar](10) NOT NULL,
	[nameB] [nvarchar](50) NOT NULL,
	[category] [nvarchar](50) NULL,
	[author] [nvarchar](50) NULL,
	[producer] [nvarchar](50) NULL,
	[price] [float] NULL,
	[count] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[bookId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[employee]    Script Date: 4/5/2024 2:24:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[employee](
	[tk] [varchar](50) NULL,
	[passwd] [varchar](50) NULL,
	[name] [nvarchar](20) NULL,
	[gender] [nvarchar](5) NULL,
	[birthdayS] [date] NULL,
	[address] [nvarchar](50) NULL,
	[phone] [varchar](11) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[registerbook]    Script Date: 4/5/2024 2:24:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[registerbook](
	[studentId] [varchar](20) NOT NULL,
	[bookId] [varchar](20) NOT NULL,
	[amount] [int] NULL,
	[borrowDate] [varchar](50) NULL,
	[appointDate] [varchar](50) NULL,
	[payDate] [varchar](50) NULL,
	[giveBookBack] [nvarchar](30) NULL,
 CONSTRAINT [p_ka] PRIMARY KEY CLUSTERED 
(
	[studentId] ASC,
	[bookId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[student]    Script Date: 4/5/2024 2:24:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[student](
	[studentId] [varchar](8) NOT NULL,
	[nameS] [nvarchar](50) NULL,
	[gender] [nvarchar](5) NULL,
	[birthdayS] [date] NULL,
	[class] [varchar](25) NULL,
	[address] [nvarchar](30) NULL,
	[marjor] [nvarchar](30) NULL,
	[phone] [varchar](11) NULL,
	[mail] [varchar](50) NULL,
	[passwd] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[studentId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10001', N'Chương Trình Dịch', N'Công Nghệ Thông  Tin', N'Nguyễn Văn Phác', N'Học Viện Kĩ Thuật Mật Mã', 12500, 21)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10002', N'Lập Trình Hướng Đối Tượng', N'Công Nghệ Thông Tin', N'Lê Bá Cường', N'Học Viện Kĩ Thuật Mật Mã', 22500, 55)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10003', N'Kỹ Thuật Máy Tính', N'Công Nghệ Thông Tin', N'Vũ Văn Kiên', N'Đại Học Bách Khoa', 32500, 26)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10004', N'Cấu Trúc Dữ Liệu', N'Công Nghệ Thông Tin', N'Nguyễn Văn Phác', N'Học Viện Kĩ Thuật Mật Mã', 32500, 30)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10005', N'Cơ Sở Dữ Liệu', N'Công Nghệ Thông Tin', N'Nguyễn Thùy Trang', N'Đại Học Quốc Gia', 12500, 21)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10006', N'Hệ Thống Nhúng', N'Công Nghệ Thông Tin', N'Lê Bá Cường', N'Học Viện Kĩ Thuật Mật Mã', 22500, 31)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10007', N'Khai Thác Lỗ Hỏng', N'An Toàn Thông Tin', N'Nguyễn Thị Giang', N'Học Viện Kĩ Thuật Mật Mã', 12500, 25)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10008', N'Mã Độc', N'An Toàn Thông Tin', N'Nguyễn Ngọc Quang', N'Đại Học Khoa Học Tự Nhiên', 12500, 27)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10009', N'An Thông Mạng Không Dây', N'An Toàn Thông Tin', N'Nguyễn Văn Thắng', N'Học Viện Bưu Chính', 22000, 8)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10010', N'Quản Lý An Toàn Thông Tin', N'An Toàn Thông Tin', N'Đồng Văn Nghĩa', N'Đại Học FPT', 42000, 29)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10011', N'Tấn Công Và Phòng Thủ HT ', N'An Toàn Thông Tin', N'Đặng Xuân Nghĩa', N'Học Viện Kĩ Thuật Mật Mã', 12500, 27)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10012', N'Thiết Kế Vi Mạch Số', N'Điện Tử Viễn Thông', N'Lý Ngọc Ánh', N'Học Viện Kĩ Thuật Mật Mã', 32000, 48)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10013', N'Cơ Sở Điều Khiển', N'Điện Tử Viễn Thông', N'Trần Xuân Hùng', N'Học Viện Bưu Chính', 44500, 28)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10014', N'Điện Tử Tương Tự', N'Điện Tử Viễn Thông', N'Nguyễn Hồng Phong', N'Học Viện Kĩ Thuật Mật Mã', 42500, 30)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10015', N'Hệ Thống Viễn Thông', N'Điện Tử Viễn Thông', N'Nguyễn Văn Phượng', N'Học Viện Kĩ Thuật Mật Mã', 32500, 30)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10016', N'Linux và Phần mền mã mở', N'Công Nghệ Thông  Tin', N'Trần Văn Xuân', N'Đại Học Công Nghệ', 22500, 18)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10017', N'Toán Rời Rạc', N'Đại Cương', N'Nguyễn Hữu Cường', N'Đại Học Kĩ Thuật Hưng Yên', 13500, 12)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10018', N'Toán a2', N'Đại Cương', N'Nguyễn Văn Đệ', N'Học Viện Kĩ Thuật Mật Mã', 23500, 13)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10020', N'An Toàn Mạng', N'An Toàn Thông Tin', N'Nguyễn Hữu Nghĩa', N'Học Viện Kĩ Thuật Mật Mã', 12500, 100)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10021', N'Cơ Sở Dữ Liệu', N'Công Nghệ Thông Tin', N'Lê Bá Cường', N'Học Viện Kĩ Thuật Mật Mã', 12500, 40)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10022', N'Cơ Sở Dữ Liệu', N'Công Nghệ Thông Tin', N'Nguyễn Văn Phác', N'Học Viện Kĩ Thuật Mật Mã', 29000, 20)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10023', N'Chương trình dịch', N'Công Nghệ Thông Tin', N'Nguyễn Văn Đồng', N'Đại Học FPT', 13000, 100)
GO
INSERT [dbo].[employee] ([tk], [passwd], [name], [gender], [birthdayS], [address], [phone]) VALUES (N'admin', N'admin123', N'Hồ Đắc Cường', N'Nam', CAST(N'1992-09-12' AS Date), N'TP.HCM', N'0962036050')
GO
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'CT051031', N'KMA10001', 3, N'01/11/2022 00:50:12', N'05/04/2024', N'', N'chưa trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'CT051031', N'KMA10002', 2, N'02/04/2024 21:52:33', N'03/04/2024', N'', N'chưa trả')
GO
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'CT051031', N'Hồ Đắc Cường', N'Nam', CAST(N'2002-03-17' AS Date), N'AT17A', N'TP.HCM', N'Công Nghệ Thông Tin', N'0962036050', N'hodaccuong06@gmail.com', N'cuong123')
GO
ALTER TABLE [dbo].[student]  WITH CHECK ADD CHECK  (([gender]=N'Nam' OR [gender]=N'Nữ'))
GO
