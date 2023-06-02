package banco.domains;

/**
 *
 * @author lopes
 */
public class ContaSalario extends Conta {
    
    public ContaSalario(Cliente cliente, double saldo) {
        super("Conta Salario", cliente, saldo);
    }
    
    public void depositoEmpregador(double valor){
        this.saldo += valor;
        balanco += valor;
    }
}
