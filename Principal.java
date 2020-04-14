import java.util.ArrayList;
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
   // Boostrap de Aplicacion
    public static void main( String[] args)
    {
        ArrayList<Persona> empleados = new ArrayList<Persona>();
        empleados.add(new Persona("Omar", "Marenco"));        
        empleados.forEach((persona) -> System.out.println(persona.nombre));
        
    }
 
}
