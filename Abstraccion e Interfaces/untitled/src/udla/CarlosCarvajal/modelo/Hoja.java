package udla.CarlosCarvajal.modelo;

abstract public class Hoja { // se puede poner abstract antes o depues del public
    protected  String contenido; // proctected es la manera de acecceder a los atributos sin los metodos getter y setter

    public Hoja(String contenido) {
        this.contenido = contenido;
    }


    abstract public String imprimir(); // un metodo abstracto aplica el principio de polimorfismo de sobrecarga


 //un clase abstracta puede tener metodos abtractos o no, pero no puede tener una clase No abstracta con metos abstractos
}
