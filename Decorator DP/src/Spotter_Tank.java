public class Spotter_Tank extends ToppingDecorator{

    public Spotter_Tank(ITank new_Tank) {
        super(new_Tank);
    }

    public String getDescription() {
        return tempTank.getDescription()+"Felderiteni ";
    }

    public int getCost() {
        return tempTank.getCost() + 10000;
    }
}
