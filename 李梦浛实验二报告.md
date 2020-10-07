# Javashiyan
第一次上机实验
## 一、实验目的：
### (1) 用类描述计算机中CPU的速度和硬盘的容量。要求Java应用程序有4个类，名字分别是PC、CPU、HardDisk和Test，其中Test是主类。
### (2) 掌握构造方法和对象的创建
### (3) 了解类与程序的基本结构
### (4) 理解类的封装
## 二、实验要求：
### (1) CPU类：要求getSpeed()返回speed的值，用setSpeed(int m)方法将参数m的值赋值给speed
### (2) HardDisk类：要求getAmount()返回amount的值，用setAmount(int m)方法将参数m的值赋值给amount
### (3) PC类：要求setCPU(CPU c)将参数c的值赋值给cpu,用setHardDisk(HardDisk h)方法将参数h的值赋值给HD，用show()方法显示cpu的速度和硬盘的容量
### (4) Test主类：
### main方法中创建CPU对象cpu，cpu 将自己的 speed 设置为2200
### main方法中创建HardDisk对象disk，disk将自己的 amount 设置为200
### main方法中创建PC对象pc
### pc调用setCPU(CPU c)方法，调用实参是cpu
### pc调用setHardDisk(HardDisk h)方法，调用实参是disk
### pc调用show()方法
## 附加内容：
### (1) 类中定义不少于两个构造方法
### (2) 每个类定义不少于2个属性，且属性的类型应该多样化
### (3) 根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断
### (4) 尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法
## 三、实验方法：
### 1.首先创建PC、CPU、HardDisk、Test 4个类按照要求分别再每个类里写入代码
### 2.通过private把类中的需要输出的对象封装起来，起到保护作用
### 3.然后每个类中使用两个构造方法来给类中变量进行初始化赋值
### 4.因为使用了private封装所以Test主类中使用set赋值
### 5.最后在输出语句中使用get将赋值过的变量输出出来
## 四、核心方法
### 这段代码主要是跟HardDisk中amount有关的代码，体现了类定义的属性，之中也使用到了this关键字和if判断语句等。
```java
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
```

### 五、实验结果
详情请见插图（滑稽）
![1.png](https://github.com/Alpaca514/Javashiyan/blob/main/1.png)

### 六、实验感想
### 学到了修饰符private用法，明白了private可以提高安全性，实现了数据封装的思想。同时也基本能够完成一些Java简单程序的代码，在同学的帮助下解决了这次实验。总体来讲这次实验是我对java充满了决心。
