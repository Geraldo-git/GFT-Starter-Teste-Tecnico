package exercicio03;

public class Main {

    public static void main(String[] args) {

        ContaPoupanca cp = new ContaPoupanca(2001,"Maria José", 3500.00);
        ContaCorrente cc = new ContaCorrente(1001,"José Maria",4000);

        System.out.println(cp);
        System.out.println(cc);
    }
}
