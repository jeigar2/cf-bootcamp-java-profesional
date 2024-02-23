package es.comepiedras.ejercicios;

public class EjercicioDia1 {
    public static void main(String[] args) {
		int sumatorio = sumaDel1Al255();
        System.out.println("sumatorio del 1 al 255 = " + sumatorio);
        
        int [] arreglo = {1,25,3,112,3,4,-4444};
        Integer resultado = obtenerMaximoArreglo(arreglo);
        System.out.println("maximo = " + resultado);
        
        int [] arregloPares = {1,3,4,5};
        imprimeParesArreglo(arregloPares);
        int [] arregloPares2 = {2,3,4,5,6,7,8,33,44,66,88};
        imprimeParesArreglo(arregloPares2);
        
        int [] arregloPrimos = {13, 15, 17};
        int primo;
        for(int i=0; i< arregloPrimos.length; i++){
            primo = arregloPrimos[i];
            System.out.println(primo + " " + (esPrimo(primo)?"Es primo":"no es primo"));
        }
	}
	
    //Crea una función que sume los números del 1 - 255
    public static int sumaDel1Al255(){
        return sumaNumerosConsecutivos(1, 255);
    }
    
    private static int sumaNumerosConsecutivos(int inicio, int fin){
        int sumatorio = 0;
        for (int i = inicio; i <= fin ;i++){
            sumatorio += i;
        } 
        return sumatorio;
    }
    
    //Crea una función que reciba un arreglo y regrese el número máximo
    public static int obtenerMaximoArreglo(int [] arreglo) { 
        Integer maximo = null;
        if(arreglo != null) {
            for(int i = 0; i < arreglo.length; i++) {
                if (i == 0 || maximo <= arreglo[i]) {
                    maximo = arreglo[i];
                    
                }
            }
        }
        return maximo;
    }
    
    //Crea una función que reciba un arreglo e imprima los números pares.
    public static void imprimeParesArreglo(int [] arreglo) {
        String resultado = "";
        if(arreglo != null){
            for(int i = 0; i < arreglo.length; i++)
                if (arreglo[i] % 2 == 0) {
                    resultado += "," + arreglo[i];
            }
            System.out.println("resultado pares = " + ((resultado.length()>0)?resultado.substring(1):"no hay pares"));
        }
    }
    
    //Crea una función que reciba un número y regrese verdadero o falso dependiendo si el número es primo.
    public static boolean esPrimo(int numero){
        boolean divisor = false;
        int numeroAnterior = numero - 1;
        while(numeroAnterior > 1 && !divisor){
            divisor = numero % numeroAnterior == 0;
            numeroAnterior--;
        }
        return numeroAnterior == 1 || !divisor;
    }
}