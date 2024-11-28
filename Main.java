public class Main {
    public static void main(String[] args) {

        Lavadora lavadoraAEG = new Lavadora(400, Color.PLATEADO, "A", 30, 7);
        System.out.println(lavadoraAEG);
        System.out.println("Precio final: " + lavadoraAEG.precioFinal() + "€\n");

        Television tvSamsung = new Television(100, Color.BLANCO, "A", 10);
        System.out.println(tvSamsung);
    }
}
