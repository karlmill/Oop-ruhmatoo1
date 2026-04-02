import java.util.Random;
import java.util.Scanner;

public class teePlaneedile extends Kosmoselaev {

    public teePlaneedile(double last, double kütusePaak, double kütus, double raha) {
        super(last, kütusePaak, kütus, raha);
    }

    public String Takistus(){
        Random random = new Random();
        int number = random.nextInt(3) + 1;

        if (number == 1) {
            System.out.println("Appi! Piraadid ründavad");
            return "Piraat";
        } else if (number == 2) {
            System.out.println("Appi! Meteorriidi sadu");
            return "Meteoriit";
        }else{
            System.out.println("Taksistued puuduvad.");
            return "Rahulik";
        }
        }

    public void Piraadid() {
        System.out.println("Värise koer!");
        System.out.println("Me küsime 3 küsimust, kui suudad neile õigesti vastata, ei röövi me sind paljaks.");
        int mitu = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kuidas arvutatakse latentsi?");
        String vastus = scanner.nextLine();
        if (vastus.equals("Küsi Urmaselt")) {
            mitu++;
        }
        System.out.println("Mis värvi on tuletõrje auto?");
        String vastus1 = scanner.nextLine();
        if (vastus1.toLowerCase().equals("punane")) {
            mitu++;
        }
        System.out.println("Mitu tähte on Eesti tähestikus?");
        String vastus2 = scanner.nextLine();
        if (vastus2.equals("32")) {
            mitu++;
        }
        if (mitu >= 2) {
            System.out.println("Vatasid piisavalt õigesti, me sind paljaks ei röövi.");
            vähendaLasti(4);
        } else {
            System.out.println("Vatasid halvasti, nüüd me röövime sind.");
            vähendaLasti(10);
        }
    }
    public void Meteoriidid() {
        System.out.println("Meteoriidi sadu, valik on sinu. 1) sõidad läbi, 2) ootad");
        Scanner scanner = new Scanner(System.in);
        int valik = scanner.nextInt();
        if (valik == 1) {
            System.out.println("Gaasi....");
            System.out.println("Laev rapub ja kütust kulub, vasakus tiivas mõlk sees.");
            vähendaKütust(3);
        } else if (valik == 2) {
            System.out.println("Ootad, laev jääb terveks, aga kütsi ikka kulub.");
            vähendaKütust(2);
            System.out.println("Sadu läbi sõida edasi.");

        }
    }
    public void Sõit(String a){
        if (a.equals("Kuu")) {
            setKütus(getKütus() - 4);
            System.out.println("Jõudsid Kuule!");
            System.out.println("Nimeta kauba nimetus: ");
            Scanner scanner = new Scanner(System.in);
            String nimetus = scanner.nextLine();
            System.out.println("Sisesta kauba baashind: ");
            double baashind = scanner.nextDouble();
            Planeet planeet = new Planeet(this, nimetus, baashind);
            planeet.genereerihind_müü();
        }
        if (a.equals("Jupiter")) {
            setKütus(getKütus()-12);
            System.out.println("Jõudsid Jupiterile!");
            Kaup kaup = new Kaup("Jupiter", 14);
            System.out.println("Nimeta kauba nimetus: ");
            Scanner scanner = new Scanner(System.in);
            String nimetus = scanner.nextLine();
            System.out.println("Sisesta kauba baashind: ");
            double baashind = scanner.nextDouble();
            Planeet planeet = new Planeet(this, nimetus, baashind);
            planeet.genereerihind_müü();
        }
    }
}
