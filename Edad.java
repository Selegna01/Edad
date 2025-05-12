import java.util.Scanner;
public class dad{
    private static final Scanner scanner = new Scanner (System.in);
    public static int obtenerNumero(String mensaje){
        int numeroTemporal;
        System.out.println(mensaje);
        numeroTemporal = scanner.nextInt();
        return numeroTemporal;
    }
    public static void main(String [] args ){
        int edad= obtenerNumero("Ingresa tu edad");
        if(edad>=18){
             System.out.println("Eres mayor de edad.");
            }else
        {
             System.out.println("Ere menor de edad");
        }
    }
}