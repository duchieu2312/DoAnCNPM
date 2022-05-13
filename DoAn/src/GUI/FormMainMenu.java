package GUI;

import DTO.NhanVienDTO;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class FormMainMenu{

	protected JFrame Frame;
	private NhanVienDTO UsersLogin;
	private JButton btnTongQuan,btnBanSanPham,btnDichVu,btnQuanLyKhachHang,btnQuanLyNhanVien,btnQuanLySanPham,btnDoanhThu,btnDangXuat;
	private JButton btnBanSanPham2,btnDichVu2,btnQuanLyKhachHang2,btnQuanLyNhanVien2,btnQuanLySanPham2,btnDoanhThu2;

	public FormMainMenu(NhanVienDTO UserLogin) {
		UsersLogin = UserLogin;
		initComponents();
		PhanQuyen(UsersLogin);
	}
	
	public void initComponents() {
		Frame = new JFrame();
		Frame.setSize(1280,800);
		Frame.setLocationRelativeTo(null);
		Frame.setResizable(false);
		Frame.setUndecorated(true);
		Frame.getContentPane().setBackground(new Color(247, 248, 252));
		Frame.getContentPane().setLayout(null);
		
        /*
        ============================================================
                                SIDE MENU           
        ============================================================
         */
		
		JPanel pnSideMenu = new JPanel();
		pnSideMenu.setBounds(0, 0, 272, 800);
		pnSideMenu.setBackground(new Color(0, 191, 255));
		Frame.getContentPane().add(pnSideMenu);
		pnSideMenu.setLayout(null);

		JLabel logo = new JLabel();
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/logo.png"));
		logo.setIcon(img);
		logo.setBounds(0, 0, 115, 102);
		pnSideMenu.add(logo);
		
		JLabel lblTitle = new JLabel();
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 30));
		lblTitle.setText("<html>World<br>Computer</html>");
		lblTitle.setBounds(113, 0, 159, 102);
		pnSideMenu.add(lblTitle);
		
		JLabel lblQuanLyCuaHang = new JLabel("Quản lý cửa hàng");
		lblQuanLyCuaHang.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuanLyCuaHang.setFont(new Font("Arial", Font.BOLD, 28));
		lblQuanLyCuaHang.setForeground(new Color(255, 250, 250));
		lblQuanLyCuaHang.setBounds(0, 124, 272, 55);
		pnSideMenu.add(lblQuanLyCuaHang);
				
		btnTongQuan = new JButton("Tổng Quan");
		btnTongQuan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormMainMenu frm = new FormMainMenu(UsersLogin);
				frm.Frame.setVisible(true);
				Frame.dispose();
			}
		});
		btnTongQuan.setFocusable(false);
		btnTongQuan.setOpaque(true);
		btnTongQuan.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnTongQuan.setFont(new Font("Arial", Font.PLAIN, 22));
				btnTongQuan.setBackground(new Color(100, 149, 237));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/1. activeoverview.png"));
				Image newimg = icon.getImage().getScaledInstance(35,35, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnTongQuan.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnTongQuan.setFont(new Font("Arial", Font.PLAIN, 20));
	    		btnTongQuan.setBackground(new Color(100, 149, 237));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/1. activeoverview.png"));
				Image newimg = icon.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnTongQuan.setIcon(icon);
	         }
		});
		btnTongQuan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTongQuan.setHorizontalAlignment(SwingConstants.LEFT);
		btnTongQuan.setFont(new Font("Arial", Font.PLAIN, 20));
		btnTongQuan.setForeground(new Color(255, 250, 250));
		btnTongQuan.setBackground(new Color(100, 149, 237));
		btnTongQuan.setBorder(new EmptyBorder(0, 16, 0, 0));
		btnTongQuan.setBounds(0, 228, 272, 55);
		ImageIcon iconTQ = new ImageIcon(this.getClass().getResource("/1. activeoverview.png"));
		Image newimgTQ = iconTQ.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		iconTQ = new ImageIcon(newimgTQ);
		btnTongQuan.setIcon(iconTQ);
		pnSideMenu.add(btnTongQuan);
		
		btnBanSanPham = new JButton("Bán Sản Phẩm");
		btnBanSanPham.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormBanSanPham frm = new FormBanSanPham(UsersLogin);
				frm.Frame.setVisible(true);
				Frame.dispose();
			}
		});
		btnBanSanPham.setFocusable(false);
		btnBanSanPham.setOpaque(true);
		btnBanSanPham.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnBanSanPham.setFont(new Font("Arial", Font.PLAIN, 22));
				btnBanSanPham.setBackground(new Color(100, 149, 237));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/2. activesale.png"));
				Image newimg = icon.getImage().getScaledInstance(35,35, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnBanSanPham.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnBanSanPham.setFont(new Font("Arial", Font.PLAIN, 20));
	    		btnBanSanPham.setBackground(new Color(0, 191, 255));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/2. sale.png"));
				Image newimg = icon.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnBanSanPham.setIcon(icon);
	         }
		});
		btnBanSanPham.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBanSanPham.setHorizontalAlignment(SwingConstants.LEFT);
		btnBanSanPham.setFont(new Font("Arial", Font.PLAIN, 20));
		btnBanSanPham.setForeground(new Color(255, 250, 250));
		btnBanSanPham.setBackground(new Color(0, 191, 255));
		btnBanSanPham.setBorder(new EmptyBorder(0, 16, 0, 0));
		btnBanSanPham.setBounds(0, 294, 272, 55);
		ImageIcon iconBSP = new ImageIcon(this.getClass().getResource("/2. sale.png"));
		Image newimgBSP= iconBSP.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		iconBSP = new ImageIcon(newimgBSP);
		btnBanSanPham.setIcon(iconBSP);
		pnSideMenu.add(btnBanSanPham);
	
		btnDichVu = new JButton("Dịch Vụ");
		btnDichVu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormDichVu frm = new FormDichVu(UsersLogin);
				frm.Frame.setVisible(true);
				Frame.dispose();
			}
		});
		btnDichVu.setFocusable(false);
		btnDichVu.setOpaque(true);
		btnDichVu.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnDichVu.setFont(new Font("Arial", Font.PLAIN, 22));
				btnDichVu.setBackground(new Color(100, 149, 237));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/3. activeservice.png"));
				Image newimg = icon.getImage().getScaledInstance(35,35, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnDichVu.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnDichVu.setFont(new Font("Arial", Font.PLAIN, 20));
	        	btnDichVu.setBackground(new Color(0, 191, 255));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/3. service.png"));
				Image newimg = icon.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnDichVu.setIcon(icon);
	         }
		});
		btnDichVu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDichVu.setHorizontalAlignment(SwingConstants.LEFT);
		btnDichVu.setFont(new Font("Arial", Font.PLAIN, 20));
		btnDichVu.setForeground(new Color(255, 250, 250));
		btnDichVu.setBackground(new Color(0, 191, 255));
		btnDichVu.setBorder(new EmptyBorder(0, 16, 0, 0));
		btnDichVu.setBounds(0, 360, 272, 55);
		ImageIcon iconDV = new ImageIcon(this.getClass().getResource("/3. service.png"));
		Image newimgDV = iconDV.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		iconDV = new ImageIcon(newimgDV);
		btnDichVu.setIcon(iconDV);
		pnSideMenu.add(btnDichVu);
				
		btnQuanLyKhachHang = new JButton("Quản Lý Khách Hàng");
		btnQuanLyKhachHang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormKhachHang frm = new FormKhachHang(UsersLogin);
				frm.Frame.setVisible(true);
				Frame.dispose();
			}
		});
		btnQuanLyKhachHang.setFocusable(false);
		btnQuanLyKhachHang.setOpaque(true);
		btnQuanLyKhachHang.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnQuanLyKhachHang.setFont(new Font("Arial", Font.PLAIN, 22));
				btnQuanLyKhachHang.setBackground(new Color(100, 149, 237));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/4. activecontacts.png"));
				Image newimg = icon.getImage().getScaledInstance(35,35, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnQuanLyKhachHang.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnQuanLyKhachHang.setFont(new Font("Arial", Font.PLAIN, 20));
	    		btnQuanLyKhachHang.setBackground(new Color(0, 191, 255));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/4. contacts.png"));
				Image newimg = icon.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnQuanLyKhachHang.setIcon(icon);
	         }
		});
		btnQuanLyKhachHang.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnQuanLyKhachHang.setHorizontalAlignment(SwingConstants.LEFT);
		btnQuanLyKhachHang.setFont(new Font("Arial", Font.PLAIN, 20));
		btnQuanLyKhachHang.setForeground(new Color(255, 250, 250));
		btnQuanLyKhachHang.setBackground(new Color(0, 191, 255));
		btnQuanLyKhachHang.setBorder(new EmptyBorder(0, 16, 0, 0));
		btnQuanLyKhachHang.setBounds(0, 426, 272, 55);
		ImageIcon iconQLKH = new ImageIcon(this.getClass().getResource("/4. contacts.png"));
		Image newimgQLKH = iconQLKH.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		iconQLKH = new ImageIcon(newimgQLKH);
		btnQuanLyKhachHang.setIcon(iconQLKH);
		pnSideMenu.add(btnQuanLyKhachHang);
		
		btnQuanLyNhanVien = new JButton("Quản Lý Nhân Viên");
		btnQuanLyNhanVien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormNhanVien frm = new FormNhanVien(UsersLogin);
				frm.Frame.setVisible(true);
				Frame.dispose();
			}
		});
		btnQuanLyNhanVien.setFocusable(false);
		btnQuanLyNhanVien.setOpaque(true);
		btnQuanLyNhanVien.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnQuanLyNhanVien.setFont(new Font("Arial", Font.PLAIN, 22));
				btnQuanLyNhanVien.setBackground(new Color(100, 149, 237));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/5. activeuser.png"));
				Image newimg = icon.getImage().getScaledInstance(35,35, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnQuanLyNhanVien.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnQuanLyNhanVien.setFont(new Font("Arial", Font.PLAIN, 20));
	    		btnQuanLyNhanVien.setBackground(new Color(0, 191, 255));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/5. user.png"));
				Image newimg = icon.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnQuanLyNhanVien.setIcon(icon);
	         }
		});
		btnQuanLyNhanVien.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnQuanLyNhanVien.setHorizontalAlignment(SwingConstants.LEFT);
		btnQuanLyNhanVien.setFont(new Font("Arial", Font.PLAIN, 20));
		btnQuanLyNhanVien.setForeground(new Color(255, 250, 250));
		btnQuanLyNhanVien.setBackground(new Color(0, 191, 255));
		btnQuanLyNhanVien.setBorder(new EmptyBorder(0, 16, 0, 0));
		btnQuanLyNhanVien.setBounds(0, 492, 272, 55);
		ImageIcon iconQLNV = new ImageIcon(this.getClass().getResource("/5. user.png"));
		Image newimgQLNV = iconQLNV.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		iconQLNV = new ImageIcon(newimgQLNV);
		btnQuanLyNhanVien.setIcon(iconQLNV);
		pnSideMenu.add(btnQuanLyNhanVien);
		
		btnQuanLySanPham = new JButton("Quản Lý Sản Phẩm");
		btnQuanLySanPham.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormSanPham frm = new FormSanPham(UsersLogin);
				frm.Frame.setVisible(true);
				Frame.dispose();
			}
		});
		btnQuanLySanPham.setFocusable(false);
		btnQuanLySanPham.setOpaque(true);
		btnQuanLySanPham.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnQuanLySanPham.setFont(new Font("Arial", Font.PLAIN, 22));
				btnQuanLySanPham.setBackground(new Color(100, 149, 237));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/6. activedelivery.png"));
				Image newimg = icon.getImage().getScaledInstance(35,35, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnQuanLySanPham.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnQuanLySanPham.setFont(new Font("Arial", Font.PLAIN, 20));
	    		btnQuanLySanPham.setBackground(new Color(0, 191, 255));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/6. delivery.png"));
				Image newimg = icon.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnQuanLySanPham.setIcon(icon);
	         }
		});
		btnQuanLySanPham.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnQuanLySanPham.setHorizontalAlignment(SwingConstants.LEFT);
		btnQuanLySanPham.setFont(new Font("Arial", Font.PLAIN, 20));
		btnQuanLySanPham.setForeground(new Color(255, 250, 250));
		btnQuanLySanPham.setBackground(new Color(0, 191, 255));
		btnQuanLySanPham.setBorder(new EmptyBorder(0, 16, 0, 0));
		btnQuanLySanPham.setBounds(0, 557, 272, 55);
		ImageIcon iconQLSP = new ImageIcon(this.getClass().getResource("/6. delivery.png"));
		Image newimgQLSP = iconQLSP.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		iconQLSP = new ImageIcon(newimgQLSP);
		btnQuanLySanPham.setIcon(iconQLSP);
		pnSideMenu.add(btnQuanLySanPham);
		
		btnDoanhThu = new JButton("Doanh thu");
		btnDoanhThu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormDoanhThu frm = new FormDoanhThu(UsersLogin);
				frm.Frame.setVisible(true);
				Frame.dispose();
			}
		});
		btnDoanhThu.setFocusable(false);
		btnDoanhThu.setOpaque(true);
		btnDoanhThu.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnDoanhThu.setFont(new Font("Arial", Font.PLAIN, 22));
				btnDoanhThu.setBackground(new Color(100, 149, 237));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/7. activerevenue.png"));
				Image newimg = icon.getImage().getScaledInstance(35,35, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnDoanhThu.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnDoanhThu.setFont(new Font("Arial", Font.PLAIN, 20));
	    		btnDoanhThu.setBackground(new Color(0, 191, 255));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/7. revenue.png"));
				Image newimg = icon.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnDoanhThu.setIcon(icon);
	         }
		});
		btnDoanhThu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDoanhThu.setHorizontalAlignment(SwingConstants.LEFT);
		btnDoanhThu.setFont(new Font("Arial", Font.PLAIN, 20));
		btnDoanhThu.setForeground(new Color(255, 250, 250));
		btnDoanhThu.setBackground(new Color(0, 191, 255));
		btnDoanhThu.setBorder(new EmptyBorder(0, 16, 0, 0));
		btnDoanhThu.setBounds(0, 623, 272, 55);
		ImageIcon iconDT = new ImageIcon(this.getClass().getResource("/7. revenue.png"));
		Image newimgDT = iconDT.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		iconDT = new ImageIcon(newimgDT);
		btnDoanhThu.setIcon(iconDT);
		pnSideMenu.add(btnDoanhThu);
		
		btnDangXuat = new JButton("Đăng Xuất");
		btnDangXuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangXuat();
			}
		});
		btnDangXuat.setFocusable(false);
		btnDangXuat.setOpaque(true);
		btnDangXuat.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnDangXuat.setFont(new Font("Arial", Font.PLAIN, 22));
				btnDangXuat.setBackground(new Color(100, 149, 237));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/logout.png"));
				Image newimg = icon.getImage().getScaledInstance(35,35, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnDangXuat.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnDangXuat.setFont(new Font("Arial", Font.PLAIN, 20));
	        	btnDangXuat.setBackground(new Color(0, 191, 255));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/logout.png"));
				Image newimg = icon.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnDangXuat.setIcon(icon);
	         }
		});
		btnDangXuat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDangXuat.setHorizontalAlignment(SwingConstants.LEFT);
		btnDangXuat.setFont(new Font("Arial", Font.PLAIN, 20));
		btnDangXuat.setForeground(new Color(255, 250, 250));
		btnDangXuat.setBackground(new Color(0, 191, 255));
		btnDangXuat.setBorder(new EmptyBorder(0, 16, 0, 0));
		btnDangXuat.setBounds(0, 745, 272, 55);
		ImageIcon iconDX = new ImageIcon(this.getClass().getResource("/logout.png"));
		Image newimgDX = iconDX.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		iconDX = new ImageIcon(newimgDX);
		btnDangXuat.setIcon(iconDX);
		pnSideMenu.add(btnDangXuat);
		
        /*
        ============================================================
                                MAIN PANEL           
        ============================================================
         */
		
		JPanel pnMain = new JPanel();
		pnMain.setBounds(272, 0, 1008, 800);
		pnMain.setLayout(null);
		pnMain.setBackground(new Color(247, 248, 252));
		Frame.getContentPane().add(pnMain);
		
		btnBanSanPham2 = new JButton();
		btnBanSanPham2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormBanSanPham frm = new FormBanSanPham(UsersLogin);
				frm.Frame.setVisible(true);
				Frame.dispose();
			}
		});
		btnBanSanPham2.setFocusPainted(false);
		btnBanSanPham2.setBounds(63, 203, 200, 150);
		btnBanSanPham2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBanSanPham2.setOpaque(true);
		btnBanSanPham2.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
	            btnBanSanPham2.setBackground(new Color(247, 248, 252));
	            btnBanSanPham2.setBorder(BorderFactory.createLineBorder(Color.black,3));
	            btnBanSanPham2.setFont(new Font("Arial", Font.PLAIN, 20));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/user-plus.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnBanSanPham2.setIcon(icon1);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	            btnBanSanPham2.setBackground(new Color(247, 248, 252));
	            btnBanSanPham2.setBorder(null);
	            btnBanSanPham2.setFont(new Font("Arial", Font.PLAIN, 17));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/user-plus.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnBanSanPham2.setIcon(icon1);
	         }
		});
		btnBanSanPham2.setBackground(new Color(247, 248, 252));
		btnBanSanPham2.setFont(new Font("Arial", Font.PLAIN, 17));
		btnBanSanPham2.setText("Bán Sản Phẩm");
		btnBanSanPham2.setBorder(null);
		btnBanSanPham2.setHorizontalAlignment(SwingConstants.CENTER);   
		btnBanSanPham2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnBanSanPham2.setHorizontalTextPosition(SwingConstants.CENTER);
		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/user-plus.png"));
		Image newimg1 = icon1.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
		icon1 = new ImageIcon(newimg1);
		btnBanSanPham2.setIcon(icon1);
		pnMain.add(btnBanSanPham2);
		
		btnDichVu2 = new JButton();
		btnDichVu2.setFocusPainted(false);
		btnDichVu2.setBounds(297, 203, 200, 150);
		btnDichVu2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDichVu2.setOpaque(true);
		btnDichVu2.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
	            btnDichVu2.setBorder(BorderFactory.createLineBorder(Color.black,3));
	            btnDichVu2.setFont(new Font("Arial", Font.PLAIN, 20));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/Calendar.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnDichVu2.setIcon(icon1);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	            btnDichVu2.setBorder(null);
	            btnDichVu2.setFont(new Font("Arial", Font.PLAIN, 17));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/Calendar.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnDichVu2.setIcon(icon1);
	         }
		});
		btnDichVu2.setBackground(new Color(247, 248, 252));
		btnDichVu2.setFont(new Font("Arial", Font.PLAIN, 17));
		btnDichVu2.setText("Dịch Vụ");
		btnDichVu2.setBorder(null);
		btnDichVu2.setHorizontalAlignment(SwingConstants.CENTER);   
		btnDichVu2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnDichVu2.setHorizontalTextPosition(SwingConstants.CENTER);
		ImageIcon icon2 = new ImageIcon(this.getClass().getResource("/Calendar.png"));
		Image newimg2 = icon2.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
		icon2 = new ImageIcon(newimg2);
		btnDichVu2.setIcon(icon2);
		pnMain.add(btnDichVu2);
		
		btnQuanLyKhachHang2 = new JButton();
		btnQuanLyKhachHang2.setFocusPainted(false);
		btnQuanLyKhachHang2.setBounds(531, 203, 200, 150);
		btnQuanLyKhachHang2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnQuanLyKhachHang2.setOpaque(true);
		btnQuanLyKhachHang2.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {

	            btnQuanLyKhachHang2.setBorder(BorderFactory.createLineBorder(Color.black,3));
	            btnQuanLyKhachHang2.setFont(new Font("Arial", Font.PLAIN, 20));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/Receipt.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnQuanLyKhachHang2.setIcon(icon1);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {

	            btnQuanLyKhachHang2.setBorder(null);
	            btnQuanLyKhachHang2.setFont(new Font("Arial", Font.PLAIN, 17));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/Receipt.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnQuanLyKhachHang2.setIcon(icon1);
	         }
		});
		btnQuanLyKhachHang2.setBackground(new Color(247, 248, 252));
		btnQuanLyKhachHang2.setFont(new Font("Arial", Font.PLAIN, 17));
		btnQuanLyKhachHang2.setText("Quản Lý Khách Hàng");
		btnQuanLyKhachHang2.setBorder(null);
		btnQuanLyKhachHang2.setHorizontalAlignment(SwingConstants.CENTER);   
		btnQuanLyKhachHang2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnQuanLyKhachHang2.setHorizontalTextPosition(SwingConstants.CENTER);
		ImageIcon icon3 = new ImageIcon(this.getClass().getResource("/Receipt.png"));
		Image newimg3 = icon3.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
		icon3 = new ImageIcon(newimg3);
		btnQuanLyKhachHang2.setIcon(icon3);
		pnMain.add(btnQuanLyKhachHang2);

		btnQuanLyNhanVien2 = new JButton();
		btnQuanLyNhanVien2.setFocusPainted(false);
		btnQuanLyNhanVien2.setBounds(765, 203, 200, 150);
		btnQuanLyNhanVien2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnQuanLyNhanVien2.setOpaque(true);
		btnQuanLyNhanVien2.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {

	            btnQuanLyNhanVien2.setBorder(BorderFactory.createLineBorder(Color.black,3));
	            btnQuanLyNhanVien2.setFont(new Font("Arial", Font.PLAIN, 20));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/package.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnQuanLyNhanVien2.setIcon(icon1);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {

	            btnQuanLyNhanVien2.setBorder(null);
	            btnQuanLyNhanVien2.setFont(new Font("Arial", Font.PLAIN, 17));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/package.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnQuanLyNhanVien2.setIcon(icon1);
	         }
		});
		btnQuanLyNhanVien2.setBackground(new Color(247, 248, 252));
		btnQuanLyNhanVien2.setFont(new Font("Arial", Font.PLAIN, 17));
		btnQuanLyNhanVien2.setText("Quản Lý Nhân Viên");
		btnQuanLyNhanVien2.setBorder(null);
		btnQuanLyNhanVien2.setHorizontalAlignment(SwingConstants.CENTER);   
		btnQuanLyNhanVien2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnQuanLyNhanVien2.setHorizontalTextPosition(SwingConstants.CENTER);
		ImageIcon icon4 = new ImageIcon(this.getClass().getResource("/package.png"));
		Image newimg4 = icon4.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
		icon4 = new ImageIcon(newimg4);
		btnQuanLyNhanVien2.setIcon(icon4);
		pnMain.add(btnQuanLyNhanVien2);
		
		btnQuanLySanPham2 = new JButton();
		btnQuanLySanPham2.setFocusPainted(false);
		btnQuanLySanPham2.setBounds(63, 390, 200, 150);
		btnQuanLySanPham2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnQuanLySanPham2.setOpaque(true);
		btnQuanLySanPham2.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {

				btnQuanLySanPham2.setBorder(BorderFactory.createLineBorder(Color.black,3));
				btnQuanLySanPham2.setFont(new Font("Arial", Font.PLAIN, 20));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/Wrench.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnQuanLySanPham2.setIcon(icon1);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {

	        	btnQuanLySanPham2.setBorder(null);
	        	btnQuanLySanPham2.setFont(new Font("Arial", Font.PLAIN, 17));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/Wrench.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnQuanLySanPham2.setIcon(icon1);
	         }
		});
		btnQuanLySanPham2.setBackground(new Color(247, 248, 252));
		btnQuanLySanPham2.setFont(new Font("Arial", Font.PLAIN, 17));
		btnQuanLySanPham2.setText("Quản Lý Sản Phẩm");
		btnQuanLySanPham2.setBorder(null);
		btnQuanLySanPham2.setHorizontalAlignment(SwingConstants.CENTER);   
		btnQuanLySanPham2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnQuanLySanPham2.setHorizontalTextPosition(SwingConstants.CENTER);
		ImageIcon icon5 = new ImageIcon(this.getClass().getResource("/Wrench.png"));
		Image newimg5 = icon5.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
		icon5 = new ImageIcon(newimg5);
		btnQuanLySanPham2.setIcon(icon5);
		pnMain.add(btnQuanLySanPham2);
		
		btnDoanhThu2 = new JButton();
		btnDoanhThu2.setFocusPainted(false);
		btnDoanhThu2.setBounds(297, 390, 200, 150);
		btnDoanhThu2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDoanhThu2.setOpaque(true);
		btnDoanhThu2.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnDoanhThu2.setBorder(BorderFactory.createLineBorder(Color.black,3));
				btnDoanhThu2.setFont(new Font("Arial", Font.PLAIN, 20));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/shopping-bag.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnDoanhThu2.setIcon(icon1);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnDoanhThu2.setBorder(null);
	        	btnDoanhThu2.setFont(new Font("Arial", Font.PLAIN, 17));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/shopping-bag.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnDoanhThu2.setIcon(icon1);
	         }
		});
		btnDoanhThu2.setBackground(new Color(247, 248, 252));
		btnDoanhThu2.setFont(new Font("Arial", Font.PLAIN, 17));
		btnDoanhThu2.setText("Doanh Thu");
		btnDoanhThu2.setBorder(null);
		btnDoanhThu2.setHorizontalAlignment(SwingConstants.CENTER);   
		btnDoanhThu2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnDoanhThu2.setHorizontalTextPosition(SwingConstants.CENTER);
		ImageIcon icon6 = new ImageIcon(this.getClass().getResource("/shopping-bag.png"));
		Image newimg6 = icon6.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
		icon6 = new ImageIcon(newimg6);
		btnDoanhThu2.setIcon(icon6);
		pnMain.add(btnDoanhThu2);
		
		/*JButton btnTinhTrangKho = new JButton();
		btnTinhTrangKho.setFocusPainted(false);
		btnTinhTrangKho.setBounds(531, 390, 200, 150);
		btnTinhTrangKho.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTinhTrangKho.setOpaque(true);
		btnTinhTrangKho.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {

				btnTinhTrangKho.setBorder(BorderFactory.createLineBorder(Color.black,3));
				btnTinhTrangKho.setFont(new Font("Arial", Font.PLAIN, 20));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/save.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnTinhTrangKho.setIcon(icon1);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnTinhTrangKho.setBorder(null);
	        	btnTinhTrangKho.setFont(new Font("Arial", Font.PLAIN, 17));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/save.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnTinhTrangKho.setIcon(icon1);
	         }
		});
		btnTinhTrangKho.setBackground(new Color(247, 248, 252));
		btnTinhTrangKho.setFont(new Font("Arial", Font.PLAIN, 17));
		btnTinhTrangKho.setText("Tình trạng kho");
		btnTinhTrangKho.setBorder(null);  
		btnTinhTrangKho.setHorizontalAlignment(SwingConstants.CENTER);   
		btnTinhTrangKho.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnTinhTrangKho.setHorizontalTextPosition(SwingConstants.CENTER);
		ImageIcon icon7 = new ImageIcon(this.getClass().getResource("/save.png"));
		Image newimg7 = icon7.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
		icon7 = new ImageIcon(newimg7);
		btnTinhTrangKho.setIcon(icon7);
		pnMain.add(btnTinhTrangKho);
		
		JButton btnDuLieuSanPham = new JButton();
		btnDuLieuSanPham.setFocusPainted(false);
		btnDuLieuSanPham.setBounds(765, 390, 200, 150);
		btnDuLieuSanPham.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDuLieuSanPham.setOpaque(true);
		btnDuLieuSanPham.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnDuLieuSanPham.setBorder(BorderFactory.createLineBorder(Color.black,3));
				btnDuLieuSanPham.setFont(new Font("Arial", Font.PLAIN, 20));
	            ImageIcon icon = new ImageIcon(this.getClass().getResource("/database.png"));
	            Image newimg = icon.getImage().getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH);
	            icon = new ImageIcon(newimg);
	            btnDuLieuSanPham.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnDuLieuSanPham.setBorder(null);
	        	btnDuLieuSanPham.setFont(new Font("Arial", Font.PLAIN, 17));
	            ImageIcon icon = new ImageIcon(this.getClass().getResource("/database.png"));
	            Image newimg = icon.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
	            icon = new ImageIcon(newimg);
	            btnDuLieuSanPham.setIcon(icon);
	         }
		});
		btnDuLieuSanPham.setBackground(new Color(247, 248, 252));
		btnDuLieuSanPham.setFont(new Font("Arial", Font.PLAIN, 17));
		btnDuLieuSanPham.setText("Dữ liệu sản phẩm");
		btnDuLieuSanPham.setBorder(null);
		btnDuLieuSanPham.setHorizontalAlignment(SwingConstants.CENTER);   
		btnDuLieuSanPham.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnDuLieuSanPham.setHorizontalTextPosition(SwingConstants.CENTER);
		ImageIcon icon8 = new ImageIcon(this.getClass().getResource("/database.png"));
		Image newimg8 = icon8.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
		icon8 = new ImageIcon(newimg8);
		btnDuLieuSanPham.setIcon(icon8);
		pnMain.add(btnDuLieuSanPham);*/
		
	}
	
    /*
    ============================================================
                            EVENTS           
    ============================================================
     */
	
	private void XuLyDangXuat() {
		int qes;
		qes = JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn đăng xuất khỏi chương trình?", "Question",JOptionPane.YES_NO_OPTION);			 
		if(qes == JOptionPane.YES_OPTION){
			FormDangNhap frm = new FormDangNhap();
			frm.Frame.setVisible(true);
			Frame.dispose();
		}
	}
	
	private void PhanQuyen(NhanVienDTO UserLogin) {
		if(UserLogin.getNhanVien_Type()==0) {
			btnQuanLyNhanVien.setEnabled(false);
			btnQuanLySanPham.setEnabled(false);
			btnDoanhThu.setEnabled(false);
			btnQuanLyNhanVien2.setEnabled(false);
			btnQuanLySanPham2.setEnabled(false);
			btnDoanhThu2.setEnabled(false);
		}
	}
}
