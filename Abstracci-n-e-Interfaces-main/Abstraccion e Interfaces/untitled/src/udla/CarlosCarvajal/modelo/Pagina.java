package udla.CarlosCarvajal.modelo;

public class Pagina extends Hoja {// implements Imprimible


    // Consructor
    public Pagina(String contenido){
        super(contenido);
    }

    // Metodo Abstracto
    @Override
    public String imprimir() {
        return this.contenido;
    }
}
