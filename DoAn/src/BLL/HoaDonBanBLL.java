package BLL;
import DAL.HoaDonBanDAL;
import DTO.HoaDonBanDTO;
import java.util.Vector;
import javax.swing.JOptionPane;

public class HoaDonBanBLL {
	HoaDonBanDAL HoaDonBanDAL = new HoaDonBanDAL();
	public String addHoaDon(HoaDonBanDTO HoaDon) {
		if (HoaDonBanDAL.addHoaDon(HoaDon))
			return "Thêm thành công";
		return "Thêm thất bại";
	}
	public String deleteHoaDon() {
		int idHoaDon = HoaDonBanDAL.LayHoaDonMoiNhat();
		if(HoaDonBanDAL.deleteHoaDon(idHoaDon))
			return "Xóa thành công";
		return "Xóa thất bại";	
	}
	public int LayHoaDonMoiNhat() {
		return HoaDonBanDAL.LayHoaDonMoiNhat();
	}
	public String ThanhToan(int TongTien){
		int idHoaDon = HoaDonBanDAL.LayHoaDonMoiNhat();
		if(HoaDonBanDAL.updateTongTien(idHoaDon, TongTien))
			return "Thanh toán thành công";
		return "Thanh toán thất bại";	
		
	}
}
