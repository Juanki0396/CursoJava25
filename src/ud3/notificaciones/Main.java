package ud3.notificaciones;

public class Main {
    public static void main(String[] args) {
        GestorNotificaciones g = new GestorNotificaciones();
        NotificacionEmail notiEmail = new NotificacionEmail("carmen@yahoo.es", "No llegamos con el proyecto", "Trabajo");
        g.añadirNotificación(notiEmail);
        g.añadirNotificación(new NotificacionEmail("ramon@gmail.com", "Te echo de menos Ramon", "Lo nuestro"));
        g.añadirNotificación(new NotificaciónPush("Nuevo whatsapp de Paco", "lksdjaflkjdsal32ee"));

        g.enviarTodas();

    }
}
