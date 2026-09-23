public class Estudiantes {

    
    private int id;
    private String nombre;
    private String curso;
    private double nota1;
    private double nota2;
    private double nota3;

public Estudiantes (int id, String nombre, String curso, double nota1, double nota2, double nota3) {
    this.id= id;
    this.nombre= nombre;
    this.curso=curso;
    this.nota1= nota1;
    this.nota2= nota2;
    this.nota3= nota3;
 }

public Strin toString (){
    return "Estudiantes [notas:" + notas + " nombre: " + nombre + " cursos: " + cursos + " id: " + id "]" ; 
 }

public double promedioNotas(){
    return (nota1 + nota2 + nota3) / 3;
}
}