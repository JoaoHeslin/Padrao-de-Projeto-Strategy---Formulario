package Formulario;

import java.time.LocalDate;

public class ValidadorData implements ValidadorCampo{
    private LocalDate dataMinima, dataMaxima;
    private Resultado resultado;
    public ValidadorData(LocalDate dataMinima, LocalDate dataMaxima){
        this.dataMinima = dataMinima;
        this. dataMaxima = dataMaxima;
        this.resultado = new Resultado();
    }

    @Override
    public Resultado validarCampo(String valor) {
        LocalDate data = LocalDate.parse(valor);
        if (data.isBefore(dataMinima) || data.isAfter(dataMaxima)) resultado.addMensagem("Data fora dos limites.");
        resultado.isErro();
        return resultado;
    }
}
