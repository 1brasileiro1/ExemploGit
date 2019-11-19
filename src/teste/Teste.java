package teste;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner tecla = new Scanner(System.in);
        int A = tecla.nextInt();
        int B = tecla.nextInt();
        int C = tecla.nextInt();
        int D = tecla.nextInt();
        
        if(A != B && A != C && A == D){
            System.out.println("FALSA");
        }else{
            System.out.println("VERDADEIRA");
        }

	}

}
