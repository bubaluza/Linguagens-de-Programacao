public interface ItemDeBiblioteca {


    void EmprestarItem() throws MinhaExcecao;
    void DevolverItem() throws MinhaExcecao;
    boolean VerificaEmprestado();

}