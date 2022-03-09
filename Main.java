package dio.desafio;

public class Main {

    public static void main(String[] args) {
        Cliente vinicius = new Cliente();
        vinicius.setNome("Vinicius");

        Conta cc = new ContaCorrente(vinicius);
        Conta poupanca = new ContaPoupanca(vinicius);

        cc.depositar(8888000);
        cc.transferir(3900, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }


}
