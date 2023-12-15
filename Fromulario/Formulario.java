package Formulario;

import java.util.ArrayList;
import java.util.List;

public class Formulario {
    private String titulo;
    private List<ItemFormulario> itemFormulario;

    public Formulario(){
        this("");
    }

    public Formulario(String titulo){
        this.titulo = titulo;
        this.itemFormulario = new ArrayList<>();
    }
    public void addItemFormulario(ItemFormulario itemFormulario) throws Exception{
        // Verifica se um campo com o mesmo id já existe
        for (ItemFormulario existingCampo : this.itemFormulario) {
            if (existingCampo.getId().equalsIgnoreCase(itemFormulario.getId())) {
                throw new Exception("O 'nome' já existe");
            }
        }
        this.itemFormulario.add(itemFormulario);

    }
    public ItemFormulario getItemFormulario(String id){
        for (ItemFormulario itemFormulario1: this.itemFormulario){
            if (itemFormulario1.getId().equalsIgnoreCase(id)) return itemFormulario1;
        }
        return null;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<ItemFormulario> getItemFormulario() {
        return itemFormulario;
    }
    public Resultado validar(){
        Resultado resultado = new Resultado();
        for (ItemFormulario item: this.itemFormulario){
            if (item.isObrigatorio() && !item.isPreenchido()){
                resultado.setErro(true);
                resultado.addMensagem("O campo é obrigatório e não foi preenchido");
            }
        }
        resultado.isErro();
        return resultado;
    }
}
