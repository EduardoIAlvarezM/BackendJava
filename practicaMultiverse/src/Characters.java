public class Characters {
    public static void main(String[] args) throws InterruptedException {
        Peter();
    }

    private static void Peter() throws InterruptedException{
        Screen sc = new Screen();
        PeterParker peter = new PeterParker(1,
                "▓▓▓▓Peter Benjamin Parker▓▓▓▓",
                "Spider-Man",
                "Impulso aéreo, esquivar, agarre de telaraña\n\n"
        );

        MilesMorales miles = new MilesMorales(2,
                "▓▓▓▓Miles Morale▓▓▓▓",
                "Spider-Man",
                "Camuflaje, Venom Blast, Energy explosion\n\n");

        PeterParkerNoir noir = new PeterParkerNoir(3,
                "▓▓▓▓Peter Parker▓▓▓▓",
                "Spider-Man Noir",
                "Telaraña orgánica, proyectiles de telaraña, francotirador");

        sc.setVisible(true);
        sc.out(peter.showMessage(), "Helvetica", 28, Colors.RoyalBlue);
        sc.out(miles.showMessage(), "Arial", 28, Colors.OrangeHibiscus);
        sc.out(noir.showMessage(), "Helvetica", 28, Colors.MaximumBlueGreen);
    }
}