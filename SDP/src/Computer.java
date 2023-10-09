// This is the superclass of both PC and Server classes.
//It declares three abstract methods: getRAM(), getHDD(), and getCPU().
//It also overrides the toString() method to provide a formatted string representation of the computer's specifications.
public abstract class Computer {

    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}