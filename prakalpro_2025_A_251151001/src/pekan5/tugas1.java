package pekan5;

public class tugas1 {

		public static void main(String[] args) {
		for (int line = 1; line <= 5; line++) {
			for (int i = 1; i<=(-1*line +5); i++) {
				System.out.print(".");
			}
			System.out.print(line);
			
		for (int j = 1; j <= (line-1); j++) {
			System.out.print(".");
		}
		System.out.println();
		}

	}
}
