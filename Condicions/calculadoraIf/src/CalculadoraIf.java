import java.util.Scanner;


public class CalculadoraIf {


	public static void main(String[] args) {
		//1.Preguntem els dos nombres.
		Scanner lector = new Scanner(System.in);
		System.out.println("Introdueix el primer nombre:");
		int primerNombre = lector.nextInt();
		int resultat = 345;
		System.out.println("Introdueix el segon nombre:");
		int segonNombre = lector.nextInt();
		
		
		//2.Mostrar les operacions.
		System.out.println("La suma es l'operació : 1");
		System.out.println("La resta es l'operació : 2");
		System.out.println("La multiplicació es l'operació : 3");
		System.out.println("La divisió l'operació : 4");
		System.out.println("Introdueix l'operació");
		//3.Preguntar l'operació.
		int operacioFinal= lector.nextInt();
		
		//4.fer el càlcul.
		if(operacioFinal==1){
			resultat = primerNombre + segonNombre;
		}else if(operacioFinal==2){
			resultat = primerNombre - segonNombre;
		}else if(operacioFinal==3){
			resultat = primerNombre * segonNombre;
		}else if(operacioFinal==4){
			resultat = primerNombre / segonNombre;
		}
		
		//5.Mostrar el resultat.
		System.out.println("El resultat és:"+ resultat);
		
		//6.Final
		lector.close();

	}

}
