//Unos de imonsh.jar

public class ProtegeMoi extends Comic implements ComicCallbacks{
    public ProtegeMoi(int id, String nombre, String descripcion, String autor){
        super(id, nombre, descripcion, autor);
    }

    @Override
    public void panel1(Screen s){
        s.setVisible(true);
        s.repaint();
        s.out(showMessage(), "Helvetica", 20, Colors.HighBlue);
        s.showImage("01.jpg");
        s.setBounds(200, 200, 900, 500);
    }

    @Override
    public void panel2(Screen s) {
        //s.cls();
        s.repaint();
        s.out(spaceMessage());
        s.showImage("02.jpg");
        s.setBounds(200, 200, 900, 500);
    }

    @Override
    public void panel3(Screen s) {
        s.repaint();
        s.out(spaceMessage());
        s.showImage("03.jpg");
        s.setBounds(200, 200, 900, 500);
    }

    @Override
    public void panel4(Screen s) {
        s.repaint();
        s.out(spaceMessage());
        s.showImage("04.jpg");
        s.setBounds(200, 200, 900, 500);
    }

    @Override
    public void panel5(Screen s) {
        s.repaint();
        s.out(spaceMessage());
        s.showImage("05.jpg");
        s.setBounds(200, 200, 900, 500);
    }

    @Override
    public void panel6(Screen s) {
        s.repaint();
        s.out(spaceMessage());
        s.showImage("06.jpg");
        s.setBounds(200, 200, 900, 500);
    }

    @Override
    public void panel7(Screen s) {
        s.repaint();
        s.out(spaceMessage());
        s.showImage("07.jpg");
        s.setBounds(200, 200, 900, 500);
    }

    @Override
    public void panel8(Screen s) {
        s.repaint();
        s.out(spaceMessage());
        s.showImage("08.jpg");
        s.setBounds(200, 200, 900, 500);
    }

    @Override
    public void panel9(Screen s) {
        s.repaint();
        s.out(spaceMessage());
        s.showImage("09.jpg");
        s.setBounds(200, 200, 900, 500);
    }

    @Override
    public void panel10(Screen s) {
        s.repaint();
        s.out(spaceMessage());
        s.showImage("10.jpg");
        s.setBounds(200, 200, 900, 500);
    }

    @Override
    public void panel11(Screen s) {
        s.repaint();
        s.out(spaceMessage());
        s.showImage("11.jpg");
        s.setBounds(200, 200, 900, 500);
    }

    public void panel12(Screen s){
        s.repaint();
        s.out(spaceMessage());
        s.showImage("12.jpg");
        s.setBounds(200, 200, 900, 500);
    }
}