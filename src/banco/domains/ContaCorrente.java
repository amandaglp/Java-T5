package banco.domains;

/**
 *
 * @author lopes
 */
public class ContaCorrente extends ContaRegular {

     public ContaCorrente(Cliente cliente, double saldo) {
        super("Corrente", cliente, saldo);
    }

    public boolean transferencia(double quantia, ContaRegular destino) {
        if (saldo < quantia) {
            return false;
        }
        this.saldo -= quantia;
        destino.depositar(quantia);
        return true;
    }

}