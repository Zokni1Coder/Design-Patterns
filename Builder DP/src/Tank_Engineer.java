public class Tank_Engineer {

    private Tank_Builder tankBuilder;

    public Tank_Engineer(Tank_Builder tankBuilder){
        this.tankBuilder = tankBuilder;
    }

    public  Tank getTank(){
        return this.tankBuilder.getTank();
    }

    public void makeTank(){
        this.tankBuilder.buildTankTurret();
        this.tankBuilder.buildTankMotor();
        this.tankBuilder.buildTankGun();
    }
}
