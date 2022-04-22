import javax.swing.*;

public class testMona {
    public static void main(String[] args) {
        Original original = new Original(1, "Mona", "Octocat", "idokungfoo", "Mascota de Github");
        Octonaut octonaut = new Octonaut(15, "Octonaut", "Mona en el espacio con traje de astronauta", "cameronmcefee", "Astronauta");
        Grimrepo grimrepo = new Grimrepo(54, "Grim Repo", "Mona con túnica de La Muerte y mandíbula de calavera", "cameronmcefee", "Grim", "https://octodex.github.com/grim-repo/");
        Spidertocat spidertocat = new Spidertocat(87, "Spidertocat", "Mona con traje de Spiderman" , "jeejkang", "Mona protegiendo NY", "https://octodex.github.com/spidertocat/");
        PrivateInvestocat privateinvestocat = new PrivateInvestocat(119, "Private Investocat", "Mona investigación privada", "jeejkang", "Mona haciendo invstigaciones privadas", "https://octodex.github.com/privateinvestocat/");
        AdventureCat adventurecat = new AdventureCat(68, "Adventure Cat", "Mona con traje de Finn, el humano", "jonrohan", "Aventuras", "https://octodex.github.com/adventure-cat/");
        Octotron octotron = new Octotron(57, "Octotron", "Mona con traje de TRon", "broccolini", "Jugador de lasser disck", "https://octodex.github.com/octotron/");

        original.display();
        octonaut.display();
        grimrepo.display();
        privateinvestocat.display();
        adventurecat.display();
        octotron.display();
    }
}
