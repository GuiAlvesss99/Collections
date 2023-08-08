package Collections;

import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;
import java.util.HashSet;
public class Lista02ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> numero = new HashSet<>();
		Scanner leia= new Scanner(System.in);
		                                                                                                                                                        
		 for (int i=0; i<10; i++) {                    
			 System.out.println("Digite os números informados na tabela");
			                                                                
			 int num=leia.nextInt();
			 numero.add(num);
			 
		 }
		 System.out.println(numero);
		 System.out.println("\nListar dados do set:");
		 
		 for (Integer num:numero) {
			 System.out.println(num);
		 }
		 Iterator<Integer> meuset= numero.iterator();
		 while(meuset.hasNext()) {
			 System.out.println(meuset.next());
		 }
			 
		 
	}

}
