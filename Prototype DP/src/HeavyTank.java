public class HeavyTank implements Tank{

    public HeavyTank(){
        System.out.println("Nehez tank letrehozva");
    }

    @Override
    public Tank makCopy() {
        System.out.println("Nehez tank keszul");

        HeavyTank heavyTank = null;

        try {
            heavyTank = (HeavyTank) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return heavyTank;
    }

    public String toString(){
        return "Ez egy nehez tank";
    }
}
