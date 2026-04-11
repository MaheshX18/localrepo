package OOPS;

public class Inheritance 
{
  public static void main(String[] args) {
    AdvCalc obj = new AdvCalc();
    int r1 = obj.add(4, 5);
    int r2 = obj.multi(6, 3);
    int r3 = obj.div(6, 3);

    System.out.println(r1+" "+r2);
    System.out.println(r3);
  }
}
