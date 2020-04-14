
public class Estudiante extends Persona
{
    public String codigoEstudiante;
    public String codigoMatricula;
    
    public Estudiante(String n1, String ap1)
    {
        super(n1, ap1);
    
    }
    
    public void setName(String codigo){
        this.codigoEstudiante = codigo;
    }

}
