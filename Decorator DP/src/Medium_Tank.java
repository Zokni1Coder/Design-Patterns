public class Medium_Tank extends ToppingDecorator{

    public Medium_Tank(ITank new_Tank) {
        super(new_Tank);
    }

    public String getDescription() {
        return tempTank.getDescription()+" Felderiteni, Tamogatni, Tamadni, Vedekezni";
    }

    public int getCost() {
        return tempTank.getCost() + 30000;
    }
}
