public class HardDisk {
    private int amount;
    String brand;
    private int num;
    int getAmount(){
        return amount;
    }
    String getBrand(){
        return brand;
    }
    int getNum(){
        return num;
    }
    public void setAmount(int amount){
        if(amount>1&&amount<1145141918) {
            this.amount=amount;
        }
    }
}
