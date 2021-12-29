import java.util.Scanner;
public class L2_3 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);	
	System.out.println("Введите ваше число: ");
	int number3 = in.nextInt();
	if (number3%4==0 && number3>10) {
		System.out.println("Данное число нам подходит");
	}
	else {
		System.out.println("Данное число нам не подходит");
	}
	}
}