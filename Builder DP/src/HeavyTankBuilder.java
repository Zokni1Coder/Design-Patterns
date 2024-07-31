public class HeavyTankBuilder implements  Tank_Builder{

    private Tank tank;
    public HeavyTankBuilder(){
        this.tank = new Tank();
    }
    @Override
    public void buildTankTurret() {
        tank.setTankTurret("Henschel");
    }

    @Override
    public void buildTankMotor() {
        tank.setTankMotor("Maybach");
    }

    @Override
    public void buildTankGun() {
        tank.setTankGun("8.8 cm Flak");
    }

    @Override
    public Tank getTank() {
        return this.tank;
    }
}
