abstract class Electrodomestico {

    protected double precioBase;
    protected Color color;
    protected String consumoEnergetico;
    protected double peso;

    private static final double PRECIO_CONSUMO_A_PLUS = 120;
    private static final double PRECIO_CONSUMO_A = 100;
    private static final double PRECIO_CONSUMO_B = 80;
    private static final double PRECIO_CONSUMO_C = 60;
    private static final double PRECIO_CONSUMO_D = 50;
    private static final double PRECIO_CONSUMO_E = 30;
    private static final double PRECIO_CONSUMO_F = 10;

    private static final double PRECIO_PESO_0_19KG = 10;
    private static final double PRECIO_PESO_20_49KG = 30;
    private static final double PRECIO_PESO_50_79KG = 50;
    private static final double PRECIO_PESO_MAYOR_80KG = 100;

    public Electrodomestico(double precioBase, Color color, String consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
    }

    public Electrodomestico() {
        this(100, Color.BLANCO, "A", 10);
    }

    private void comprobarConsumoEnergetico(String letra) {
        switch (letra) {
            case "A+":
                this.consumoEnergetico = "A+";
                break;
            case "A":
                this.consumoEnergetico = "A";
                break;
            case "B":
                this.consumoEnergetico = "B";
                break;
            case "C":
                this.consumoEnergetico = "C";
                break;
            case "D":
                this.consumoEnergetico = "D";
                break;
            case "E":
                this.consumoEnergetico = "E";
                break;
            case "F":
                this.consumoEnergetico = "F";
                break;
            default:
                this.consumoEnergetico = "A";
                break;
        }
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String toString() {
        return "Precio base: " + precioBase + "€, Consumo energético: " + consumoEnergetico + ", Peso: " + peso + "kg";
    }

    public double precioFinal() {
        double precioFinal = precioBase;

        switch (consumoEnergetico) {
            case "A+":
                precioFinal += PRECIO_CONSUMO_A_PLUS;
                break;
            case "A":
                precioFinal += PRECIO_CONSUMO_A;
                break;
            case "B":
                precioFinal += PRECIO_CONSUMO_B;
                break;
            case "C":
                precioFinal += PRECIO_CONSUMO_C;
                break;
            case "D":
                precioFinal += PRECIO_CONSUMO_D;
                break;
            case "E":
                precioFinal += PRECIO_CONSUMO_E;
                break;
            case "F":
                precioFinal += PRECIO_CONSUMO_F;
                break;
        }

        if (peso <= 19) {
            precioFinal += PRECIO_PESO_0_19KG;
        } else if (peso <= 49) {
            precioFinal += PRECIO_PESO_20_49KG;
        } else if (peso <= 79) {
            precioFinal += PRECIO_PESO_50_79KG;
        } else {
            precioFinal += PRECIO_PESO_MAYOR_80KG;
        }

        return precioFinal;
    }
}
