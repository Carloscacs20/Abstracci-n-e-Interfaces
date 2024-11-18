package udla.CarlosCarvajal;

import udla.CarlosCarvajal.modelo.Curriculo;
import udla.CarlosCarvajal.modelo.Hoja;
import udla.CarlosCarvajal.modelo.Informe;

public class Main {
    public static void main(String[] args) {
        Curriculo curriculo = new Curriculo("Pachecho Cara Floja", "Ing. Software", "Resumen Laboral");
        curriculo.experiencia("Java");
        curriculo.experiencia("Oracle DBA");
        curriculo.experiencia("SpringBoot FrameWork");
        curriculo.experiencia("Desarrollador FullStank");
        curriculo.experiencia("Angular");

        Informe informe = new Informe("JJJ",  "KKK", "Contenido "+"Estudio Mircoservicios");
        imprimir(curriculo);
        imprimir(informe);
    }
    // como es una clase abstracta toca ingresar por medio de metodos
    public  static void imprimir(Hoja imprime){ //meteodo
        System.out.println(imprime.imprimir());
    }
    // se utiliza clase abstracta cuando tengo comportamientos comunes

}
