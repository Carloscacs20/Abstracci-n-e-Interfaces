package udla.CarlosCarvajal.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends  Hoja{
    private String persona;
    private  String carrera;
    private List<String> experiencia; // lista de java (añadiendo dos atributos y una lista)

    public Curriculo(String persona, String carrera, String contenido) { // creando un objeto adentro del constructor
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia = new ArrayList<>();

    }
    //metodo que resive una lista
    public Curriculo experiencia(String exp){ // llamar a mi propia clase para establecer todo la informacion  en una lista para encadenar
        experiencia.add(exp);
        return this; //regresa a la misma clase los valores de experiencia
    }



    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: "); // trabajar con cadena de caracteres
        sb.append(persona).append("\n")
                 .append("Resumen: ").append(this.contenido).append("\n")
                .append("Profesion: ")
                .append(this.carrera).append("\n")
                .append("Expereiencia: \n");
        for (String exp:this.experiencia){
            sb.append("-").append(exp).append("\n");
        }

        return sb.toString();
    }
}
