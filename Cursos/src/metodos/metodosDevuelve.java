package metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class metodosDevuelve {

	static int numero1;
	static int numero2;
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		metodosDevuelve devolver = new metodosDevuelve();
		devolver.pedirDatos();
		int suma=devolver.sumar(numero2, numero1);
		System.out.println("la suma es:"+suma);
		
		//para pedir cadena de texto
		System.out.println("dame tu nombre");
		String nombre= sc.next();
		
		System.out.println(devolver.convertir(nombre));
		
		ArrayList<String> listaAccesorios;
		listaAccesorios= devolver.listar();
		System.out.println(listaAccesorios);
	}
	
	public void pedirDatos() {
		System.out.println("Dame un numero");
		numero1= sc.nextInt();
	
		System.out.println("Dame un numero");
		numero2=sc.nextInt();
	}
	
	public int sumar(int num1, int num2) {
		
		int suma=num1+num2;
		
		return suma;
	}
	
	
	public String convertir(String cadenaTexto) {
		cadenaTexto = cadenaTexto.toLowerCase();
		return cadenaTexto;
	}

	public ArrayList<String> listar(){
		
		//nota: siempre que hay un arrayList debe haber una instancia
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("Microfono");
		lista.add("Audifonos");
		lista.add("Bocina");
		
		return lista;
		
	}
	
	public void mostrarLista(ArrayList<String> lista) {
		
		//primero debe tener el tipo de dato de la coleccion
		//despues el nombre del elemento que le quieras dar a la lista
		//despues el nombre de nuestro array list
		for (String accesorios : lista ) {
			System.out.println(accesorios);
		}
	}
}
