public class Light_Tank extends ToppingDecorator{
    public Light_Tank(ITank new_Tank) {
        super(new_Tank);
    }

    public String getDescription() {
        return tempTank.getDescription()+" Felderiteni, Tamogatni";
    }

    public int getCost() {
        return tempTank.getCost() + 20000;
    }
}
