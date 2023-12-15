package Formulario;

public class Campo implements ItemFormulario{
    private ValidadorCampo validadorCampo;
    private String id;
    private String nome;
    private boolean obrigatorio;
    private String valor;

    public Campo(String id){
        this.id = id;
        this.nome = "";
    }
    public Campo(ValidadorCampo validadorCampo, boolean obrigatorio){
        this.validadorCampo = validadorCampo;
        this.obrigatorio = obrigatorio;
    }
    public Campo(String id, String nome){
        this.id = id;
        this.nome = nome;
    }
    public Campo(String id,boolean obrigatorio){
        this.id = id;
        this.obrigatorio = obrigatorio;
    }
    public Campo(String id,boolean obrigatorio, String nome){
        this.id = id;
        this.obrigatorio = obrigatorio;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    @Override
    public String getLabel() {
        return nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    public boolean isPreenchido(){
        if (valor!=null) return true;
        return false;
    }
    public boolean isObrigatorio(){
        return this.obrigatorio;
    }

    public void setObrigatorio(boolean obrigatorio) {
        this.obrigatorio = obrigatorio;
    }
    public Resultado validar() {
        Resultado resultado = new Resultado();
        if (obrigatorio && (valor == null || valor.isEmpty())) {
            resultado.setErro(true);
            resultado.addMensagem("campo é obrigatório e não foi preenchido");
        }
        resultado.isErro();
        return resultado;
    }

    public void setValidador(ValidadorCampo validadorCampo) {
        this.validadorCampo = validadorCampo;
    }
}
