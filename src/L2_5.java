import java.util.Scanner;
public class L2_5 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("¬ведите ваше число: ");
	int number5 = in.nextInt();
	int result = number5/1000;
	System.out.printf("¬ числе %d  содержитс€ %d тыс€ч \n", number5, result);
	}
}