package Test;

public  class people {
    int number;
    String name;
    String sex;
    people() {
    }
    people(int number, String name, String sex) {
        this.number = number;
        this.name = name;
        this.sex = sex;
    }
    public int number() {
        return number;
    }
    public void number(int number) {
        this.number = number;
    }
    public String name() {
        return name;
    }
    public void name(String name) {
        this.name = name;
    }
    public String sex() {
        return sex;
    }
    public void sex(String sex) {
        this.sex = sex;
    }
}
