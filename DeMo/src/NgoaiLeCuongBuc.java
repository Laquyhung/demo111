
import java.util.Scanner;

public class NgoaiLeCuongBuc {
	private static Scanner iD;

	public static void hung() throws  TuDinhNghia {
		int age;
		System.out.println("This page contains 18+ contents.How old are you?");
		iD = new Scanner(System.in);
		age = iD.nextInt();
		if (age < 0)
			throw new TuDinhNghia("Ban nhap sai");
		else if (age < 18)
			throw new TuDinhNghia("Ban chua du tuoi");
		throw new TuDinhNghia("Ban da du tuoi");
	}

	public static void main(String[] agrs) {
		try {
			hung();
		} catch (TuDinhNghia e) {
			System.out.print(e.getMessage());
		}
	}
}
