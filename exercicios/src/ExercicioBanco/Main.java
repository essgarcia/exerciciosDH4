package ExercicioBanco;

import ExercicioBanco.Model.Basico;
import ExercicioBanco.Model.Cobrador;
import ExercicioBanco.Model.Executivo;

public class Main {
    public static void main(String[] args) {

        Basico basico = new Basico();
        Cobrador cobrador = new Cobrador();
        Executivo executivo = new Executivo();

        System.out.println("******** Conta Basica **********");
        basico.consultarSaldo();
        basico.transacaoOk("consultar saldo");
        basico.depositar(1000);
        basico.transacaoOk("deposito");
        basico.sacar(300);
        basico.transacaoOk("saque");
        basico.transferir(500);
        basico.transacaoNaoRealizada("tranferir");

        System.out.println("\n******** Conta Cobrador **********");
        cobrador.consultarSaldo();
        cobrador.transacaoOk("consultar saldo");
        cobrador.pagarServico("compras de materiais");
        cobrador.transacaoOk("pagamento de servico");
        cobrador.transferir(2000);
        cobrador.transacaoOk("transferencia");
        cobrador.sacar(3000);
        cobrador.transacaoNaoRealizada("sacar");

        System.out.println("\n******** Conta Executiva **********");
        executivo.consultarSaldo();
        executivo.depositar(30000);
        executivo.transacaoOk("deposito");
        executivo.transferir(2000);
        executivo.transacaoOk("transferencia");
        executivo.sacar(4000);
        executivo.transacaoOk("saque");
        executivo.pagarServico("compra Chanel");
        executivo.transacaoNaoRealizada("pagamento de Chanel");
    }
}
