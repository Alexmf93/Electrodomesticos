public class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora(double precioBase, Color color, String consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora(double precioBase, Color color, String consumoEnergetico, double peso) {
        this(precioBase, color, consumoEnergetico, peso, 5);
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() + ", Carga: " + carga + "kg";
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (carga > 6) {
            precioFinal += 50;
        }
        return precioFinal;
    }
}
