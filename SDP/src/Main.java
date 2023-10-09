// Contains the main() method.
//Inside main(), it uses the ComputerFactory to create instances of PC and Server.
//It then prints out the configurations of both the PC and Server using System.out.println().
public class Main {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        // it gets values like type, ram, hdd and cpu(it creates computer by computerfactory class)
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        // it gets values like type, ram, hdd and cpu(it creates computer by computerfactory class)
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
    }
}