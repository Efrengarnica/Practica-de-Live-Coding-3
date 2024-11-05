import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el número de naranjas");
		int naranjas = scanner.nextInt();
		System.out.println("Ingresa el número de mangos");
		int mangos = scanner.nextInt();

		MangosNaranjas prueba = new MangosNaranjas(mangos ,naranjas);
		prueba.cantidadCajas();
		scanner.close();
	}//main
}//class Main
