package es.santander.ascender.proyecto.repaso01;

public class ControlFlujo {

    final int a;

    static double b = 0.0;

    static final boolean CERRADO = false;

    public ControlFlujo() {
        a = 4;
    }


    public void jugarConEstaticoYFinal() {
        ControlFlujo.darValor();
    }

    public static int darValor() {
        return (int)b + 5;
    }


    public static void main(String[] args) {
        //int c = ControlFlujo.a;
        double d = ControlFlujo.b;

        ControlFlujo cf = new ControlFlujo();
        //ControlFlujo.cerrado = false;

        if (ControlFlujo.CERRADO) {
            cf.jugarConEstaticoYFinal();
        } else {
            ControlFlujo.darValor();
        }

    }
}
