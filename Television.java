public class Television extends Electrodomestico {
    private double resolucion;
    private boolean netflix;

    public Television(double precioBase, Color color, String consumoEnergetico, double peso, double resolucion, boolean netflix) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.netflix = netflix;
    }

    public Television(double precioBase, Color color, String consumoEnergetico, double peso) {
        this(precioBase, color, consumoEnergetico, peso, 20, false);
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isNetflix() {
        return netflix;
    }

    public void setNetflix(boolean netflix) {
        this.netflix = netflix;
    }

    @Override
    public String toString() {
        return super.toString() + ", Resolución: " + resolucion + " pulgadas, Netflix: " + netflix;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (resolucion > 20) {
            precioFinal += precioBase * 0.30;
        }
        if (netflix) {
            precioFinal += 60;
        }
        return precioFinal;
    }
}
