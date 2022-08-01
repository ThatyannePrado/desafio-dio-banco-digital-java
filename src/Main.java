import com.dio.Cliente;
import com.dio.Conta;
import com.dio.ContaCorrente;
import com.dio.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente thaty = new Cliente();
        thaty.setNome("Thatyanne");

        Conta cc = new ContaCorrente(thaty);
        Conta poupanca = new ContaPoupanca(thaty);

        cc.depositar(100);
        cc.transferir(30,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
