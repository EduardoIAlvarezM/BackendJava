public class PeterParker extends SpiderMan implements  SpidermanActionCallbacks{
    public PeterParker(int id, String name, String alias, String attacks){
        super(id, name, alias, attacks);
    }

    public void webshooters(Screen s){
        s.setVisible(true);
        s.repaint();
        s.out(showMessage(), "Helvetica", 35, Colors.TwinkleBlue);
        s.showImage("");
        s.setBounds(200, 100, 900, 500);
    }

    public void costume(Screen s){
        s.repaint();
        s.out(showMessage(), "Helvetica", 35, Colors.TwinkleBlue);
        s.showImage("");
        s.setBounds(200, 100, 900, 500);
    }
}