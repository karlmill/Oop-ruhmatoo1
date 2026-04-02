import java.util.Random;

public class Planeet {
    private Kosmoselaev kosmoselaev;
    private String nimetus;
    private double baashind;

    public Planeet(Kosmoselaev kosmoselaev, String nimetus, double baashind) {
        this.kosmoselaev = kosmoselaev;
        this.nimetus = nimetus;
        this.baashind = baashind;
    }

    // Meetod, mis genereerib hinnad lähtuvalt kauba baashinnast
    public void genereerihind_müü() {
        Random r = new Random();
        // Hind on baashind +/- 30% random kõikumist
        double koefitsient = 0.7 + (1.3 - 0.7) * r.nextDouble();
        double turuhind = baashind * koefitsient;
        double summa = turuhind * kosmoselaev.getLast();
        System.out.println("Lati eest saab " + summa + " kuldmünti.");
        kosmoselaev.setLast(0);
        kosmoselaev.setRaha(kosmoselaev.getRaha() + summa);
        System.out.println("Last müüdud ja teel koju.");
    }

}