public class Test {
    public static void main(String[] args) {
        CPU cpu =new CPU();
        cpu.setSpeed(114514);
        cpu.brand="英o尔";
        HardDisk disk=new HardDisk();
        disk.setAmount(514);
        disk.brand="花Q";
        PC pc=new PC();
        pc.setCPU(cpu);
        pc.setHardDisk(disk);
        pc.show();
    }
}
