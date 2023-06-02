package banco.domains;

/**
 *
 * @author lopes
 */
public abstract class ContaRegular extends Conta{
    
    public ContaRegular(String tipo, Cliente cliente, double saldo) {
        super(tipo, cliente, saldo);
    }
    
      public void depositar(double valor) {
        this.saldo += valor;
        balanco += valor;
    }
}
