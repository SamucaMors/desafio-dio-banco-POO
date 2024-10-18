public class Main {
    public static void main(String[] args) {

        Cliente samuel = new Cliente();
        samuel.setNome("Samuel");
        Conta cc = new ContaCorrente(samuel);
        cc.depositar(100);
        cc.sacar(50);
        Conta cp = new ContaPoupanca(samuel);
        cc.transferir(50,cp);
        cc.imprimeExtrato();
        cp.depositar(200);
        cp.sacar(50);
        cp.imprimeExtrato();

    }
}