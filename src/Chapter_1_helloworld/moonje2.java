package Chapter_1_helloworld;

import java.util.*;

public class moonje2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2�ڸ��� ���� �Է�(10~99)");
		int num = scanner.nextInt();
		
		if ((num > 10) && (num < 99)) {
			if ((num / 10) == (num % 10)) {
				System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
			}
			else {
				System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
			}
		}
		else {
			System.out.println("10~99������ ���� �ƴմϴ�.");
		}
		
		scanner.close();
	}

}
