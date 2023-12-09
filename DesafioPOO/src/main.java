public class main {
    public static void main(String[] args) {
        Cliente rafael  =new Cliente();
        rafael.setNome("Rafael");



        Conta cc = new ContaCorrente(rafael);
        Conta cp = new ContaPoupanca(rafael);
        
        cc.depositar(300);
        cc.transferir(250, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();



    }
    
}
