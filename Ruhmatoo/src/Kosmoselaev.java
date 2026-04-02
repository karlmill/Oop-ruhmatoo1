import java.util.Random;
import java.util.Scanner;

public class Kosmoselaev {

    private double last;
    private double kütusePaak;
    private double kütus;
    private double raha;

    public Kosmoselaev(double last, double kütusePaak, double kütus, double raha) {
        this.last = last;
        this.kütusePaak = kütusePaak;
        this.kütus = kütus;
        this.raha = raha;
    }

    public double getRaha() {
        return raha;
    }

    public void setRaha(double raha) {
        this.raha = raha;
    }

    public double getKütus() {
        return kütus;
    }

    public void setKütus(double kütus) {
        this.kütus = kütus;
    }

    public double getLast() {
        return last;
    }

    public void setLast(double last) {
        this.last = last;
    }

    public double getKütusePaak() {
        return kütusePaak;
    }

    public void setKütusePaak(double kütusePaak) {
        this.kütusePaak = kütusePaak;
    }

    public void suurendaLasti(int kogus){
        if (kogus <= raha) {
            this.setLast(this.getLast() + kogus);
            this.setRaha(this.getRaha() - kogus);
        }else {
            System.out.println("Sul pole piisavalt raha, et nii palju lasti osta.");
        }
    }
    public void suurendaPaaki(){
        this.setKütusePaak(this.kütusePaak + this.kütusePaak*0.10);
    }
    public void vähendaLasti( int n) {this.setLast(this.last - (this.last * (n / 10)));}
    public void vähendaKütust(int a) {this.setKütusePaak(this.kütusePaak - a);}

    public void Tangi(){
        double vaba_ruum = kütusePaak - kütus;
        Random random = new Random();
        int number = random.nextInt(2) + 1;
        System.out.println("Paagis ruumi on " + vaba_ruum);
        while (true) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta palju tahad tankida: ");
        int kogus = scanner.nextInt();
        if (kogus > vaba_ruum) {
            System.out.println("Ei saa nii palju tankida");
        } else {
            this.setKütus(kütus+kogus);
            this.setRaha(raha-(number*kogus));
            System.out.println("Tangitud");
            break;
    }}}

    @Override
    public String toString() {
        return "Kosmuselaev{" +
                "last=" + last +
                ", kütusePaak=" + kütusePaak +
                ", kütus=" + kütus +
                ", raha=" + raha +
                '}';
    }
}
