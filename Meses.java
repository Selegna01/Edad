//Author:Estrada Romero Angeles
//Fecha:12/05/2025
//Descripción:Uso de IF_ELSE que pide al usuario un numero asignado de acuerdo a los mese del año.
import java.util.Scanner;
public class Meses{
    private static final Scanner scanner = new Scanner (System.in);
    public static int obtenerNumero(String mensaje){
        int numeroTemporal;
        System.out.println(mensaje);
        numeroTemporal = scanner.nextInt(20);
        return numeroTemporal;
    }
    public static void main(String [] args ){
        int mes= obtenerNumero("Ingresa un numero: ");
         public static void main(String [] args ){
            if(numero)
        int numero_Mes = ObtenerNumero("Ingresa un numero");
        if(numero_Mes == 1){
            System.out.println("Estas en Enero.");
        }else if(numero_Mes ==2){
            System.out.println("Estas en Febrero.");
        }else if(numero_Mes ==3){
            System.out.println("Estas en Marzo.");
        }else if(numero_Mes ==4){
            System.out.println("Estas en Abril.");
        }else if(numero_Mes == 5){
             System.out.println("Estas en Mayo.");
        }else if(numero_Mes ==6){
             System.out.println("Estas en Junio.");
        }else if(numero_Mes ==7){
             System.out.println("Estas en Julio.");
        }else if(numero_Mes ==8){
             System.out.println("Estas en Agosto.");
        }else if(numero_Mes ==9){
             System.out.println("Estas en Septiembre.");
        }else if(numero_Mes ==10){
             System.out.println("Estas en Octubre.");
        }else if(numero_Mes ==11){
             System.out.println("Estas en Nomviembre.");
        }else if(numero_Mes ==12){
            System.out.println("Estas en Diciembre.");
        }else {
            System.out.println("ERROR.Ingresa un numero valido.");
        }
    }
    }
}