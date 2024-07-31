public class Tank {
    private String name;

    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public IDamage typeOfDamage;

    public int damage(){
        return typeOfDamage.Damage();
    }

    public void setTypeOfDamage(IDamage newDamageType){
        typeOfDamage = newDamageType;
    }

}


