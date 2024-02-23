package es.comepiedras.introduccion;

public class Intro {

    public static void main(String[] args) {
        System.out.println("Bootcamp CF Java Profesional");

        imprimeTitulo("Tipos primitivos");
        // tipos primitivos
        int miEntero; // declaración de una variable de tipo entero
        miEntero = 400; // asignación de un valor sobre la variable de tipo entorno
        double pi = 3.141592; // declaración y asignación en la misma línea
        boolean bool = true; // valor boleano que permite los valores true o false
        char letra = 'a'; // un caracter o letra debe asignarse con el valor de la letra entre comillas simples
        System.out.println("miEntero " + miEntero + ", pi " + pi + ", bool " + bool + ", letra " + letra);


        imprimeTituloConEspacio("Objetos", 10);
        //Objetos
        Integer myInteger = 5;
        Double myDouble = 5.99;
        Character myCharacter = 'A';
        String myString = "ABCdef";
        System.out.println("myInteger " + myInteger + ", myDouble " + myDouble + ", myCharacter " + myCharacter);

        imprimeTitulo("Jugando con cadenas");
        System.out.println(myString);
        System.out.println("longitud de la cadena: " + myString.length());

        System.out.println("cadena en minúsculas: " + myString.toLowerCase());
        System.out.println("cadena en mayúsculas: " + myString.toUpperCase());

        imprimeTitulo("jugando con objetos String");
        objetoString();

        imprimeTitulo("Condicionales");
        condicionales();

        imprimeTituloConEspacio("Bucles", 4);
        blucles();

        imprimeTituloConEspacio("Arreglos", 4);
        arreglos();

        imprimeTitulo("Arreglos, sobrecarga");
        String [] myArreglo1 = {"hola", "como", "estas"};
        String [] myArreglo2 = {"este", "es", "otro", "arreglo", myArreglo1[0], "fin" };
        arreglos(myArreglo1);
        arreglos(myArreglo2);
    }

    public static void imprimeTituloConEspacio(String titulo, int length){
        subrayado(titulo.length(), length);
        String espacio = "";
        int total = length;
        while(--total>0){
            espacio+=" ";
        }
        System.out.println("|" + espacio + titulo.toUpperCase() + espacio + "|") ;
        subrayado(titulo.length(), length);
    }

    public static void imprimeTitulo(String titulo){
        subrayado(titulo.length());
        System.out.println("|" + titulo.toUpperCase() + "|") ;
        subrayado(titulo.length());
    }
    
    private static void subrayado(int length){
        subrayado(length, 1);
    }

    private static void subrayado(int length, int space){
        int total = length+(space*2);
        for (int i = 0; i < total; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    
    public static void objetoString() {
        // para comparar dos cadenas se debe utilizar el metodo equals de String
        String cadena1 = "Lunes";
        String cadena2 = "Lun" + cadena1.substring(3);
        System.out.println(cadena1.equals(cadena2));
        System.out.println(cadena1 == cadena2);
        System.out.println("cadena1 " + cadena1 + ", cadena2 " + cadena2);
    }

    public static void condicionales(){
        double otroDouble = 400.00;
        int miEntero = 400;
        if(miEntero == otroDouble){ // == != > >= < >=
            System.out.println("Números iguales");
        } else {
            System.out.println("Números diferentes");
        }

        boolean llueve = false;
        int temperatura = 20;

        if(temperatura >= 18 && !llueve){
            System.out.println("Es un gran día para pasear");
        }

        int edad = 16;
        boolean permisoPaterno = true;

        if(edad >= 18 || permisoPaterno){
            System.out.println("puede acceder");
        }
    }

    public static void blucles () {
        for (int i = 0; i < 7; i++) {
            System.out.println("imprime el valor de i " + i);
        }
    }

    public static void arreglos () {
        int [] myArreglo = {2,4,6,7,8,12,22};
        for (int i = 0; i < myArreglo.length; i++) {
            System.out.println("imprime el valor de i " + myArreglo[i]);
        }
    }

    // sobrecarga el metodo, con otro argumento
    // polimorfismo
    public static void arreglos(String [] myArrego){
        for (int i = 0; i < myArrego.length; i++) {
            System.out.println("cadena " + i + ": " + myArrego[i]);
        }
    }

}