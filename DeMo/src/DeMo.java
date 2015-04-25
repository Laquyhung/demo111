import java.util.InputMismatchException;
import java.util.Scanner;

public class DeMo {

	private static Scanner iD;

	public static void main(String[] args) {
		int x;
		int fx;
		do {
			iD = new Scanner(System.in);
			System.out.print("An so: ");
			try {
				x = iD.nextInt();
				fx = 1/x;
				System.out.format("Fx= %d\n" , fx);
				break;
			} catch (InputMismatchException | ArithmeticException a) {
				System.out.println("Ban nhap vao khong phai la kieu so");
//			} catch (ArithmeticException b) {
//				System.out.println("Loi vi ban nhap vao so 0" );
			}
			finally {
				System.out.println("OK");
			}
		} while (true);

	}

}
