package banco.domains;

/**
 *
 * @author lopes
 */
public class ContaPoupanca extends ContaRegular {

    private double taxa;

    public ContaPoupanca(Cliente cliente, double saldo) {
        super("Poupança", cliente, saldo);
    }

    public void rendimento(double taxa) {
        double rendimento = (this.saldo * taxa / 100);
        this.saldo += rendimento;
        balanco += rendimento;
    }
}
/* public void calcularJurosDiarios(int dias) {
        double jurosDiarios = taxaDeJuros / 365;
        double jurosAcumulados = getSaldo() * jurosDiarios * dias;
        depositar(jurosAcumulados);
    }*/
