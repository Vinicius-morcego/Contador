public class ParametrosInvalidosException extends Exception{
    private String mensagem;
    public ParametrosInvalidosException(String mensagem){
        this.mensagem = mensagem;
        System.err.println(this.mensagem);
    }
}
