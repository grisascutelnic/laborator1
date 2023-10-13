public class Ceasca {
    private String forma;
    private String culoare;
    private String material;
    private double volumL;
    private boolean toarta;

    Ceasca (String forma, String culoare, String material, double volumL, boolean toarta) {
        this.forma = forma;
        this.culoare = culoare;
        this.material = material;
        this.volumL = volumL;
        this.toarta = toarta;
    }

    public void afis() {
        System.out.println("Forma: " + forma);
        System.out.println("Culoarea: " + culoare);
        System.out.println("Meterialul: " + material);
        System.out.println("Volumul: " + volumL);
        System.out.println("Toarta: " + toarta);
    }

    @Override
    public String toString() {
        return "Ceasca:{ \n" +
                "Forma: " + forma + "\n" +
                "Culoarea: " + culoare + "\n" +
                "Materialul: " + material + "\n" +
                "Volumul: " + volumL + "\n" +
                "Toarta: " + toarta + "}";
    }
}
