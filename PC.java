public class PC {
    CPU cpu;
    HardDisk disk;
    void setCPU(CPU cpu){
        this.cpu=cpu;
    }
    void setHardDisk(HardDisk disk){
        this.disk=disk;
    }
    void show(){
        System.out.println("CPU品牌："+cpu.getBrand());
        System.out.println("CPU速度："+cpu.getSpeed());
        System.out.println("硬盘品牌："+disk.getBrand());
        System.out.println("硬盘容量："+disk.getAmount());
    }
}