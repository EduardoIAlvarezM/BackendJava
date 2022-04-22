public class Original extends Mona{
    String activity;
    Original(int id, String name, String description, String author, String activity){
        super(id, name, description, author);
        this.activity = activity;
    }
    void display() {  System.out.println("ID: " + id + "\nNombre: " + name + "\nActividad: " + activity + "\nDescripción: " + description + "\nAutor: " + author);  }
}
