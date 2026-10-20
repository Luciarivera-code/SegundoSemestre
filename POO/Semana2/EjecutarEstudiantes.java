public class EjecutarEstudiantes{
public static void main(String[] args) {
        Estudiantes objEdiante1 = new Estudiantes(1, "Juan", "Matemáticas", 8.5, 9.0, 7.5);
        Estudiantes objEdiant2= new Estudiantes(2, "María", "Ciencias", 9.5, 8.0, 8.5);

        System.out.println(objEdiante1); 
        System.out.println("Promedio: " + objEdiante1.promedioNotas());
        System.out.println(objEdiant2);
        System.out.println("Promedio: " + objEdiant2.promedioNotas());
}
}