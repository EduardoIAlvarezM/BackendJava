import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Octonaut extends Mona{
    String activity;
    Octonaut(int id, String name, String description, String author, String activity){
        super(id, name, description, author);
        this.activity = activity;
    }

    void display() {  System.out.println("\nID: " + id + "\nNombre: " + name + "\nActividad: " + activity + "\nDescripció: " + description + "\nAutor: " + author);  }
}
