package Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Lista01ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		ArrayList<String> cores = new ArrayList();
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digite 5 cores:"); // irá ler as 5 cores 
		
		for(int i=0;i<5;i++) {
			String cor = leia.nextLine();
			cores.add(cor);
		}
		
		System.out.println("\nListar todas as cores:"); //listar todas as cores que escrevi 
		for (String cor:cores) {
			System.out.println(cor);
			
		}
		Collections.sort(cores);
		System.out.println("\nTodas as cores de ordem crescente:"); // 
		for (String cor:cores) {
			System.out.println(cor);
		}
	}

}
