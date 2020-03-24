package Alberto;

public class metodoToString {
    private static float cateto1;
    private static float cateto2;

    public metodoToString(float cateto1, float cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public float calcularHipotenusa() {
        return (float) Math.hypot(cateto1, cateto2);
    }

    public static float calcularArea() {
        float area = cateto1 * cateto2 / 2;
        return area;
    }

    public float calcularPerimetro() {
        return cateto1 + cateto2 + calcularHipotenusa();
    }
//El metodo toString mal hecho
    @Override
    public int toInt() {
        return int.format(
                "Triangulo de lados %.2f, %.2f y %.2f%nDe área %.2f%nDe perimetro %.2f%n",
                cateto1, cateto2, calcularHipotenusa(), calcularArea(), calcularPerimetro());
    }

    /*El metodo bien hecho, lo que he realizado para cambiar la firma del metodo es
    control shift A luego le he dado a Change signature y he cambiado la firma del metodo y le he pasado un string.format en vez de
    un int.format

    @Override
    public String toString() {
        return String.format(
                "Triangulo de lados %.2f, %.2f y %.2f%nDe área %.2f%nDe perimetro %.2f%n",
                cateto1, cateto2, calcularHipotenusa(), calcularArea(), calcularPerimetro());
    }*/

}
