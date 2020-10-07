package exercicios;
import java.util.*;
public class ex1 {
	public static void main(String arg[]) {
		Scanner Sc = new Scanner(System.in);
		double num1,num2,num3, maior=0;
		
		System.out.println("Digite o primeiro numero");
		num1 = Sc.nextDouble();
		System.out.println("Digite o segundo numero");
		num2 = Sc.nextDouble();
		System.out.println("Digite o terceiro numero");
		num3 = Sc.nextDouble();
		
		if (maior < num1) {
			maior = num1;
			if(maior < num2){
				maior = num2;
			}
					if (maior < num3) {
						maior = num3;
						}
			}
			System.out.println("o maior número é "+ maior);
		}
		
		
		
		
	}

