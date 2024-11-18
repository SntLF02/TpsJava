public class Persona {
    /**
     * Esta clase define objetos de tipo Persona con un nombre, apellidos,
     * número de documento de identidad y año de nacimiento.
     * @version 1.2/2020
     */
    String nombre; // Atributo que identifica el nombre de una persona
    String apellidos; // Atributo que identifica los apellidos de una persona
    String númeroDocumentoIdentidad;/* Atributo que identifica el número de documento de identidad de una persona */
    int añoNacimiento; /* Atributo que identifica el año de nacimiento de una persona */

    String pais;
    char genero;

    /**
     * Constructor de la clase Persona
     * @param nombre Parámetro que define el nombre de la persona
     * @param apellidos Parámetro que define los apellidos de la persona
     * @param númeroDocumentoIdentidad Parámetro que define el número del documento de identidad de la persona
     * @param añoNacimiento Parámetro que define el año de nacimiento de la persona
     */
    Persona(String nombre, String apellidos, String númeroDocumentoIdentidad, int añoNacimiento, String pais, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.númeroDocumentoIdentidad = númeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.pais=pais;
        this.genero=genero;
    }
    /**
     * Método que imprime en pantalla los datos de una persona
     */
    public void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = " + apellidos);
        System.out.println("Número de documento de identidad = " + númeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + añoNacimiento);
        System.out.println("Pais de origen: "+pais);
        System.out.println("Genero: "+genero);
        System.out.println();
    }
    /**
     * Método main que crea dos personas e imprime sus datos en pantalla
     */
    public static void main(String args[]) {
        Persona p1 = new Persona("Pedro","Pérez","1053121010",1998,"Argentina",'H');
        Persona p2 = new Persona("Luis","León","1053223344",2001,"Perú",'H');
        p1.imprimir();
        p2.imprimir();
    }

    //Ejercicio:
    //Agregar dos nuevos atributos a la clase Persona. Un atributo que represente el país de nacimiento de la persona (de tipo
    //String) y otro que identifique el género de la persona, el cual debe represen-tarse como un char con valores 'H' o 'M'.
    //_ Modificar el constructor de la clase Persona para que inicialices estos dos nuevos atributos.
    //_ Modificar el método imprimir de la clase Persona para que muestre en pantalla los valores de los nuevos atributos
}