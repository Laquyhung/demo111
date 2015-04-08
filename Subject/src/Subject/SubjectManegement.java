package Subject;

import java.io.IOException;
import java.util.Scanner;

public class SubjectManegement {
	private static Scanner nhap;

	public static void main(String[] agrs) {
		nhap = new Scanner(System.in);
		System.out.print("Nhap ma mon: ");
		String ID = nhap.nextLine();
		System.out.print("Nhap ten mon: ");
		String tenMon = nhap.nextLine();
		System.out.print("Nhap so luong sv max: ");
		int svMax = nhap.nextInt();
		System.out.print("Nhap so sv hien tai: ");
		int svHT = nhap.nextInt();
		Subject mon = new Subject(ID, tenMon, svMax, svHT);

		String chon;
		do {
			mon.dangKy();
			System.out.print("Ban co muon dang ky them ko: (Y/N)");
			try {
				System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
			chon = nhap.nextLine();
		} while (chon != "Y");
		mon.hienThi();
	}
}
