package ud3.notificaciones;

public class Notificacion {
    protected String destinatario;
    protected String mensaje;

    public Notificacion(String destinatario, String mensaje){
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    void enviar(){
        System.out.printf("Mensaje: %s\n", this.mensaje);
    }
}
