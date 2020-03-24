package SergioTratarConLaGeneralizacion;

public class Triangulo {


    float lado1;
    float lado2;
    float lado3;

    class TrianguloIsoceles extends Triangulo{

        public TrianguloIsoceles(float lado1, float lado2, float lado3) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }

    }

    class TrianguloEquilatero extends Triangulo{

        public TrianguloEquilatero(float lado1, float lado2, float lado3) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }

    }

    class TrianguloEscaleno extends Triangulo{

        public TrianguloEscaleno(float lado1, float lado2, float lado3) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }

        public boolean comprobarSiEsTrianguloRectangulo(TrianguloEscaleno trianguloEscaleno){
            if (Math.pow(trianguloEscaleno.lado1,2) + Math.pow(trianguloEscaleno.lado2,2) == Math.pow(trianguloEscaleno.lado3,2)||
                    Math.pow(trianguloEscaleno.lado1,2) + Math.pow(trianguloEscaleno.lado1,2) == Math.pow(trianguloEscaleno.lado1,2)||
                    Math.pow(trianguloEscaleno.lado1,2) + Math.pow(trianguloEscaleno.lado1,2) == Math.pow(trianguloEscaleno.lado1,2))
                return true;
            return false;
        }
    }

    /* Codigo incorrecto

   Para evitar las generalidad de las variables de los lados en las tres clases hice uso del pull members up
   Seleccionamos los metodos a los que vamos afectar y
   dandole a crtl + shift + a y seleccionando la opcion pull members up
   tras esto seleccionamos los valores o metodos que queremos sacar a la
   clase padre y lo hacemos.

    class TrianguloIsoceles extends Triangulo{
        private float lado1;
        private float lado2;
        private float lado3;

        public TrianguloIsoceles(float lado1, float lado2, float lado3) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }
    }

    class TrianguloEquilatero extends Triangulo{
        private float lado1;
        private float lado2;
        private float lado3;

        public TrianguloEquilatero(float lado1, float lado2, float lado3) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }
    }

    class TrianguloEscaleno extends Triangulo{
        private float lado1;
        private float lado2;
        private float lado3;

        public TrianguloEscaleno(float lado1, float lado2, float lado3) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }
    }

    Como los unicos triangulos rectangulos son los escalenos no nos interesas que el metodo este en la clase padre
    por lo que usaremos la tecnica de refactorizacion push members down para meterlo en la clase TrianguloEscaleno
    para esto pulsamos ctrl - shift + a y escribimos y seleccionamos push members down y hay seleccionamos que metodo
    o parametros queremos introducir en la clase.

    public boolean comprobarSiEsTrianguloRectangulo(TrianguloEscaleno trianguloEscaleno){
        if (Math.pow(trianguloEscaleno.lado1,2) + Math.pow(trianguloEscaleno.lado2,2) == Math.pow(trianguloEscaleno.lado3,2)||
                Math.pow(trianguloEscaleno.lado1,2) + Math.pow(trianguloEscaleno.lado1,2) == Math.pow(trianguloEscaleno.lado1,2)||
                Math.pow(trianguloEscaleno.lado1,2) + Math.pow(trianguloEscaleno.lado1,2) == Math.pow(trianguloEscaleno.lado1,2))
            return true;
        return false;
    }
    */

}

