
import java.util.Scanner;

//main class
public class J {
	// main method
	public static void main(String[] args) {
		// input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a main string");
		String parent = scanner.nextLine();
		System.out.println("Please enter a sub string");
		String sub = scanner.nextLine();
		int sub_length = sub.length();
		int count = 0;
		// loop
		for (int i = 0; i < parent.length(); i++) {
			if (sub.charAt(0) == parent.charAt(i)) {
				for (int j = 1; j < sub.length(); j++) {
					if (sub.charAt(j) == parent.charAt(i + 1)) {
						i++;
						count++;
					}
				}
			}

		} // if conditon

		if (count == sub_length - 1) {
			System.out.println("Substring is found ");
		} else {
			System.out.println("Substring not found");
		}

	}

}
