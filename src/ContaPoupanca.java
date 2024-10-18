public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimeExtrato(){
    System.out.println("=== IMPRIMINDO EXTRATO CONTA POUPANÇA ===");
    System.out.println(String.format("Titular: %s", this.cliente.getNome()));
    System.out.println(String.format("Agência: %d", this.getAgencia()));
    System.out.println(String.format("Conta: %d", this.getConta()));
    System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
}

}
