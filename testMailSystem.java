/**
 * Test verificador de proyecto.
 * @author (Carlos Alvarez)
 * @version (24/02/2018)
 */
public class testMailSystem
{
    // Simula un primer usuario de correo.
    private MailClient primerUsuario;
    // Simula un segundo usuario de correo.
    private MailClient segundoUsuario;
    // Simula nuestro servidor de correo.
    private MailServer grupoDServer;
    /**
     * Constructor for objects of class testMailSystem
     */
    public testMailSystem()
    {
        grupoDServer = new MailServer();
        primerUsuario = new MailClient(grupoDServer,"Juan");
        segundoUsuario = new MailClient(grupoDServer,"Pedro");
    }
    
    /**
     * Este test debe comprobar que nos de el número de mensajes
     * recibidos correcto para cada usuario y 0 si no hay ningun mensaje.
     */
    public void primeraFuncionTest ()
    {
        //Empty
    }
}