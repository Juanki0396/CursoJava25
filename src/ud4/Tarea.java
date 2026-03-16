package ud4;

import java.util.PriorityQueue;

public class Tarea {
    private String descripcion;
    private Integer prioridad;

    public Tarea(String descripcion, Integer prioridad){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public Integer getPrioridad() {
        return this.prioridad;
    }

    public void procesar(){
        System.out.printf("Procesando Tarea(p=%d): %s.\n", this.prioridad, this.descripcion);
    }

    public static void main(String[] args) {
        PriorityQueue<Tarea> lisTareas = new PriorityQueue<>((a,b) -> a.getPrioridad() - b.getPrioridad());
        lisTareas.add(new Tarea("Sacar la basura", 3));
        lisTareas.add(new Tarea("Hacer la comida", 1));
        lisTareas.add(new Tarea("Hacer la cama", 5));
        lisTareas.add(new Tarea("Estudiar", 2));
        lisTareas.add(new Tarea("Limpiar el baño", 4));
        lisTareas.add(new Tarea("Revisar el buzon", 6));
        lisTareas.add(new Tarea("Echarse la siesta", 5));
        Tarea t = null;
        while ((t = lisTareas.poll()) != null) {
            t.procesar();
        }

    }
}
