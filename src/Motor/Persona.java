package Motor;



import java.util.Date;
import java.util.GregorianCalendar;






public class Persona implements Comparable
{  
    private String nombre;  
    private String apellido;
    private Date fecha;
    private String foto;
    private String password;
    private Record partidas;
    private String nick;


    public Persona(String nombre, String apellido, String password, String nick) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.nick = nick;
        this.partidas = new Record();
    }

    public Persona(String nombre, String apellido, String password , String nick , Date fecha, String foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.foto = foto;
        this.password = password;
        this.nick = nick;
        this.partidas = new Record();
    }

    public Persona ()
    {
        this.partidas = new Record();
        
    }


    public String getApellido ()
    {
        return apellido;
    }

    public void setApellido (String apellido)
    {
        this.apellido = apellido;
    }

    public Date getFecha ()
    {
        return fecha;
    }

    public void setFecha (Date fecha)
    {
        this.fecha = fecha;
    }

    public String getFoto ()
    {
        return foto;
    }

    public void setFoto (String foto)
    {
        this.foto = foto;
    }

    public String getNick ()
    {
        return nick;
    }

    public void setNick (String nick)
    {
        this.nick = nick;
    }

    public String getNombre ()
    {
        return nombre;
    }
  
    public void setNombre (String nombre)
    {
        this.nombre = nombre;
    }

    
     public Record getPartidas ()
     {
        return partidas;
    }

  
    public void setPartidas (Record partidas) {
        this.partidas = partidas;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    void setFecha(int i) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public String toString() {
        return String.format("Nombre: "+ nombre +" Apellido: "+ apellido + " Nick: " + nick + "Path: " + foto + "fecha" + fecha);
    }



    public int compareTo(Object o) {
        Persona laPersona = (Persona) o;
        return this.nick.compareTo(laPersona.nick);
    }
}


