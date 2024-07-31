public class Armored_Car_Adapter implements ITank{

    Armored_Car armoredCar;

    public Armored_Car_Adapter(Armored_Car newAC){
        armoredCar = newAC;
    }

    @Override
    public void Shot() {
        armoredCar.Burst();
    }

    @Override
    public void Move() {
        armoredCar.Roll();
    }
}
