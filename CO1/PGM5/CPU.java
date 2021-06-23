import java.util.Scanner;
class CPU {
    double price = 15000;

    class Processor{
        double cores = 2;
        String manufacturer = "intel";

    }

    static class RAM{

        double memory = 4;
        String manufacturer = " micron";
        
    }


    public static void main(String[] args) {

        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        RAM ram = new RAM();

        System.out.println("\nprice of cpu :" + cpu.price);
         System.out.println("\nno: cores :" + processor.cores);
         System.out.println("\nmanufacturer of processor: " + processor.manufacturer);
        System.out.println("\nmemory space of RAM :" + ram.memory + "gb");
        System.out.println("\nmanufacturer of RAM :" + ram.manufacturer );
    }
}
