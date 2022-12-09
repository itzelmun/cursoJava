package condiciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Practica1 {
	
	ArrayList<Float> listaAlumnos = new ArrayList<>();
	//Es para leer datos de consola
	Scanner sc = new Scanner(System.in);
	
	int alumnosAprobados =0;
	int alumnosReprobados = 0;
	
	//se crea un método
	public void insertarCalificaciones() {
		
		//Para inicializar 
		//listaAlumnos=null;
		
		for (int i=0; i<=5; i++) {
			
			System.out.println("Dame la calificacion"+(i+1));
			float calificacion = sc.nextFloat();
			
			//validamos que las clificaciones esten en un rango de 0 a 10
			if(calificacion <0 & calificacion >11) {
				System.out.println("Dame una calificacion correcta"+(i+1));
				calificacion = sc.nextFloat();
				
			}
			
			
			if(calificacion >= 6) {
				
				//creamos un acumulador para los alumnos aprobados
				alumnosAprobados ++;
			}else {
				//creamos un acumulador para los alumnos reprobados
				alumnosReprobados ++;
			}
			
			listaAlumnos.add(calificacion);
			
		}
		
		System.out.println("Alumnos aprobados"+alumnosAprobados);
		System.out.println("Alumnos reprobados"+alumnosReprobados);
	}
	
	//creo un metodo de tipo void 
	public void obtenerCalificacion() {
		for(int i=0; i<=5; i++) {
			
			//con el get accede a cada una de las posiciones de los elementos de la coleccion
			System.out.println(listaAlumnos.get(i));
		}
		
	}
}
