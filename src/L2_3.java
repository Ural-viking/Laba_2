import java.util.Scanner;
public class L2_3 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);	
	System.out.println("������� ���� �����: ");
	int number3 = in.nextInt();
	if (number3%4==0 && number3>10) {
		System.out.println("������ ����� ��� ��������");
	}
	else {
		System.out.println("������ ����� ��� �� ��������");
	}
	}
}