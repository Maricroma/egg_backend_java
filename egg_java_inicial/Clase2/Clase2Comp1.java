package Clase2;
import java.util.Scanner;

public class Clase2Comp1 {
    
    public static void main(String[] args) {
        final int ANIO_ACTUAL = 2024;
        int anioNacimiento, calculoEdad;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nIngrese su año de nacimiento:");
        anioNacimiento = sc.nextInt();
        calculoEdad = ANIO_ACTUAL - anioNacimiento;
        System.out.println(String.format("%s", (calculoEdad>18? "Es mayor de edad" : "Es menor de edad")));

        sc.close();
    }
}

//CONSIGNA:
// Pide al usuario que ingrese su año de nacimiento y almacena el dato en una variable previamente declarada llamada añoNacimiento.

// Declara una variable del tipo Constante llamado ANIOACTUAL con el año actual.

// Calcula la edad actual del usuario, considerando que la cuenta sería ANIOACTUAL - añoNacimiento. Almacena el dato en una variable llamada calculoEdad.

// Determina si el usuario es mayor de edad (tener 18 años o más) y muestra un mensaje apropiado.