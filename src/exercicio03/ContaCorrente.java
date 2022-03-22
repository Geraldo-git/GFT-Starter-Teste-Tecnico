package exercicio03;

import exercicio04.CalculaImposto;

public class ContaCorrente extends Conta implements CalculaImposto {

    public ContaCorrente(int numero, String nome, double saldo) {
        super(numero, nome, saldo);
    }

    @Override
    public double rendimento() {
        return super.rendimento() * 0.03;
    }
    @Override
    public double calcularImposto() {
        return rendimento() * 0.25;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo: Corrente" +
                "\nRendimento previsto: R$" + String.format("%.2f", rendimento()) +
                "\nSaldo previsto com rendimentos: R$" + String.format("%.2f", getSaldo() + rendimento()) +
                "\n**Imposto devido sobre rendimentos**: R$" + String.format("%.2f",calcularImposto())+
                "\n========================================================================";

    }


}
