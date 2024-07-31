public abstract class Tank {
    private String name;
    private int damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void Tank_Description(){
        System.out.println("A tank neve: "+ getName() + ", sebzese: " + getDamage());
    }
}
