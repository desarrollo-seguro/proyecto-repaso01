package es.santander.ascender.proyecto.repaso01;

public class Humano {
    public final int NUMERO_OJOS;
    private int estatura = 0;

    public Humano() {
        this.NUMERO_OJOS = 2;
    }

    public Humano(int estatura, int numeroOjos) {
        this.estatura = estatura;
        this.NUMERO_OJOS = numeroOjos;
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
