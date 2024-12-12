package es.santander.ascender.proyecto.repaso01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CiclosTest {
    @Test
    void testSumaNumerosParesMenoresDe20() {
        Ciclos ciclos = new Ciclos();

        int resultado = ciclos.sumaNumerosParesMenoresDe20();

        assertEquals(90, resultado);
    }

    @Test
    void testSumaNumerosParesMenoresDe20ConFor() {
        Ciclos ciclos = new Ciclos();

        int resultado = ciclos.sumaNumerosParesMenoresDe20ConFor();

        assertEquals(90, resultado);
    }

    @Test
    void testSumaNumerosParesMenoresDeMil() {
        Ciclos ciclos = new Ciclos();

        int resultado = ciclos.sumaParesMenoresDeMil();

        assertEquals(249500, resultado);
    }    
}
