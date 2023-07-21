package mergulhandoJava.banco;

public class Principal {
    public static void main(String[] args) {
//        Istancia

        Conta minhaConta = new Conta();
        Titular titular = new Titular();

        minhaConta.agencia = 100;
        minhaConta.saldo = 1000.00;
        titular.nome = "Hidelgio";
        minhaConta.titular = titular;

        System.out.println(minhaConta.titular.nome);
    }
}
