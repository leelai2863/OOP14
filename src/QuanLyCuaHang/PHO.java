package QuanLyCuaHang;

import java.util.Arrays;

public class PHO extends MON{
	int loai;
	String[] thit;
	
	public PHO 	(int Loai, String[] Thit, int soluong) {
		super();
		if(Loai < 2 && Loai >4)
			return;
		String temp = "";
		for(int i = 0; i< Thit.length; i++)
			temp += Thit[i] + " ";
		if(Loai == 2) {
			super.setGia(45000);
			super.setDvt("chén");
			super.setTenMon("tô nhỏ " + temp);
			super.setSoluong(soluong);
		}
		if(Loai == 3) {
			super.setGia(60000);
			super.setDvt("chén");
			super.setTenMon("tô lớn " + temp);
			super.setSoluong(soluong);
		}
		if(Loai == 4) {
			super.setGia(75000);
			super.setDvt("tô lớn");
			super.setTenMon("tô đặc biệt " + temp);
			super.setSoluong(soluong);
		}
		this.loai = Loai;
		this.thit = Thit;
	}
	
	@Override
	public int getGia() {
		if(loai == 0) {
			System.out.println("khong co trong hoa don");
			return 0;
		}
		return super.getGia();
	}

	@Override
	public String toString() {
		return "\nPhở [loại= " + loai + ", tên=" + super.getTenMon() + ", giá=" + getGia() + ", số lượng="+ super.getSoluong() +"]";
	}
	
}
