import java.util.Scanner;

public class Main {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

while (true) {
System.out.println("Bienvenido a la calculadora:");
System.out.println("1. Sumar");
System.out.println("2. Restar");
System.out.println("3. Multiplicar");
System.out.println("4. Dividir");
System.out.println("5. Salir");
System.out.print("Por favor, elija una opción: ");

int opcion = scanner.nextInt();
if (opcion == 5) {
System.out.println("¡Hasta luego!");
break;
}

System.out.print("Ingrese el primer número: ");
double num1 = scanner.nextDouble();
System.out.print("Ingrese el segundo número: ");
double num2 = scanner.nextDouble();

switch (opcion) {
case 1:
System.out.println("La suma es: " + (num1 + num2));
break;
case 2:
System.out.println("La resta es: " + (num1 - num2));
break;
case 3:
System.out.println("La multiplicación es: " + (num1 * num2));
break;
case 4:
if (num2 == 0) {
System.out.println("Error: no se puede dividir por cero.");
} else {
System.out.println("La división es: " + (num1 / num2));
}
break;
default:
System.out.println("Opción inválida. Por favor, elija una opción válida.");
}
}

scanner.close();
}
}