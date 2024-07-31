public class Jet implements IVisitable{
        private double price;

        Jet(double item){
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
