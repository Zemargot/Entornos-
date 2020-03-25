package Sara;

public class Organizacion_datos {

    /**
 * Esta tecnica se encarga de crear una constante, se nombra
 * significativamente y se sustituye por el literal
 * @author Sara
 * @author saramoduloDAM@gmail.com
 */
    private static float cateto1;
    private static float cateto2;

    //Constante "FORMULA_HIPOTENUSA
    public static final float FORMULA_HIPOTENUSA = (float) Math.hypot(cateto1,cateto2);
    public Organizacion_datos(float cateto1, float cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    //Vamos a modificar este método con nuestra técnica de refactorizacion
    //En este caso usaremos la creación de una constante
    //para así poder reutilzar y simplificar.

    public float calcularHipotenusa() {

        //
        return (float) FORMULA_HIPOTENUSA;
    }


    public static float calcularArea() {
        float area = cateto1 * cateto2 / 2;
        return area;
    }

    public float calcularPerimetro() {
        return cateto1 + cateto2 + calcularHipotenusa();
    }

    @Override
    public String toString() {
        return String.format(
                "Triangulo de lados %.2f, %.2f y %.2f%nDe área %.2f%nDe perimetro %.2f%n",
                cateto1, cateto2, calcularHipotenusa(), calcularArea(), calcularPerimetro());
    }


}
