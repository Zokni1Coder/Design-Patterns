import java.util.Random;

public class Tank_Destroyer implements ITank{

    @Override
    public void Shot() {
        System.out.println("BUMMM");
    }

    @Override
    public void Move() {
        System.out.println("Nyik-nyik-nyik");
    }
}
