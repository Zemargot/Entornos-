package Antonio;

import static General.Triangulo.calcularArea;

public class Composicion {

    public boolean calcularAreaMayorQue10(){
        if (calcularArea() < 10)
            return false;
        return true;
    }

    public boolean calcularAreaMenorQur10(){
        if (calcularArea() > 10)
            return false;
        return true;
    }
}
