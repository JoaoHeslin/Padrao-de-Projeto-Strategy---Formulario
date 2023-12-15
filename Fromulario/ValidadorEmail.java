package Formulario;

public class ValidadorEmail implements ValidadorCampo{
    private Resultado resultado;
    public ValidadorEmail(){
        this.resultado = new Resultado();
    }

    @Override
    public Resultado validarCampo(String valor) {
        String sequenciaDCX = "@dcx.ufpb.br";
        String invalido = "Invalido";
        if (!valor.contains(sequenciaDCX)) resultado.addMensagem("email inválido.");
        resultado.isErro();
        return resultado;
    }
}
