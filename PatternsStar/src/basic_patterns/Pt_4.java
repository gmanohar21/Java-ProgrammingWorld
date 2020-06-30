package basic_patterns;

public class Pt_4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j2 = 1; j2 <= i; j2++) {
				System.out.print("*");
			}
			for (int j3 = 2; j3 <= i; j3++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
