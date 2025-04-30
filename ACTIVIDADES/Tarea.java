package actividad_01_lab_05;

public class Tarea {            // Clase Tarea
    private String Titulo;      // Atributos
    private String Descripcion;
    private int Prioridad;
                                // Constructor
    public Tarea(String Titulo,String Descripcion, int Prioridad ){
        this.Titulo=Titulo;          
        this.Descripcion=Descripcion;
        this.Prioridad=Prioridad;
    }
                                // Getters
    public String getTitulo() {
        return Titulo;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public int getPrioridad() {
        return Prioridad;
    }
                                // Setters 
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    public void setPrioridad(int Prioridad) {
        this.Prioridad = Prioridad;
    }
                              // Método toString
    @Override
    public String toString() {
        return "Tarea: Titulo = " + Titulo + ", Descripcion = " + Descripcion + ", Prioridad = " + Prioridad;
    }
}
