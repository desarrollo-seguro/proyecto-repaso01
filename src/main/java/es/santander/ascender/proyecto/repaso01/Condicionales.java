package es.santander.ascender.proyecto.repaso01;

public class Condicionales {
    public boolean isPar(int numero) {
        return numero % 2 == 0;
    }

    public boolean isParConIf(int numero) {
        int resto = numero % 2;
        
        boolean par;
        if (resto == 0) {
            par = true;
        } else {
             par = false;
        }

        if (true) {
            //
        } else {
            //
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
        int resto = (numero % 2);

        return (resto == 0) ? true : false;
    }    

    public boolean isDiaLaborable(int diaDeLaSemana) {
        boolean resultado = false;
        switch (diaDeLaSemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                resultado = true;
                break;
            default:
                resultado = false;
                break;
        }
        return resultado;
    }


}
