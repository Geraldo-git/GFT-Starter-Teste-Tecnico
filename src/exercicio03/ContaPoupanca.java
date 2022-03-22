package exercicio03;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, String nome, double saldo) {
        super(numero, nome, saldo);
    }


    @Override
    public double rendimento() {
        return super.rendimento() * 0.05;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo: Poupança" +
                "\nRendimento previsto: R$" + String.format("%.2f", rendimento()) +
                "\nSaldo com rendimentos: R$" + String.format("%.2f", getSaldo() + rendimento()) +
                "\n========================================================================";

    }
}
