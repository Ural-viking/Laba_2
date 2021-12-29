import java.util.Scanner;
public class L2_6 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Введите ваше число: ");
	int number6 = in.nextInt();
	String convert = Integer.toOctalString(number6);
	int number7 = (number6/8)%8;
	System.out.printf("Дано число %d , в восьмеричной форме оно %s , вторая цифра справа %d \n",number6, convert, number7);
		}
}