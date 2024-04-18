import java.util.Scanner;

public class Contador {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int opcion =0;
		System.out.println("Que numero quiere elegir");
		opcion= scan.nextInt();

		for (int i = 0;i<1001;i++) {

			System.out.println("Hola estoy contando hasta 1000 desde: " + i);
		}
		
		
	}
}
