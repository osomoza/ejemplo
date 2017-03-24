package tema4;

/*
 * @author Ossqui
 */
public class persona {

    String nombre;
    int edad;
    float altura;

    String consulta_Nombre() {
        return nombre;
    }

    String consulta_Edad() {
        return Integer.toString(edad);
    }

    String consulta_Altura() {
        return Float.toString(altura);
    }

    void cambia_Nombre(String nom) {
        nombre = nom;
    }

    void cambia_edad(String edad) {
        this.edad = Integer.parseInt(edad);
    }

    void cambia_altura(String altura) {
        this.altura = Float.parseFloat(altura);
    }
}
