public interface Appliance {
    void turnOn();
    void turnOff();
}
class Light implements Appliance{
    @Override
   public void turnOn(){
        System.out.println("light is on");
    }
    @Override
    public void turnOff(){
        System.out.println("light is off");
    }
}
class Fan implements Appliance{
    @Override
    public void turnOn(){
        System.out.println("Fan is on");
    }
    @Override
    public void turnOff(){
        System.out.println("Fan is off");
    }
}
class Airconditioner implements Appliance{
    @Override
    public void turnOn(){
        System.out.println("Airconditoner is on");
    }
    @Override
    public void turnOff(){
        System.out.println("Airconditioner is off");
    }
}
class ApplianceControlSystem {
    public static void main(String[] args) {
        Appliance[] a = new Appliance[3];
        a[0]=new Light();
        a[1]=new Fan();
        a[2]=new Airconditioner();
        for (Appliance appliance : a)
        {
            appliance.turnOn();
            appliance.turnOff();
        }
    }
}

