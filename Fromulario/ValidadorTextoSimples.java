package Formulario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorTextoSimples implements ValidadorCampo{
    private int min;
    private int max;
    Resultado resultado = new Resultado();

    public ValidadorTextoSimples(){
        this(3,10);
    }
    public ValidadorTextoSimples(int min, int max){
        if (min<=0|| max<=0) throw new IllegalArgumentException("Tamanho invalido, digite tamanhos maiores que 0");
        this.max = max;
        this.min = min;

    }

    public Resultado validarCampo(String valor){

        if (valor == null) resultado.addMensagem("O valor não pode ser nnulo.");

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(valor);
        if (matcher.find()) {
            resultado.addMensagem("Não pode conter números.");
        }

        if (valor.length() < min || valor.length() > max) {
            resultado.addMensagem("Tamanho de entrada inválido");
        }
        resultado.isErro();
        return  resultado;
    }
}
