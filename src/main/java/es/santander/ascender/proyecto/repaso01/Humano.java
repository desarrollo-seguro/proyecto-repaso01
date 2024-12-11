package es.santander.ascender.proyecto.repaso01;

public class Humano {
    public static int NUMERO_OJOS;
    public static final double PI = 3.1415926535;
    private int estatura = 0;

    public Humano() {
        this.NUMERO_OJOS = 2;
    }

    public Humano(int estatura, int numeroOjos) {
        this.estatura = estatura;
        this.NUMERO_OJOS = numeroOjos;
    }

    public void metodoNoEstatico() {
        this.estatura = 4;
    }

    public static void metodoEstatico() {
        NUMERO_OJOS = 14;
        main(null);
    }


    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }


    public int getEstatura() {
        return estatura;
    }


    public static void main(String[] args) {
        Humano humano = new Humano();

        humano.estatura = 300;

        Humano humano2 = new Humano(45, 3);

        System.out.println("Valore aquí");


    }
}
