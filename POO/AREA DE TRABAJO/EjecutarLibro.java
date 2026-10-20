public class EjecutarLibro {

public static void main(String[]args){

//Creacion de los 5 libros 
Libro libro1 = new Libro("023-32", "Inglés", "verbos", 4354, true);
Libro libro2 = new Libro("737-84", "POO", "Wesley", 3636, true);
Libro libro3 = new Libro("746-84", "Matematicas", "roger", 6365, true);
Libro libro4 = new Libro("635-85", "Software II", "Pressman", 6364, true);
Libro libro5 = new Libro("636-94", "Fisica I", "Mattew", 1995, true);

//Mostrar la informacion de los libros 
System.out.println(libro1);
System.out.println(libro2);
System.out.println(libro3);
System.out.println(libro4);
System.out.println(libro5);

//Mostrar el titulo del libro2
System.out.println(libro2.getTitulo());

//Cambiar el isbn del libro5
libro5.setIsbn("7378-09");
System.out.println(libro5);

//Verficar si el libro3 esta disponible
System.out.println(libro3.estaDisponible()); //true 
 
 //Prestar el libro3
 libro3.prestar();
 }
}