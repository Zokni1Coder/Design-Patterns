public interface IDamage {
    int Damage();
}

class MachineGun implements  IDamage{

    @Override
    public int Damage() {
        return 55;
    }

}

class Cannon implements  IDamage{

    @Override
    public int Damage() {
        return 450;
    }

}

class MissileLauncher implements  IDamage{

    @Override
    public int Damage() {
        return 750;
    }

}
