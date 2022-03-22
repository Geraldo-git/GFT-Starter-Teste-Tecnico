package exercicio03;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, String nome, double saldo) {
        super(numero, nome, saldo);
    }

    @Override
    public double rendimento() {
        return super.rendimento() * 0.03;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo: Corrente" +
                "\nRendimento previsto: R$" + String.format("%.2f", rendimento()) +
                "\nSaldo com rendimentos: R$" + String.format("%.2f", getSaldo() + rendimento())+
                "\n========================================================================";

    }
}
