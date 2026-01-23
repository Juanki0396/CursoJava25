package ud3.notificaciones;

public class NotificacionEmail extends Notificacion {
    private String asunto;

    public NotificacionEmail(String destinatario, String mensaje, String asunto){
        super(destinatario, mensaje);
        this.asunto = asunto;
    }
    
    void enviar(){
        // System.out.println("Enviando EMAIL a " + this.destinatario);
        System.out.printf("Enviando EMAIL a %s\n", this.destinatario);
        System.out.printf("Asunto: %s\n", this.asunto);
        super.enviar();
    }
}
