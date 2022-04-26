//Unos de imonsh.jar

public class Comic {
    private int id;
    private String nombre, descripcion, autor;

    public Comic(int id, String nombre, String descripcion, String autor){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.autor = autor;
    }

    public int getId(){  return id;  }
    public String getNombre(){  return nombre;  }
    public String getDescripcion(){  return descripcion;  }
    public String getAutor(){  return autor;  }

    public boolean setI(int id){
        if(id > 0){
            this.id = id;
            return true;
        } else
            return false;
    }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setDescripcion(String descripcion){
        if(!descripcion.isEmpty()){
            this.descripcion = descripcion;
            return true;
        } else
            return false;
    }

    public boolean setAutor(String autor){
        if(!autor.isEmpty()){
            this.autor = autor;
            return true;
        } else
            return false;
    }

    public String showMessage(){
        return "ID: " + id + "\n" +
                "Nombre del comic:" + nombre + "\n" +
                "Descripción: " + descripcion + "\n" +
                "Autor/Dibujos: " + autor;
    }

    public String spaceMessage(){
        return "\n";
    }
}