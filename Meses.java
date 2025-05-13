//Author:Estrada Romero Angeles
//Fecha:12/05/2025
//Descripción:Uso de IF_ELSE que pide al usuario un numero asignado de acuerdo a los mese del año.
import java.util.Scanner;

public class Meses{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número del 1 al 12: ");
        int numeroMes = scanner.nextInt();

        String nombreMes;

        if (numeroMes == 1) {
            nombreMes = "Enero";
        } else if (numeroMes == 2) {
            nombreMes = "Febrero";
        } else if (numeroMes == 3) {
            nombreMes = "Marzo";
        } else if (numeroMes == 4) {
            nombreMes = "Abril";
        } else if (numeroMes == 5) {
            nombreMes = "Mayo";
        } else if (numeroMes == 6) {
            nombreMes = "Junio";
        } else if (numeroMes == 7) {
            nombreMes = "Julio";
        } else if (numeroMes == 8) {
            nombreMes = "Agosto";
        } else if (numeroMes == 9) {
            nombreMes = "Septiembre";
        } else if (numeroMes == 10) {
            nombreMes = "Octubre";
        } else if (numeroMes == 11) {
            nombreMes = "Noviembre";
        } else if (numeroMes == 12) {
            nombreMes = "Diciembre";
        } else {
            nombreMes = "Número inválido";
        }

        System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);

        scanner.close();
    }
}
//El codigo a compilado;