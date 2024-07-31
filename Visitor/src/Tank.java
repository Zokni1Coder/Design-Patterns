public class Tank implements IVisitable{

    private double price;

    Tank(double item){
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
