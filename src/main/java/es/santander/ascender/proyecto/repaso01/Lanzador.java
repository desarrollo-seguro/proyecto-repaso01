package es.santander.ascender.proyecto.repaso01;

/**
 * Hello world!
 */
public class Lanzador {
    public static void main(String[] args) {

        int i;
        i = 4;

        System.out.println(i);

        i = i + 5;

        System.out.println(i);

        float b = 0.0f;

        double c = 0.0;

        c = 3.5;

        char miVariable;

        miVariable = 'D';

        miVariable = 70;

        String texto = "La letra en la variable es " + miVariable;

        System.out.println(texto);
        boolean res = (0 != 0);

        System.out.println("El nombre de la clase es " + Terminator.class);

        Terminator terminator1 = new Terminator();

        Terminator terminator2 = new Terminator();

        Terminator terminator3 = terminator2;

        
        Magdalena primeraMagdalena = new Magdalena(1, true);
        Magdalena segundaMagdalena = new Magdalena(2, false);

        segundaMagdalena.pegarMordisco();
        primeraMagdalena.pegarMordisco();

        System.out.println("Se acabó el programa");
    }
}
