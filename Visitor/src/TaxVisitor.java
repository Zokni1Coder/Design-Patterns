import java.text.DecimalFormat;

public class TaxVisitor implements IVisitor{

    DecimalFormat df = new DecimalFormat("#,##");

    public TaxVisitor(){

    }

    public double visit(Tank tankItem) {
        System.out.println("Napi koltseg egy tankra: ");
        return Double.parseDouble(df.format((tankItem.getPrice() * .18) + tankItem.getPrice()));
    }

    @Override
    public double visit(Jet tobaccoItem) {
        System.out.println("Napi koltseg egy repulore: ");
        return Double.parseDouble(df.format((tobaccoItem.getPrice() * .32) + tobaccoItem.getPrice()));
    }

    @Override
    public double visit(Helicopter helicopterItem) {
        System.out.println("Napi koltseg egy helikopterre: ");
        return Double.parseDouble(df.format((helicopterItem.getPrice() * 0) + helicopterItem.getPrice()));
    }
}
