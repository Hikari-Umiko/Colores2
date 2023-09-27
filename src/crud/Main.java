package crud;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
 public static void main(String[]Cecyto){
	 Scanner in=new Scanner(System.in);
	 ArrayList<Alumno> listaAlumnos=new ArrayList<Alumno>();
	 int opcion=0;
	 do {
		 System.out.println("1. Agregar Alumno");
		 System.out.println("2. Ver Alumno");
		 System.out.println("3. Salir");
		 System.out.println("Elige Opcion?");
		 opcion=in.nextInt();
		 switch(opcion) {
		 case 1:
			 in.nextLine();
			 Alumno x=new Alumno();
			 System.out.println("Numero de Control");
			 x.setNumControl(in.nextLine());
			 System.out.println("Nombre");
			 x.setNombre(in.nextLine());
			 System.out.println("Apellido Paterno");
			 x.setAp(in.nextLine());
			 System.out.println("Apellido Materno");
			 x.setAm(in.nextLine());
			 System.out.println("Grupo");
			 x.setGrupo(in.nextLine());
			 System.out.println("Carrera");
			 x.setCarrera(in.nextLine());
			 System.out.println("Turno");
			 x.setTurno(in.nextLine());
			 listaAlumnos.add(x);
			 break;
		 case 2:
			 System.out.println("NumCont\tNombre\t\t\tGRUPO\tCARRERA\tTURNO");
			 for(Alumno a :listaAlumnos) {
				 a.imprimirAlumno();
			 }
			 break;
		 case 3:
			 System.out.println("ADIOS MOSTEQUERO");
			 default:
				 System.out.println("Error");
		 }
	 }while (opcion !=3);
 }
}
