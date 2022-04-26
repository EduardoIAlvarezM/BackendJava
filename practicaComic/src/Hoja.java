//Unos de imonsh.jar

public class Hoja {
    public static void main(String[] args) throws InterruptedException {
        testProtegeMoi();
    }

    private static void testProtegeMoi() throws InterruptedException{
        Screen sc = new Screen();
        ProtegeMoi pm = new ProtegeMoi(
                1,
                "Protege Moi",
                "Primner comic con la presentación de L version femenina",
                "ZerØ (Eduardo I. Alvarez M.\n)"
        );

        Runnable mostrar = new Runnable() {
            @Override
            public void run() {
                try {
                    pm.panel1(sc);
                    Thread.sleep(10000);

                    pm.panel2(sc);
                    Thread.sleep(10000);

                    pm.panel3(sc);
                    Thread.sleep(10000);

                    pm.panel4(sc);
                    Thread.sleep(10000);

                    pm.panel5(sc);
                    Thread.sleep(10000);

                    pm.panel6(sc);
                    Thread.sleep(10000);

                    pm.panel7(sc);
                    Thread.sleep(10000);

                    pm.panel8(sc);
                    Thread.sleep(10000);

                    pm.panel9(sc);
                    Thread.sleep(10000);

                    pm.panel10(sc);
                    Thread.sleep(10000);

                    pm.panel11(sc);
                    Thread.sleep(10000);

                    pm.panel12(sc);
                } catch(InterruptedException ie){  ie.printStackTrace();  }
            }
        };

        Thread mostrarPanel = new Thread(mostrar);
        mostrarPanel.start();
    }
}