public class Helicopter implements IVisitable{
    private double price;

    Helicopter(double item){
        price=item;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(IVisitor visitor) {
        return visitor.visit(this);
    }
}
