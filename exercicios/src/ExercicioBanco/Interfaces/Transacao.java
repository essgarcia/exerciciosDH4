package ExercicioBanco.Interfaces;

public interface Transacao {

    public void transacaoOk(String tipoTransacao);
    public void transacaoNaoRealizada(String tipoTransacao);

}
