// Contains a static method getComputer() which acts as the factory method.
//It takes in parameters: type, ram, hdd, and cpu.
//Based on the type parameter (either "PC" or "Server"), it creates an instance of the respective class (PC or Server) and returns it.
public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String
            hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram,
                hdd, cpu);

        return null;
    }
}