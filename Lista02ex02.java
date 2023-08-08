package Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Lista02ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		
		Scanner leia=new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<>();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Digite o numero desejado");
		num1=leia.nextInt();
		
		for(Integer lista:numeros) {
			if(numeros.contains(num1)) {
				System.out.println("O numero " +num1+ "foi encontrado");
				break;
			}else{
				System.out.println("O numero"+num1+"não foi encontrado");
			}
		}
		
		
	}

}
