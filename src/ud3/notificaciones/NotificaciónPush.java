package ud3.notificaciones;

public class NotificaciónPush extends Notificacion{
    private String tokenDispositivo;

    public NotificaciónPush(String mensaje, String tokenDispositivo){
        super(null, mensaje);
        this.tokenDispositivo = tokenDispositivo;
    }

    void enviar(){
        System.out.printf("Enviando PUSH al dispositivo %s\n", this.tokenDispositivo);
        super.enviar();
    }
}
