package es.santander.ascender.proyecto.repaso01;

public class Condicionales {
    public boolean isParConIf(int numero) {
        int resto = numero % 2;
        
        boolean par;
        if (resto == 0) {
            par = true;
        } else {
             par = false;
        }

        return par;
    }

    public boolean isParConSwitchCase(int numero) {
        int resto = numero % 2;
        
        boolean par = false;

        switch (resto) {
            case 1:
                par = false;
                break;
        
            case 0: 
                par = true;
                break;
        }
        return par;
    }
    
    public boolean isParConOperadorTernario(int numero) {
        throw new UnsupportedOperationException("No implementado aun");
    }    
}
