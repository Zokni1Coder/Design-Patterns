public class HeavyTank extends Tank{

    String turret = "Van tornya.";
    String track = "Lanctalpa van";
    String name = "Nehez harckocsi:";

    @Override
    void addName() {
        System.out.println(name);
    }

    @Override
    void addWheel() {
    }

    @Override
    void addTrack() {
        System.out.println(track);
    }

    @Override
    void addTurret() {
        System.out.println(turret);
    }
}
