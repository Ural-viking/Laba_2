import java.util.Scanner;
public class L2_5 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("������� ���� �����: ");
	int number5 = in.nextInt();
	int result = number5/1000;
	System.out.printf("� ����� %d  ���������� %d ����� \n", number5, result);
	}
}