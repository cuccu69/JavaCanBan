package Day08;

public class Gate {
    private String name;
    private int distanceFromPreviousGate;

    public Gate(String name, int distanceFromPreviousGate){
        this.name = name;
        this.distanceFromPreviousGate = distanceFromPreviousGate;
    }

    public void enter(Ticket ticket){

    }

    public void exit(Ticket ticket){

    }

    public void open(){
        System.out.println("Gate " + name + " is opened");
    }

    public void close(){
        System.out.println("Gate " + name + " is closed");
    }
}
