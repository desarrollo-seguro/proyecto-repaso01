package es.santander.ascender.proyecto.repaso01;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class CondicionalesTest {
    @Test
    void testIsParConIf() {
        Condicionales aQuienTesteo = new Condicionales();
        
        boolean resultado = aQuienTesteo.isParConIf(5);

        assertFalse(resultado);
    }

    @Test
    void testIsParConOperadorTernario() {
        Condicionales aQuienTesteo = new Condicionales();
        
        boolean resultado = aQuienTesteo.isParConOperadorTernario(5);

        assertFalse(resultado);
    }

    @Test
    void testIsParConSwitchCase() {
        Condicionales aQuienTesteo = new Condicionales();
        
        boolean resultado = aQuienTesteo.isParConSwitchCase(5);

        assertFalse(resultado);
    }
}
