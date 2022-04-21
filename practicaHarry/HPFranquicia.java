package practicaHarry;

public class HPFranquicia {
    public String name, house, gender, boggart, patronus;
    public HPFranquicia(String name, String house, String gender, String boggart, String patronus){
        this.name = name;
        this.house = house;
        this.gender = gender;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public String getName(){  return name;  }
    public String getHouse(){  return house;  }
    public String getGender(){  return gender;  }
    public String getBoggart(){  return boggart;  }
    public String getPatronus(){  return patronus;  }

    public boolean setName(){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;
    }

    public boolean setHouse(){
        if(!house.isEmpty()){
            this.house = house;
            return true;
        } else
            return false;
    }

    public boolean setGender(){
        if(gender.isEmpty()){
            this.gender = gender;
            return true;
        } else
            return false;
    }

    public boolean setBoggart(){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        } else
            return false;
    }

    public boolean setPatronus(){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        } else
            return false;
    }

    public String print(){
        return
                "░░░░░░░░POTTER FRANQUISE░░░░░░░░\nNombre: " + name + "\n" +
                        "Casa: " + house + "\n" +
                        "Género: " + gender + "\n" +
                        "Boggart: " + boggart + "\n" +
                        "Patronus: " + patronus;
    }
}