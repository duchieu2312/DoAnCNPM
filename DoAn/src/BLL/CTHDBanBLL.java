package BLL;

import java.util.Vector;

import DAL.CTHDBanDAL;
import DTO.CTHDBanDTO;

public class CTHDBanBLL {
	CTHDBanDAL CTHDBDAL = new CTHDBanDAL();
	public Vector<CTHDBanDTO> LayCTHDTheoMAHD(int MAHDB){
		return CTHDBDAL.LayCTHDTheoMaHDB(MAHDB);
	}
	public boolean addCTHDBan(CTHDBanDTO CTHD) {
		if (CTHDBDAL.addCTHDBan(CTHD))
			return true;
		return false;
	}
	public String deleteCTHDBan(int idhdb, String idsp) {
		if (CTHDBDAL.deleteCTHDBan(idhdb,idsp))
			return "Xóa thành công";
		return "Xóa thất bại";
	}
}
