import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tank_Factory factory = new Tank_Factory();

        Tank an_Tank = null;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Milyen tankot szeretnel? (H / L)");

        if (userInput.hasNextLine()){
            String type_Of_Tank = userInput.nextLine();

            an_Tank = factory.make_Tank(type_Of_Tank);
        }

        if (an_Tank != null){
            doStuff(an_Tank);
        }
        else System.out.println("Nem megfelelo adat!");
    }

    public static void doStuff(Tank an_Tank){
        an_Tank.Tank_Description();
    }
}