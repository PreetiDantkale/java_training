//bank.java
import java.util.*;

//OOPs concept - 1 class
abstract class Bank{

  //OOPs concept - 5 Encapsulation
  int bal;
  private int acc_num=123;

  public void setData(){
    bal = 10000;
  }

  public void showData(){
    System.out.println("Account Number="+acc_num);
    System.out.println("Balance="+bal);
  }

  //OOPs concept - 4 Abstraction
  abstract void deposit(int amount);
}

//OOPs concept - 6 Inheritance
class MyAccount extends Bank {

  //OOPs concept - 7 Polymorphism overriding
  @Override void deposit(int amount){
    bal = bal + amount;
  }

  private void withdraw(int amount){
    bal = bal - amount;
  }

  public static void main(String[] args){

    //OOPs concept - 2 Object
    MyAccount ma = new MyAccount();

    //OOPs concept - 3 Message passing
    ma.setData();
    ma.showData();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter amount to deposit:");
    int bal = sc.nextInt();
    ma.deposit(bal);
    ma.showData();
  }
}