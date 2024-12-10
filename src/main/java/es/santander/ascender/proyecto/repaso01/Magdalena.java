package es.santander.ascender.proyecto.repaso01;

public class Magdalena {
    private int sabor;
    private boolean comida;

    public Magdalena() {
        sabor = 0;
        comida = false;
    }

    public Magdalena(int sb, boolean comido) {
        this.sabor = sb;
        this.comida = comido;
    }

    public void pegarMordisco() {
        if (comida) {
            throw new RuntimeException("No puedes moder una magdalena que ya estaba comida");
        } else {
           comida = true; 
        }
    }

}
