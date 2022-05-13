package DAL;
import DTO.HoaDonBanDTO;
import java.sql.*;


public class HoaDonBanDAL extends KetNoiCSDL{
	public boolean addHoaDon(HoaDonBanDTO HoaDon) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "INSERT INTO HOADONBAN VALUES (?,?,?,?)";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setInt(1,HoaDon.getHoaDonBan_IDKH());
				stmt.setInt(2,HoaDon.getHoaDonBan_IDNV());
				stmt.setDate(3,HoaDon.getHoaDonBan_DateHD());
				stmt.setInt(4,0);	
				if (stmt.executeUpdate()>=1)
					result = true;
				} catch (SQLException ex) {
					System.out.println(ex);
				} finally{
					closeConnection(); 
				} }
		return result;
	}
	
	public int LayHoaDonMoiNhat(){
		if (openConnection()) {
			try{
				String sql = "SELECT MAX(MAHDB) FROM HOADONBAN";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					int id = rs.getInt(1);	
					return id;
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
			finally{
				closeConnection();
			} 
		}
		return -1;
	}
	
	public boolean deleteHoaDon(int idHoaDon){
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "DELETE HOADONBAN WHERE MAHDB=?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setInt(1, idHoaDon);
			if (stmt.executeUpdate()>=1)
				result = true;
			} catch (SQLException ex) {
				System.out.println(ex);
			} finally{
				closeConnection(); 
			} }
		return result;
	}
	public boolean updateTongTien(int idHoaDon,int TongTien){
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "UPDATE HOADONBAN SET TONGTIEN = ? WHERE MAHDB= ?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setInt(1,TongTien);
				stmt.setInt(2, idHoaDon);
			if (stmt.executeUpdate()>=1)
				result = true;
			} catch (SQLException ex) {
				System.out.println(ex);
			} finally{
				closeConnection(); 
			} }
		return result;
	}
}
