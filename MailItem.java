/**
 * A class to model a simple mail item. The item has sender and recipient
 * addresses and a message string.
 * 
 * @param from The sender of this item.
 * @param to The intended recipient of this item.
 * @param subject The subject of the message to be sent.
 * @param message The text of the message to be sent.
 * 
 * @modificaciones (carlos alvarez
 * @version 2018.02.24
 */
public class MailItem
{
    // The sender of the item.
    private String from;
    // The intended recipient.
    private String to;
    // The text of the message.
    private String message;
    // The subject of the message.
    private String subject;
    // Asunto.
    private String asunto;
    /**
     * Create a mail item from sender to the given recipient,
     * containing the given message.
     * @param from The sender of this item.
     * @param to The intended recipient of this item.
     * @param message The text of the message to be sent.
     */
    public MailItem (String from, String to, String message,String asunto)
    {
        this.from = from;
        this.to = to;
        this.message = message;
        this.subject = subject;
        this.asunto = asunto;
    }

    /**
     * @return The sender of this message.
     */
    public String getFrom()
    {
        return from;
    }

    /**
     * @Devuelve el texto del mensaje
     */
    public String getAsunto()
    {
        return asunto;
    }
    
    /**
     * @return The intended recipient of this message.
     */
    public String getTo()
    {
        return to;
    }

    /**
     * @return The text of the message.
     */
    public String getMessage()
    {
        return message;
    }
      
    /**
     *  Devuelve un valor true si en el mensaje aparece una cadena inválida.
     *  En caso contrario, devuelve false
     */
    public boolean comprobarSpam()
    {
        boolean esSpam = false;
       if (getMessage().toLowerCase().indexOf("viagra") > 0)
        {
            esSpam = true;
       }
        if (getMessage().toLowerCase().indexOf("regalo") > 0)
        {
            esSpam = true;
        }
        return esSpam;
    }
    
    /**
     * Sout mensajes de Email.
     */
    public void print()
    {   
        if(comprobarSpam())
        {
            System.out.println("Spam");
        }
       else
        {
            System.out.println("From: " + from);
            System.out.println("To: " + to);
            System.out.println("Message: " + message);
            System.out.println("asunto: " + asunto);
            System.out.println("subject: " + subject);
        }
    }
}
