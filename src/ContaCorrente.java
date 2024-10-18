public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimeExtrato(){
        System.out.println("=== IMPRIMINDO EXTRATO CONTA CORRENTE ===");
        System.out.println(String.format("Titular: %s",this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.getAgencia()));
        System.out.println(String.format("Conta: %d", this.getConta()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
    }

}
