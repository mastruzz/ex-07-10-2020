package exercicios;
import java.util.*;
public class ex2 {
	
	public static void main(String args[]) {	
	Scanner Sc = new Scanner(System.in);
	double numero1,numero2,numero3;
	
	System.out.println("Digite o primeiro numero");
	numero1 = Sc.nextDouble();
	System.out.println("Digite o segundo numero");
	numero2 = Sc.nextDouble();
	System.out.println("Digite o terceiro numero");
	numero3 = Sc.nextDouble();
		
	if (numero1 > numero2 && numero2 > numero3) {
		System.out.printf("A ordem dos numero e: "+numero3+" -> " +numero2+" -> " +numero1);}
	if (numero1 > numero3 && numero3 > numero2) {
		System.out.printf("A ordem dos numero e: "+numero3+" -> " +numero1+" -> " +numero2);}
	if (numero2 > numero1 && numero1 > numero3) {
		System.out.printf("A ordem dos numeros é: "+ numero3+" -> " +numero2+" -> " +numero1);}
	if (numero2 > numero3 && numero3 > numero1) {
		System.out.printf("A ordem dos numero e: "+ numero1+" -> " +numero3+" -> " +numero2);}
	if (numero3 > numero1 && numero1 > numero2) {
		System.out.printf("A ordem dos numeros e: "+numero2+" -> " +numero1+" -> " +numero3);}
	if (numero3 > numero2 && numero2 > numero1) {
		System.out.println("A lista de numeros crescente é: "+numero1+" -> " +numero2+" -> " +numero3);}
	if(numero1==numero2 || numero1==numero3 ||numero2 ==numero3) {
		System.out.print("Não digite números iguais!");
	}
		
	}		
	
}
