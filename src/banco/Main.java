package banco;

import banco.controllers.ClienteBean;

public class Main {

    public static void main(String[] args) {
        ClienteBean clienteBean = new ClienteBean();

        clienteBean.iniciar();

        // Connection conexao = DBConnection.getConnection();
        /*Cliente cl = new Cliente("Débora Fernandes", 'F');
        ContaPoupanca cp = new ContaPoupanca( cl, 1000.0);
        cp.rendimento(10.0);
        cp.rendimento(10.0);
        cp.sacar(410.0);
        System.out.println(cp.toString());

        Cliente c2 = new Cliente("Isis Suarez", 'F');
        ContaPoupanca cs = new ContaPoupanca(c2, 1000.0);
        cs.sacar(500.0);
        System.out.println(cs.toString());
        System.out.println("Quantidade de contas abertas: " + Conta.quantidadeContas);
        System.out.println("Balanço geral: R$ " + Conta.balanco);
        System.out.println("------------------------------------------------------\n");
    }

    
        List<Conta> contas = new ArrayList();
        Cliente cl;
        ContaCorrente cc;
        ContaPoupanca cp;

        cl = new Cliente("Amanda Lopes", 'F');
        cp = new ContaPoupanca(5600.00, cl, 0.10);
        contas.add(cp);

        cl = new Cliente("Amanda Lopes", 'F');
        cc = new ContaCorrente(3600.00, cl);
        contas.add(cc);
        
        for(Conta conta: contas){
            System.out.println(conta.informacoes());
        }

         System.out.println("Saldo inicial: " + contaPoupanca.getSaldo());

        contaPoupanca.calcularJurosDiarios(60);
        System.out.println("Saldo após 60 dias de juros: " + contaPoupanca.getSaldo());
         

  System.out.println(contaCorrente.getSaldo());
        contaCorrente.depositar(2000.00);
        System.out.println(contaCorrente.getSaldo());
        contaCorrente.sacar(10000.00);
        System.out.println(contaCorrente.verificarSaldo()); */
    }
}
