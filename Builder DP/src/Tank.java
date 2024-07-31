public class Tank implements ITankPlan{

    private String tankTurret;
    private String tankMotor;
    private String tankGun;

    @Override
    public void setTankTurret(String turret) {
        tankTurret = turret;
    }

    public String getTankTurret(){
        return tankTurret;
    }

    @Override
    public void setTankMotor(String motor) {
        tankMotor = motor;
    }

    public String getTankMotor(){
        return tankMotor;
    }
    @Override
    public void setTankGun(String gun) {
        tankGun = gun;
    }
    public String getTankGun(){
        return tankGun;
    }
}
