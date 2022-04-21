package practicaHarry;

public class Personajes {
    public static void main(String[] args) {
        def();
    }

    public static void def(){
        HPFranquicia harry = new HPFranquicia("Harry James Potter", "Gryffindor", "Male", "Dementor", "Stag");
        HPFranquicia hermione = new HPFranquicia("Hermione Granger ", "Gryffindor", "Female", "Failure", "Otter");
        HPFranquicia snape = new HPFranquicia("Severus Snape", "Slytherin", "Male", "Lord Voldemort", "Deer");
        HPFranquicia tRiddle = new HPFranquicia("Tom Marvolo Riddle", "Slytherin", "Male", "His own corpse", "None");
        HPFranquicia luna = new HPFranquicia("Luna Lovegood", "Ravenclaw", "Female", "DNA", "Hare");

        /*String msg ="********Personajes de Harry Potter";
        msg += "Nombre: "+ harry.getName();
        msg += "\nCasa: " + harry.getHouse();
        msg += "\nGénero: " + harry.getGender();
        msg += "\nBoggart: " + harry.getBoggart();
        msg += "\nPatronus: " + harry.getPatronus();

        System.out.println(msg);*/
        System.out.println(harry.print());
        System.out.println(hermione.print());
        System.out.println(snape.print());
        System.out.println(tRiddle.print());
        System.out.println(luna.print());
    }
}
