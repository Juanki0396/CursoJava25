package ud3.notificaciones;

import java.util.ArrayList;
import java.util.List;

public class GestorNotificaciones {
    private List<Notificacion> notificaciones;

    public GestorNotificaciones(){
        this.notificaciones = new ArrayList<>();
    }

    void añadirNotificación(Notificacion n){
        this.notificaciones.add(n);
    }

    void enviarTodas(){
        for(Notificacion n : this.notificaciones){
            n.enviar();
        }
    }


}
