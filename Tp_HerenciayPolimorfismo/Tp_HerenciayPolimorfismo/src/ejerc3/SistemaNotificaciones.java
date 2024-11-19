package ejerc3;

public class SistemaNotificaciones {
    public static void main(String[] args) {
        Notificaciones notificaciones = new Notificaciones();

        CorreoElectronico correoElectronico = new CorreoElectronico("Raul Gimenez", "Bienvenido a nuestra aplicacion", "Rraul.gim@example.com");
        MensajeTexto mensajeTexto = new MensajeTexto("Maria Lopez", "Oferta especial para ti", "5551234567");

        notificaciones.agregarCanalNotificacion(correoElectronico);
        notificaciones.agregarCanalNotificacion(mensajeTexto);

        System.out.println("Informacion de los canales de notificacion:");
        notificaciones.mostrarInformacionCanalesNotificacion();

        System.out.println("\nPersonalizando mensajes:");
        notificaciones.personalizarMensajes("Nuevo mensaje personalizado");

        System.out.println("\nEnviando notificaciones:");
        notificaciones.enviarNotificaciones();
    }
}

