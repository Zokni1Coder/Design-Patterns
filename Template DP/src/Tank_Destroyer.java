public class Tank_Destroyer extends Tank{
    String track = "Lanctalpa van";
    String name = "Pancel vadasz:";

    boolean not_TD(){
        return false;
    }

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
    }
}
