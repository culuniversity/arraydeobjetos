
/**
 * Clase persona para iniciar la educacion de POO
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    String nombre;
    String apellido;
    String telefono;
    String genero;
    
    // Primer codigo que se va a ejecutar cuando se instancie la case.   
    
    public Persona()
    {
           
    
    }
    
    
    public Persona(String nom, String ape)
    {
        this.nombre = nom;
        this.apellido = ape;
        
        // initialise instance variables
    
    }
    
    public void setTelefono(String tel){
        this.telefono = tel;
    }     
    
    
    public String getNombre(){
       return this.nombre; 
    }
    
    

    
    
}
