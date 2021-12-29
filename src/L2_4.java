import java.util.Scanner;
public class L2_4 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Ââåäèòå âàøå ÷èñëî: ");
	int number4 = in.nextInt();
	if (number4>5 && number4<10) {
		System.out.println("×èñëî âõîäèò â íóæíûé äèàïàçîí ");
	}
	else {
		System.out.println("×èñëî íå âõîäèò â íóæíûé äèàïàçîí ");
	}
	}
}