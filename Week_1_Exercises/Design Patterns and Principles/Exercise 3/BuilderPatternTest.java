public class BuilderPatternTest {
    public static void main(String[] args) {
        
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i3")
                .setRAM("4GB")
                .setStorage("500GB")
                .build();

        System.out.println("Basic Computer Configuration:");
        System.out.println("CPU: " + basicComputer.getCPU());
        System.out.println("RAM: " + basicComputer.getRAM());
        System.out.println("Storage: " + basicComputer.getStorage());
        System.out.println("Has Graphics Card: " + basicComputer.hasGraphicsCard());

        Computer advancedComputer = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("1TB")
                .setGraphicsCard(true)
                .build();

        System.out.println("\nAdvanced Computer Configuration:");
        System.out.println("CPU: " + advancedComputer.getCPU());
        System.out.println("RAM: " + advancedComputer.getRAM());
        System.out.println("Storage: " + advancedComputer.getStorage());
        System.out.println("Has Graphics Card: " + advancedComputer.hasGraphicsCard());
    }
}
