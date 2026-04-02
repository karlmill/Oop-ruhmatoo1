import java.util.Scanner;

public class Peaklass {

    static void main(String[] args){
        System.out.println("Tere! Oled kosmosekaupmees ja pead lasti planeetide vahel vedama. \n Selle jaoks on sul kosmoselaev.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistesta oma laeva last: ");
        double last = scanner.nextDouble();
        System.out.println("Sisesta oma laeva kütusepaagi ruurus: ");
        double kütuseSuurus = scanner.nextDouble();
        System.out.println("Sisesta oma leva kütuse kogus: ");
        double kütuseKogus = scanner.nextDouble();
        System.out.println("Sisesta, kui palju sul raha on: ");
        double raha = scanner.nextDouble();
        teePlaneedile kosmoselaev = new teePlaneedile(last, kütuseSuurus, kütuseKogus, raha);
        while (true) {
            System.out.println("Vali sobiv tegevus:" + "\n1) Vaata kosmoselaeva detaile. " + "\n2) Tangi" + "\n3) Hakka müüma lendama" + "\n4) Lisa lasti endale");
             int valik = scanner.nextInt();
             scanner.nextLine();
             if (valik == 1) {
                 System.out.println(kosmoselaev.toString());
             }
             if (valik == 2) {
                 kosmoselaev.Tangi();
             }
             if (valik == 3) {

                 System.out.println("Millisele planeedile minna soovid?" + "\n1) Kuu" + "\n2) Jupiter");
                 String planeet = scanner.nextLine();


                 String appi = kosmoselaev.Takistus();
                 if (appi.equals("Piraat")) {
                     kosmoselaev.Piraadid();
                 } else if (appi.equals("Meteoriit")) {
                     kosmoselaev.Meteoriidid();
                 }
                 kosmoselaev.Sõit(planeet);
             }
             if (valik == 4) {
                 System.out.println("Sisesta, kui palju sa tahad lasti endale peale osta.");
                 int kogus = scanner.nextInt();
                 kosmoselaev.suurendaLasti(kogus);
             }
        }
    }
}