package Collections;

import java.util.ArrayList;
import java.util.Scanner;
public class Lista01ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		
		ArrayList<Integer> numero = new ArrayList();
		Scanner leia= new Scanner(System.in);
		
		numero.add(2);
		numero.add(5);
		numero.add(1);
		numero.add(3);
		numero.add(4);
		numero.add(9);
		numero.add(7);
		numero.add(8);
		numero.add(10);
		numero.add(6);
		
		System.out.println("Digite um número:");
		num1= leia.nextInt();
		
		for(int i=0; i < numero.size();i++){
		if (num1 ==numero.get(i)) {
			System.out.println("O numero "+num1+"esta no posição "+i);
			break;
		   	
			
		} else {
			System.out.println("Não encontrado");
			break;
			
}
}
	}	
}
