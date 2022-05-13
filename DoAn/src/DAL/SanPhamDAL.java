package DAL;

import DTO.SanPhamDTO;
import java.sql.*;
import java.util.Vector;

public class SanPhamDAL extends KetNoiCSDL {
	public Vector<SanPhamDTO> LayDSSanPham(){
		Vector<SanPhamDTO> arr = new Vector<SanPhamDTO>();
		if (openConnection()) {
		try{
			String sql = "SELECT * FROM SANPHAM";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				SanPhamDTO SanPham = new SanPhamDTO();
				SanPham.setSanPham_ID(rs.getString("MASP"));
				SanPham.setSanPham_Name(rs.getString("TENSP"));
				SanPham.setSanPham_Type(rs.getInt("MALOAISP"));
				SanPham.setSanPham_Price(rs.getInt("GIA"));
				SanPham.setSanPham_Amount(rs.getInt("SOLUONG"));
				arr.add(SanPham);
				}
			}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			closeConnection();
		} }
		return arr;
	}
    public Vector<SanPhamDTO> LayDSSanPhamTheoLoai(int LoaiSanPham) {
    	Vector<SanPhamDTO> arr = new Vector<SanPhamDTO>();
    	if (openConnection()) {
    		try{
    			String sql = "SELECT * FROM SANPHAM WHERE MALOAISP="+LoaiSanPham;
    			Statement stmt = con.createStatement();
    			ResultSet rs = stmt.executeQuery(sql);
    			while(rs.next()){
    				SanPhamDTO SanPham = new SanPhamDTO();
    				SanPham.setSanPham_ID(rs.getString("MASP"));
    				SanPham.setSanPham_Name(rs.getString("TENSP"));
    				SanPham.setSanPham_Type(rs.getInt("MALOAISP"));
    				SanPham.setSanPham_Price(rs.getInt("GIA"));
    				SanPham.setSanPham_Amount(rs.getInt("SOLUONG"));
    				arr.add(SanPham);
    				}
    			}
    		catch(Exception e){
    			System.out.println(e);
    		}
    		finally{
    			closeConnection();
    		} }
    	return arr;
    }
	public boolean hasSanPham_ID(String ID){
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "SELECT * FROM SANPHAM WHERE MASP=?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, ID);
				ResultSet rs = stmt.executeQuery();
				result = rs.next();
			} catch (SQLException ex) {
				System.out.println(ex);
			} finally { 
				closeConnection(); 
			} }
		return result;
	}
	
	public boolean addSanPham(SanPhamDTO SP) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "INSERT INTO SANPHAM VALUES(?,?,?,?,?)";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, SP.getSanPham_ID());
				stmt.setString(2, SP.getSanPham_Name());
				stmt.setInt(3, SP.getSanPham_Type());
				stmt.setInt(4, SP.getSanPham_Price());
				stmt.setInt(5, SP.getSanPham_Amount());
				if (stmt.executeUpdate()>=1)
					result = true;
				} catch (SQLException ex) {
					System.out.println(ex);
				} finally{
					closeConnection(); 
				} }
		return result;
	}
	
	public boolean deleteSanPham(SanPhamDTO SP) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "DELETE SANPHAM WHERE MASP=?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, SP.getSanPham_ID());
			if (stmt.executeUpdate()>=1)
				result = true;
			} catch (SQLException ex) {
				System.out.println(ex);
			} finally{
				closeConnection(); 
			} }
		return result;
	}
	
	public boolean editSanPham(SanPhamDTO SP) {
		boolean result = false;
		if(openConnection()){
			try{
				String sql = "UPDATE SANPHAM SET TENSP=? , MALOAISP=? , GIA=? , SOLUONG=? WHERE MASP=?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, SP.getSanPham_Name());
				stmt.setInt(2, SP.getSanPham_Type());
				stmt.setInt(3, SP.getSanPham_Price());
				stmt.setInt(4, SP.getSanPham_Amount());
				stmt.setString(5, SP.getSanPham_ID());
			if (stmt.executeUpdate()>=1)
				result = true;
			} catch(SQLException ex){
				System.out.println();
			} finally{
				closeConnection();
			} 
		}		
		return result;
	}
	public boolean UpdateSLSanPham(String MaSP,int TonKhoMoi) {
		boolean result = false;
		if(openConnection()){
			try{
				System.out.println("DAL UPDATE "+TonKhoMoi);
				String sql = "UPDATE SANPHAM SET SOLUONG=? WHERE MASP=?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setInt(1, TonKhoMoi);
				stmt.setString(2, MaSP);
			if (stmt.executeUpdate()>=1)
				result = true;
			} catch(SQLException ex){
				System.out.println();
			} finally{
				closeConnection();
			} 
		}		
		return result;
	}

	public int LaySLSPTheoMaSP (String MaSP) {
		if (openConnection()) {
			try {
				String sql = "SELECT SOLUONG FROM SANPHAM WHERE MASP=?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, MaSP);
				ResultSet rs = stmt.executeQuery();
	            if (rs.next()) {
	                return rs.getInt("SOLUONG");
	            }
			} catch (SQLException ex) {
				System.out.println(ex);
			} finally{
				closeConnection(); 
			} }
		return -1;
	}
}