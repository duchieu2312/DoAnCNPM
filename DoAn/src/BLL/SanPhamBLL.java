package BLL;

import DAL.SanPhamDAL;
import DTO.SanPhamDTO;
import java.util.Vector;

public class SanPhamBLL {
	SanPhamDAL SPDAL = new SanPhamDAL();
	public Vector<SanPhamDTO> LayDSSanPham(){
		return SPDAL.LayDSSanPham();
	}
	public Vector<SanPhamDTO> LayDSSanPhamTheoLoai(int Loai){
		return SPDAL.LayDSSanPhamTheoLoai(Loai);
	}
	public String addSanPham(SanPhamDTO SP) {
		if (SPDAL.hasSanPham_ID(SP.getSanPham_ID()))
			return "Mã Sản Phẩm đã tồn tại";
		if (SPDAL.addSanPham(SP))
			return "Thêm thành công";
		return "Thêm thất bại";
	}
	public String deleteSanPham(SanPhamDTO SP){
		if(SPDAL.deleteSanPham(SP))
			return "Xóa thành công";
		return "Xóa thất bại";	
	}
	public String editSanPham(SanPhamDTO SP){
		if (SPDAL.hasSanPham_ID(SP.getSanPham_ID())==false)
			return "Mã Sản Phẩm không tồn tại";
		if(SPDAL.editSanPham(SP))
			return "Sửa thành công";
		return "Sửa thất bại";	
	}
	public boolean UpdateSLSanPham(String MaSP,int TonKhoMoi) {
		if (SPDAL.UpdateSLSanPham(MaSP, TonKhoMoi))
			return true;
		return false;
	}
	public int LaySLSPTheoMaSP(String MaSP) {
		return SPDAL.LaySLSPTheoMaSP(MaSP);
	}
}