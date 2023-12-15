package Formulario;

public class ValidadorInteiro implements ValidadorCampo{
    private int valorMinimo, valorMaximo;
    private Resultado resultado;

    public ValidadorInteiro(){
        this.resultado = new Resultado();
    }

    public ValidadorInteiro(int valorMinimo, int valorMaximo) {
        this.valorMinimo = valorMinimo;
        this.valorMaximo = valorMaximo;
        this.resultado = new Resultado();

    }

    public int getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(int valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public int getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(int valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    @Override
    public Resultado validarCampo(String valor) {
        Integer numero = Integer.valueOf(valor);
        if (numero<10||numero>1000) resultado.addMensagem("valor maior que 1000:1001");

        if (!valor.matches("//d+")) resultado.addMensagem("valor não é um inteiro:'asdfas'");
        resultado.isErro();
        return resultado;
    }
}
