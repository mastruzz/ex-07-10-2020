package exercicios;
import java.util.*;

public class ex3 {
	public static void main(String args[]) {
		int idade;
		Scanner Sc = new Scanner(System.in);
		System.out.printf("Digite sua idade");
		idade = Sc.nextInt();
		
		if(idade >= 10 && idade <= 14){
			System.out.printf(idade + " Infantil");
		}
		if(idade > 14 && idade <= 17) {
			System.out.printf(idade +" Juvenil");			
		}
		if(idade > 17 && idade <= 25) {
			System.out.printf(idade+ " adulto");
		}
		if(idade > 25) {
			System.out.printf("Sem categoria definida");
		}
		
	}

}
