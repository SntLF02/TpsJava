package ejerc3;

public class CorreoElectronico extends CanalNotificacion implements Personalizable {
    private String direccionCorreo;

    public CorreoElectronico(String usuario, String mensaje, String direccionCorreo) {
        super(usuario, mensaje);
        this.direccionCorreo = direccionCorreo;
    }

    public String getDireccionCorreo() {
        return direccionCorreo;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("--------------------------------------");
        System.out.println("Enviando correo electronico...");
        System.out.println("Usuario: " + usuario);
        System.out.println("Direccion de correo: " + direccionCorreo);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Correo electronico enviado con exito.");
        System.out.println("--------------------------------------");
    }

    @Override
    public void personalizarMensaje(String nuevoMensaje) {
        this.mensaje = nuevoMensaje;
        System.out.println("--------------------------------------");
        System.out.println("Mensaje personalizado para correo electronico: " + nuevoMensaje);
        System.out.println("--------------------------------------");
    }
}
