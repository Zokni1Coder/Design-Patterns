abstract class ToppingDecorator implements ITank{

    protected ITank tempTank;

    public ToppingDecorator(ITank new_Tank){
        tempTank = new_Tank;
    }

    public String getDescription(){
        return tempTank.getDescription();
    }

    public int getCost(){
        return tempTank.getCost();
    }

}
