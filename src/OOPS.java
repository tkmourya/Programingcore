public interface OOPS {
    void giveLoan();
    void openAccount();
   String currency="INR";

}
class SBI implements OOPS{
    public String m(){
        return currency;
    }

    @Override
    public void giveLoan() {
        System.out.println("Give Lone rate of 8%");

    }

    @Override
    public void openAccount() {
        System.out.println("Open saving account with minimum balance 500");
    }
    public void o(){
        System.out.println("oooo");
    }
}
class PNB implements OOPS{

    @Override
    public void giveLoan() {
        System.out.println("Give Lone rate of 8.5%");
    }

    @Override
    public void openAccount() {
        System.out.println("Open saving account with minimum balance 1000");
    }
}
class Customer {
    int accountNo;
  String name;
  int age;
  String place;
  Customer(int accountNo,String name, int age,String place){
      this.accountNo=accountNo;
      this.name=name;
      this.age=age;
      this.place=place;
  }
  public int getAccountNo(){
      return this.accountNo;
  }
  public String getName(){
      return this.name;
  }
  public int getAge(){
      return this.age;
  }
  public String getPlace(){
      return this.place;
  }

}
abstract class App implements OOPS {
    public static void main(String[] args) {
        SBI s = new SBI();
        PNB p = new PNB();
        calling(s);
        calling(p);
//        s.o();


    }
    public static void calling(OOPS op){
        op.giveLoan();
        op.openAccount();

    }
}