package ejerc3;

import java.util.ArrayList;
import java.util.List;

public class Notificaciones {
    private List<CanalNotificacion> canalesNotificacion;

    public Notificaciones() {
        this.canalesNotificacion = new ArrayList<>();
    }

    public void agregarCanalNotificacion(CanalNotificacion canalNotificacion) {
        canalesNotificacion.add(canalNotificacion);
    }

    public void enviarNotificaciones() {
        for (CanalNotificacion canalNotificacion : canalesNotificacion) {
            canalNotificacion.enviarNotificacion();
        }
    }

    public void personalizarMensajes(String nuevoMensaje) {

        for (CanalNotificacion canalNotificacion : canalesNotificacion) {
            if (canalNotificacion instanceof Personalizable) {
                ((Personalizable) canalNotificacion).personalizarMensaje(nuevoMensaje);
            }
        }
    }

    public void mostrarInformacionCanalesNotificacion() {

        for (CanalNotificacion canalNotificacion : canalesNotificacion) {
            System.out.println("--------------------------------------");
            System.out.println("Usuario: " + canalNotificacion.usuario);
            System.out.println("Mensaje: " + canalNotificacion.mensaje);

            if (canalNotificacion instanceof CorreoElectronico) {
                System.out.println("Direccion de correo: " + ((CorreoElectronico) canalNotificacion).getDireccionCorreo());
            } else if (canalNotificacion instanceof MensajeTexto) {
                System.out.println("Numero de telefono: " + ((MensajeTexto) canalNotificacion).getNumeroTelefono());
            }
            System.out.println("--------------------------------------");
        }
    }
}

