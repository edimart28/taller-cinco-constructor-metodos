public class Operacion {


   int valorA;
   int valorB;

    public Operacion(int valorA, int valorB) {

        this.valorA = valorA;
        this.valorB = valorB;

    }
    public int suma() {
        return valorA + valorB;
    }
    public int resta() {
        return valorA - valorB;
    }

    public int multiplicacion() {
        return valorA * valorB;
    }
    public int divsion() {
        return valorA / valorB;
    }

}



