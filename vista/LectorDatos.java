package vista;
import java.util.Scanner;

public class LectorDatos{
	Scanner sc = new Scanner(System.in);
	
	public LectorDatos(){}

	public String leerString(){
		String temp = sc.nextLine();
		return temp;
	}
	public int leerInt(){
		int temp = sc.nextInt();
		return temp;
	}
}
