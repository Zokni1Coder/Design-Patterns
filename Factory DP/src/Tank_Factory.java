public class Tank_Factory {

    public Tank make_Tank(String new_Tank_Type){

        Tank new_Tank = null;

        if (new_Tank_Type.equals("H")){
            return new HeavyTank();
        }
        else
            if (new_Tank_Type.equals("L")){
                return new LightTank();
            }
        return null;
    }
}
