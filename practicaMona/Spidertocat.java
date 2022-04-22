public class Spidertocat extends Mona{
    String activity, web;
    Spidertocat(int id, String name, String description, String author, String activity, String web){
        super(id, name, description, author);
        this.activity = activity;
        this.web = web;
    }

    void display(){  System.out.println("\nID: " + id + "\nNombre: " + name + "\nActividad: " + activity + "\nDescripció: " + description + "\nAutor: " + author + "\nWeb: " + web);  }
}
