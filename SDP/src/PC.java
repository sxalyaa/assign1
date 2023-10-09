// Extends the Computer class, which means it must implement the abstract methods (getRAM(), getHDD(), and getCPU()).
//It has three private member variables: ram, hdd, and cpu.
//The constructor initializes these member variables.
public class PC extends Computer {
    private String ram;
    private String hdd;
    private String cpu;

    public PC(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }
    @Override
    public String getHDD() {
        return this.hdd;
    }
    @Override
    public String getCPU() {
        return this.cpu;
    }
}