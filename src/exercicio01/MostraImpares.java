package exercicio01;

import java.util.Scanner;

public class MostraImpares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor inicial: ");
        int valorInicial = sc.nextInt();
        System.out.println(("Digite o valor final: "));
        int valorFinal= sc.nextInt();

        if ( valorInicial < valorFinal){
            for (int i = valorInicial; i <= valorFinal; i++){
               if( i%2 !=0){
                   System.out.print(" " + i);
               }
            }
        }



    }
}
