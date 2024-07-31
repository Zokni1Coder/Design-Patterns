public class Armored_Car extends Tank{

    String wheel = "Kereke van.";
    String turret = "Tornya van.";
    String name = "Pancelozott auto:";
    boolean not_Armored_Car(){
        return false;
    }

    @Override
    void addName() {
        System.out.println(name);
    }

    @Override
    void addWheel() {
        System.out.println(wheel);
    }

    @Override
    void addTrack() {
    }

    @Override
    void addTurret() {
        System.out.println(turret);
    }

}
