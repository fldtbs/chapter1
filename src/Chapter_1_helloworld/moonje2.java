package Chapter_1_helloworld;

import java.util.*;

public class moonje2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2자리수 정수 입력(10~99)");
		int num = scanner.nextInt();
		
		if ((num > 10) && (num < 99)) {
			if ((num / 10) == (num % 10)) {
				System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
			}
			else {
				System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
			}
		}
		else {
			System.out.println("10~99사이의 수가 아닙니다.");
		}
		
		scanner.close();
	}

}
