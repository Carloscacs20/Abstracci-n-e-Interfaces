package udla.CarlosCarvajal.modelo;

abstract public class Hoja { // se puede poner abstract antes o depues del public
    protected  String contenido; // proctected es la manera de acecceder a los atributos sin los metodos getter y setter

    public Hoja(String contenido) {
        this.contenido = contenido;
    }


    abstract public String imprimir(); // un metodo abstracto aplica el principio de polimorfismo de sobrecarga


    //un clase abstracta puede tener metodos abtractos o no, pero no puede tener una clase No abstracta con metos abstractos
    // clase abstracta y una iterface la clase puede tener clase y metodos abstractos en cambio en la interface no pude tener clase abtracta pero si metodos abstractos
    // las interfaces no tienen herencia pero si se puede hederar herdan los metodos abstractos
    // caracteristica de un metodo abstracto que no es implementado en la clase abstracta sino en las clase que utilizan las clases abstractas y cada implementacion es distinta ahi si es polimorfismo y hay sobrecarga
    // no se pueden instanciar las clases abstractas se acceden a ellas por medio de los metodos

}
