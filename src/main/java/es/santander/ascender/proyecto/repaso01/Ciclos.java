package es.santander.ascender.proyecto.repaso01;

public class Ciclos {
    private int[] numeroParesMenoresDe20 = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18};

    private double[] valoresDouble = new double[] {4.5, 23.4};
    
    private boolean[] listaBooleanos;
    private char[] caracteres;

    private String[] args;

    public int sumaNumerosParesMenoresDe20() {
        int suma = 0;

        int i = 0;
        while (i < numeroParesMenoresDe20.length) {
            suma = suma + numeroParesMenoresDe20[i];
            i++;
        }

        // suma = suma + numeroParesMenoresDe20[0];
        // suma = suma + numeroParesMenoresDe20[1];
        // suma = suma + numeroParesMenoresDe20[2];
        // suma = suma + numeroParesMenoresDe20[3];
        // suma = suma + numeroParesMenoresDe20[4];
        // suma = suma + numeroParesMenoresDe20[5];
        // suma = suma + numeroParesMenoresDe20[6];
        // suma = suma + numeroParesMenoresDe20[7];
        // suma = suma + numeroParesMenoresDe20[8];

        return suma;
    }

    public int sumaNumerosParesMenoresDe20ConFor() {
        int suma = 0;

        for (int i = 0; i < numeroParesMenoresDe20.length ; i ++) {
            suma = suma + numeroParesMenoresDe20[i];
        }

        return suma;
    }

    public int sumaParesMenoresDeMil() {
        int suma = 0;

        for (int par = 2; par < 1000 ; par += 2) {
            suma += par;
        }

        return suma;
    }
}
