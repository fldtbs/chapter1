package Chapter_1_helloworld;

import java.util.*;

public class moonje6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1~99 ������ ������ �Է��Ͻÿ�>>");
		int num = scanner.nextInt();
		
		if ((num > 1) && (num < 99)) {
			if (((num / 10) == 3) || ((num / 10) == 6) || ((num / 10) == 9)) {
				
				System.out.print("�ڼ�¦");

				if (((num % 10) == 3) || ((num % 10) == 6) || ((num % 10) == 9)) {
					System.out.println("¦");
				}
			}
			else if (((num % 10) == 3) || ((num % 10) == 6) || ((num % 10) == 9)) {
				System.out.println("�ڼ�¦");
			} else {
				System.out.println("�ڼ�����");
			}
		} else {
			System.out.println("1~99 ������ ������ �ƴմϴ�.");
		}
		
		scanner.close();
	}

}
