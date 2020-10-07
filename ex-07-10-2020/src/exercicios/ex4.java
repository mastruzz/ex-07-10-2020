package exercicios;
import java.util.*;
public class ex4 {
	public static void main(String args[]) {
		Scanner Sc = new Scanner (System.in);
		int numero;
		System.out.print("Digite um numero");
		numero = Sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.printf("O numero é par. A raiz quadrada é: "+ Math.sqrt(numero));
		}else {
			System.out.printf("O numero é impar. Elevado ao quadrado é: "+ (numero * numero));
		}
		
	}
}
