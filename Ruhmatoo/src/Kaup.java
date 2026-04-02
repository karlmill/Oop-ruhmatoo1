public class Kaup {
    private String nimetus;
    private double baashind; // Hind, mille ümber turg kõigub

    public Kaup(String nimetus, double baashind) {
        this.nimetus = nimetus;
        this.baashind = baashind;
    }

    public String getNimetus() {
        return nimetus;
    }
    public double getBaashind() {
        return baashind;
    }
}