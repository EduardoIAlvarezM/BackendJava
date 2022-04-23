public class SpiderMan {
    private int id;
    private String name, alias, attacks;

    SpiderMan(int id, String name, String alias, String attacks){
        this. id = id;
        this.name = name;
        this.alias = alias;
        this.attacks= attacks ;
    }

    public int getId(){  return id;  }
    public String getName(){  return name;  }
    public String getAlias(){  return alias;  }
    public String getAttacks(){  return attacks;  }

    public boolean setId(int id){
        if(id > 0){
            this.id = id;
            return true;
        } else
            return false;
    }

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;
    }

    public boolean setAlias(String alias){
        if(!alias.isEmpty()){
            this.alias = alias;
            return true;
        } else
            return false;
    }

    public boolean setAttacks(String attacks){
        if(!attacks.isEmpty()){
            this.attacks = attacks;
            return true;
        } else
            return false;
    }

    public String showMessage(){
        return
                "ID: " + id +
                        "\nNombre: " + name +
                        "\nAlias: " + alias +
                        "\nAtaques: " +attacks;
    }
}
