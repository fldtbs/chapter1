package Chapter_1_helloworld;

import java.util.*;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("����� �̸��� �Է��ϼ���: ");
		String name = scanner.next(); //���ڿ� �Է� �ޱ�
		System.out.println("�� �̸��� " + name + "�Դϴ�.");
		
		System.out.println("����� ������ �Է��ϼ���: ");
		String job = scanner.next(); //���ڿ� �Է� �ޱ�
		System.out.println("�� ������ " + job + "�Դϴ�.");
		
		System.out.println("����� ���̸� �Է��ϼ���: ");
		int age = scanner.nextInt();
		System.out.println("�� ���̴� " + age + "�Դϴ�.");
		
		System.out.println("����� ������ �Է��ϼ���: ");
		double height = scanner.nextDouble();
		System.out.println("�� ������ " + height + "�Դϴ�.");
		
		scanner.close();
		
	}

}
