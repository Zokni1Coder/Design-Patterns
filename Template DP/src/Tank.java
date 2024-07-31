public abstract class Tank {

    final void buildTank(){
        addName();
        addGun();

        addTurret();


        if (not_Armored_Car()){

            addTrack();
        }else {
            addWheel();
        }
        addEngine();
        System.out.println();
    }

    abstract void addName();

    abstract void addWheel();

    boolean not_Armored_Car(){
        return true;
    }

    abstract void addTrack();
    public void addGun(){
        System.out.println("Van agyuja.");
    }

    abstract void addTurret();

    boolean not_TD(){
        return true;
    }

    public void addEngine(){
        System.out.println("Van motorja.");
    }
}
