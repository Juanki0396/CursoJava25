package ud4;

import java.util.TreeSet;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private Double nota;

    public Alumno(String nombre, Double nota){
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Double getNota() {
        return this.nota;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.nombre, this.nota);
    }

    @Override
    public int compareTo(Alumno alumno) {
        int comparation = (int) Math.round((this.getNota() - alumno.getNota()) * 100);
        if (comparation == 0){
            return this.getNombre().compareTo(alumno.getNombre());
        }
        return comparation;
    }
    

    public static void main(String[] args) {
        TreeSet<Alumno> set = new TreeSet<>();
        set.add(new Alumno("Pepe", 3.5));
        set.add(new Alumno("Ana", 2.1));
        set.add(new Alumno("Antonio", 7.0));
        set.add(new Alumno("Laura", 6.5));
        set.add(new Alumno("Alberto", 6.5));
        set.add(new Alumno("Alberto", 6.5));
        set.add(new Alumno("Paco", 1.2));
        set.add(new Alumno("Miguel", 9.9));
        for(Alumno a : set.reversed()){
            System.out.println(a);
        }
    }
}
