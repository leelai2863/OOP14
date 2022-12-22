package QuanLyCuaHang;
import java.util.Date;
import java.util.Arrays;

import java.util.Date;
public class HOADON {
	MON[] mon;
	int soBan;
	String nv1, nv2;
	Date tgian = new Date();
	String maHoaDon;
	
	public HOADON(MON order[], int SB, String NV1, String NV2, Date orderDate, String MHD) {
		mon = order;
		this.soBan = SB; 
		nv1 = NV1;
		nv2 = NV2;
		tgian = orderDate;
		maHoaDon = MHD;
	}
	public void themMon(MON order) {
		for(int i = 0; i < this.mon.length; i++) {
			if(this.mon[i].tenMon == order.tenMon) {
				this.mon[i].setSoluong(this.mon[i].getSoluong() + 1);
				return;
			}
		}
		MON[] temp = new MON[this.mon.length + 1];
		for(int i = 0; i<mon.length; i++)
			temp[i] = mon[i];
		temp[mon.length] = order;
		mon = temp;
	}
	public void themMon(MON order, int soluong) {
		for(int i = 0; i < this.mon.length; i++) {
			if(this.mon[i].tenMon == order.tenMon) {
				this.mon[i].setSoluong(this.mon[i].getSoluong() + soluong);
				return;
			}
		}
		MON[] temp = new MON[this.mon.length + 1];
		for(int i = 0; i<mon.length; i++)
			temp[i] = mon[i];
		temp[mon.length] = order;
		temp[mon.length].setSoluong(soluong);
		mon = temp;
	}
	public int tongTien() {
		int temp = 0;
		for(int i = 0; i<this.mon.length; i++)
			temp += this.mon[i].getGia();
		return temp;
	}
	public String listMon() {
		String temp = "";
		for(int i = 0; i<mon.length; i++) {
			temp +=mon[i].toString();
		}
		return temp;
	}
	@Override
	public String toString() {
		return "Hóa Đơn" + listMon() + ", \nsố bàn=" + soBan + ", \nnv1=" + nv1 + ", \nnv2=" + nv2 + ", \nthời gian="
				+ tgian + ", \nmã hóa đơn=" + maHoaDon + "\ntổng tiền=" + tongTien();
	}
}
