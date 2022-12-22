package QuanLyCuaHang;

import java.util.Scanner;

public class Service {
	public NhanVienOrder nhanVien;
	public  void openStore() {
		int luaChon;
		do {
			luaChon=getLuaChon();
		}while(luaChon!=5);
	}
	public int getLuaChon() {
		System.out.println("1.Goi Mon \n 2.Them Mon \n 3.Kiem Tra Cho Ngoi \n 4.In bill \n 5.roi khoi quan");
		int luaChon=new Scanner(System.in).nextInt();
		getLoaiLuaChon(luaChon);
		return luaChon;
	}
	public void getLoaiLuaChon(int luaChon) {
		this.nhanVien=NhanVienOrder.getInstance();
		if(luaChon==1) {
			System.out.println("nhap so luong mon: ");
			int soLuong= new Scanner(System.in).nextInt();
			nhanVien.goiMon(soLuong);
		}else if(luaChon==2) {
			nhanVien.themMon();
		}else if(luaChon==3) {
			
		}else {
			nhanVien.printBill();
		}
	}
}

