import java.util.*;

public class Ejercicios1 {

	public static void main(String[] args) {

		// Ejercicio1
		
		System.out.println("Buenos días!");

		// Ejercicio 2

		int area;
		int lado = 5;

		area = lado * lado;

		System.out.println("el area del cuadrado de lado 5 es " + area);

		// Ejercicio 3
		double ladoCuadrado = 0.0;
		double areaCuadrado;

		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca el valor del lado del cuadrado");
		ladoCuadrado = reader.nextDouble();

		areaCuadrado = ladoCuadrado * ladoCuadrado;
		System.out.println("El area del cuadrado es " + areaCuadrado);

		// Ejercicio 4

		int num1 = 20;
		int num2 = 2;
		int suma, resta, multi;
		int divi;

		suma = num1 + num2;
		resta = num1 - num2;
		multi = num1 * num2;
		divi = num1 / num2;

		System.out.println("El resultado de su suma es " + suma);
		System.out.println("El resultado de su resta es " + resta);
		System.out.println("El resultado de su multiplicacion es " + multi);
		System.out.println("El resultado de su division es " + divi);

		// Ejercicio 5
		double radio;

		Scanner r2 = new Scanner(System.in);
		System.out.println("Introduzca el valor de radio");
		radio = r2.nextDouble();

		double longitudC = 2 * Math.PI * radio;
		double areaC = Math.PI * Math.pow(radio, 2);
		double volumenEs = (4 / 3.0) * Math.PI * Math.pow(radio, 3);

		System.out.println("La longitud de la circunferencia es " + longitudC);
		System.out.println("El volumen de la esfera " + volumenEs);
		System.out.println("El area del círculo es " + areaC);

		// Ejercicio 6
		int Precio1 = 100;
		int precio2 = 50;
		int Descuento = 100;
		int Total;

		Total = (precio2 * Precio1 / Descuento);

		System.out.println("El precio de descuento es " + Total);

		// Ejercicio 7
		final double millasMetros = 1852;
		double distanciaMillas;

		Scanner r3 = new Scanner(System.in);
		System.out.println("Introduce la distancia en millas");
		distanciaMillas = r3.nextDouble();

		System.out.println("La distancia en metros es " + (millasMetros * distanciaMillas));

		// Ejercicio 8
		double max, min, n1, n2;

		Scanner r4 = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		n1 = r4.nextDouble();
		System.out.println("Introduce el segundo numero");
		n2 = r4.nextDouble();
		min = Math.min(n1, n2);
		max = Math.max(n1, n2);
		System.out.println(min + ", " + max);

		// Ejercicio9

		double uno;
		double dos;

		Scanner r6 = new Scanner(System.in);
		System.out.println("Introduce el primer valor");
		uno = r6.nextDouble();
		System.out.println("Introduce el segundo valor");
		dos = r6.nextDouble();

		System.out.println("¿El primero es mayor? " + (uno > dos)); // True o False
		System.out.println("¿El segundo es mayor? " + (uno < dos));
		System.out.println("¿Son iguales? " + (uno == dos));

		// Ejercicio 10
		double a = 0;
		double b = 0;
		double c = 0;

		System.out.println("Introduce el primer valor");
		Scanner r5 = new Scanner(System.in);
		a = r5.nextDouble();
		System.out.println("Introduce el segundo valor");
		b = r5.nextDouble();
		System.out.println("Introduce el tercer valor");
		c = r5.nextDouble();

		double max3 = Math.max(c, Math.max(a, b));
		System.out.println("El numero mayor es " + max3);

		// Ejercicio11

		double numOne = 0.0;
		double numTwo = 0.0; // Profe no me desapruebe

		System.out.println("Introduce el primer valor");
		numOne = r6.nextDouble();
		System.out.println("Introduce el segundo valor");
		numTwo = r6.nextDouble();

		double sumas, restas, multip, divis;

		sumas = numOne + numTwo;
		restas = numOne - numTwo;
		multip = numOne * numTwo;
		divis = numOne / numTwo;

		System.out.println("El resultado de su suma es " + sumas);
		System.out.println("El resultado de su resta es " + restas);
		System.out.println("El resultado de su multiplicacion es " + multip);
		System.out.println("El resultado de su division es " + divis);

		// Ejercicio 12

		double a1 = 0;
		double b1 = 0;

		System.out.println("Introduce el primer valor");
		a1 = r6.nextDouble();
		System.out.println("Introduce el segundo valor");
		b1 = r6.nextDouble();

		double max2 = Math.max(b1, a1);
		System.out.println("El numero mayor es " + max2);

		// Ejercicio 13

		int uno1 = 0;
		System.out.println("Introduce el valor");
		uno1 = r6.nextInt();
		System.out.println("El valor es positivo? " + (uno1 >= 0));

		reader.close();
		r2.close();
		r3.close();
		r4.close();
		r5.close();
		r6.close();

	}

}
