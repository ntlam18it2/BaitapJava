//Nguyễn Thành Lâm 18IT2

package Quanlinhanvien;

import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class NhanvienManagement {
	Vector list = new Vector();
	public NhanvienManagement()
	{
		while (true)
		{
			System.out.println("QUAN LI NHAN VIEN");
			System.out.println("1. Nhap thong tin nhan vien");
			System.out.println("2. Xem thong tin nhan vien");
			System.out.println("3. Tim kiem nhan vien");
			int num;
			Scanner key=new Scanner(System.in);
			System.out.println("Nhap chuc nang");
			num=key.nextInt();
			switch (num)
			{
				case 1: Nhapthongtinnv();
				break;
				case 2: Xemthongtinnv();
				break;
				case 3: Timkiem();
				break;
			}
		}	
	}
	public void Nhapthongtinnv()
	{
		Scanner key=new Scanner(System.in);
		int sl;
		System.out.println("Nhap so luong nhan vien");
		sl=Integer.parseInt(key.nextLine());
		for (int i=1;i<=sl;i++)
		{
			System.out.println("Nhap thong tin nhan vien thu "+i);
			System.out.println("Nhap ten nhan vien");
			String name = key.nextLine();
			System.out.println("Nhap ma nhan vien");
			String manv = key.nextLine();
			System.out.println("Nhap ngay sinh");
			SimpleDateFormat ft= new SimpleDateFormat("dd-MM-yyyy");
			String ngaysinh=key.nextLine();
			System.out.println("Nhap so gio lam viec");
			float sogio = Float.parseFloat(key.nextLine());
			System.out.println("Nhap he so luong");
			float hesoluong=Float.parseFloat(key.nextLine());
			System.out.println("Nhap phu cap");
			double phucap=Double.parseDouble(key.nextLine());
			Nhanvien nv = new Nhanvien(name, manv, ngaysinh, sogio, hesoluong, phucap);
			list.add(nv);
		}
	}
	public void Xemthongtinnv()
	{
		System.out.println("Danh sach nhan vien");
		Enumeration Nhanvien1 = list.elements();
		int i=1;
		while (Nhanvien1.hasMoreElements())
		{
			Nhanvien nvs = (Nhanvien)Nhanvien1.nextElement();
			System.out.println(" "+ i++ +". "+nvs.getName()+ " co ma nhan vien la "+nvs.getManv()+" co ngay sinh "+nvs.getNgaysinh());
			System.out.println("So gio lam viec: "+nvs.getSogio());
			System.out.println("He so luong: "+nvs.getHesoluong());
			System.out.println("Phu cap: "+nvs.getPhucap());
		}
	}
	public void Timkiem()
	{
		Scanner key= new Scanner(System.in);
		System.out.println("Nhap ten nhan vien can tim kiem");
		String name = key.nextLine();
		Enumeration Nhanvien1= list.elements();
		System.out.println("Thong tin nhan vien can tim: ");
		while(Nhanvien1.hasMoreElements())
		{
			Nhanvien nvs = (Nhanvien)Nhanvien1.nextElement();
			if(nvs.getName().indexOf(name)!=-1)
			{
				System.out.println("Ma nhan vien: "+nvs.getManv()+", Ten: "+nvs.getName()+", Ngay sinh: "+nvs.getNgaysinh());
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NhanvienManagement();
	}

}
