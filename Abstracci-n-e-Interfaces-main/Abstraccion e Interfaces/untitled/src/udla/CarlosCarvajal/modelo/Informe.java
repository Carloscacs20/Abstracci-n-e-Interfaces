package udla.CarlosCarvajal.modelo;

public class Informe extends Hoja{ // cuando se hereda de una clase abstracta se mecesita usar los metodos de la clase padre de acuerdo a la necesidad de uso

    private String autor;
    private String revisor;


    public Informe(String autor, String revisor, String contenido) { // esta tomando los atributos de la super clase y de la sub clase
        super(contenido); // heredando de una clase abstracta el contenido de los atributos de la clase padre o superclase
        this.autor = autor;
        this.revisor = revisor;

    }

    @Override
    public String imprimir() { // implementa los metodos
        return "Informe escrito por: " + this.autor +
                " Revisado por: " + this.revisor +
                "\n" + this.contenido;  // se pudo acceder a contenido porque es protected
    }


// cuando hay final no se puede sobreescrbir ose el final es cuando no utilizas getter y setter
}
