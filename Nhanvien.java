package Quanlinhanvien;

public class Nhanvien {
	String name;
	String manv;
	String ngaysinh;
	float sogio;
	float hesoluong;
	double phucap;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManv() {
		return manv;
	}
	public void setManv(String manv) {
		this.manv = manv;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public float getSogio() {
		return sogio;
	}
	public void setSogio(float sogio) {
		this.sogio = sogio;
	}
	public float getHesoluong() {
		return hesoluong;
	}
	public void setHesoluong(float hesoluong) {
		this.hesoluong = hesoluong;
	}
	public double getPhucap() {
		return phucap;
	}
	public void setPhucap(double phucap) {
		this.phucap = phucap;
	}
	public Nhanvien()
	{
		this.name="Nguyen Van A";
		this.manv="XYZ";
		this.ngaysinh="20 10 2018";
		this.sogio=1;
		this.hesoluong=10;
		this.phucap=1000000;
	}
	public Nhanvien(String name, String manv, String ngaysinh, float sogio, float hesoluong, double phucap)
	{
		this.name=name;
		this.manv=manv;
		this.ngaysinh=ngaysinh;
		this.sogio=sogio;
		this.hesoluong=hesoluong;
		this.phucap=phucap;
	}
	

}
