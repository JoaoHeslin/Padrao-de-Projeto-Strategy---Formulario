package Formulario;

public interface ItemFormulario {
    String getId();
    String getLabel();
    void setValor(String valor);
    Resultado validar();
    void setObrigatorio(boolean obrigatorio);
    boolean isObrigatorio();
    boolean isPreenchido();

    String getNome();
}
