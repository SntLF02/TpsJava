package ejerc3;

public class MensajeTexto extends CanalNotificacion implements Personalizable {
    private String numeroTelefono;

    public MensajeTexto(String usuario, String mensaje, String numeroTelefono) {
        super(usuario, mensaje);
        this.numeroTelefono = numeroTelefono;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("--------------------------------------");
        System.out.println("Enviando mensaje de texto...");
        System.out.println("Usuario: " + usuario);
        System.out.println("Numero de telefono: " + numeroTelefono);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Mensaje de texto enviado con exito.");
        System.out.println("--------------------------------------");
    }

    @Override
    public void personalizarMensaje(String nuevoMensaje) {
        this.mensaje = nuevoMensaje;
        System.out.println("--------------------------------------");
        System.out.println("Mensaje personalizado para mensaje de texto: " + nuevoMensaje);
        System.out.println("--------------------------------------");
    }


}

