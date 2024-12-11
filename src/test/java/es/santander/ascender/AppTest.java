package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import es.santander.ascender.proyecto.repaso01.Humano;
import es.santander.ascender.proyecto.repaso01.Terminator;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
        Humano humano = new Humano();
        Terminator terminator = new Terminator();

        int estatura = humano.getEstatura();
        terminator.disparar();
    }
}
