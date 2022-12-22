package QuanLyCuaHang;

import java.util.Date;
import java.util.Scanner;

public class NhanVienOrder {
	public static NhanVienOrder nhanVien;
	public static HOADON hoaDon;
	public static MON[] order;
	private Scanner sc=new Scanner(System.in);
	public static NhanVienOrder getInstance() {
		if(nhanVien==null) {
			nhanVien=new NhanVienOrder();
		}
		return nhanVien;
	}
	public MON[] goiMon(int soLuong) {
		order = new MON[soLuong];
		String[] meats=getMeats();
		for(int i=0;i<soLuong;i++) {
			order[i]=getMonAn(meats);
		}
		return order;
	}
	public MON getMonAn(String[] meats) {
		System.out.println("1.Pho \n 2.Do An Kem ");
		MON order;
		int type = sc.nextInt();
		int soLuong;
		if(type ==1) {
			System.out.println("Nhap so luong Pho: ");
			soLuong = sc.nextInt();
			order= new PHO(meats.length, meats,soLuong);
		}else {
			System.out.println("Nhap so luong Mon Them: ");
			soLuong=sc.nextInt();
			order=getMonKem();
		}
		return order;
	}
	
	public MON getMonKem() {
		System.out.println("1.Quẩy \n 2.Hột gà \n 3.Bánh Phở thêm \n 4.Tiết \n 5.tiết hột gà \n 6.thịt thêm ");
		int loai= sc.nextInt();
		return getLoaiMonKem(loai);
	}
	public MON getLoaiMonKem(int luaChon) {
		MON order = new MON();
		if(luaChon==1) {
			return order.getQuay();
		}else if(luaChon==2) {
			return order.getHotGa();
		}else if(luaChon==3) {
			return order.getBanhPhoThem();
		}else if(luaChon==4) {
			return order.getTiet();
		}else if(luaChon==5) {
			return order.getTietHotGa();
		}else{
			return order.getThitThem();
		}
	}
	public String[] getMeats() {
		System.out.println("nhap loai to");
		int size =checkTypeAndGetSize();
		String[] meats=getOrderMeat(size);
		return meats;
	}
	public String[] getOrderMeat(int soLuong) {
		System.out.println("1.Tái \n 2.Nạm \n 3.gầu \n 4.gân \n 5.bò vò viên \n Mời bạn nhập lựa chọn: ");
		String[] meats=new String[soLuong];
		int luaChon;
		for(int i=0;i<soLuong;i++) {
			System.out.println("Loai thit thu" +i+1+" la: ");
			luaChon=sc.nextInt();
			meats[i]=loaiThit(luaChon);
		}
		return meats;
	}
	public String loaiThit(int luaChon) {
		if(luaChon==1) {
			return "Tái";
		}else if(luaChon==2) {
			return "Nạm";
		}else if(luaChon==3) {
			return "gầu";
		}else if(luaChon==4) {
			return "gân";
		}else if(luaChon==5) {}
			return "Bò vò viên";
	}
	public int checkTypeAndGetSize() {
		System.out.println("1. To Lon (4 topping) \n 2.To Vua (3 topping) \n 3.To Nho (2 toppping)");
		int type=sc.nextInt();
		if(type ==1) {
			return 4;
		}else if(type ==2) {
			return 3;
		}
		return 2;
	}
	public void themMon() {
		System.out.println("nhap so luong: ");
		int soLuong= sc.nextInt();
		MON[] addingOrder= goiMon(soLuong);
		for(MON mon: addingOrder) {
			NhanVienOrder.getInstance().hoaDon.themMon(mon);
			
		}
	}
	public static void printBill() {
		Date today = new Date();
		if(hoaDon==null) {
			hoaDon=new HOADON(order, 1, "nv01", "nv02", today, "hd01");
		}
		System.out.println(hoaDon);
	}
}
