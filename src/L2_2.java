import java.util.Scanner;
public class L2_2 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
System.out.println("������� �����: ");
int number2 = in.nextInt();
if (number2%5==2 && number2%7==1) {
	System.out.println("������ ����� ��� ��������");
}
else {
	System.out.println("������ ����� ��� �� ��������");
}
	}
}