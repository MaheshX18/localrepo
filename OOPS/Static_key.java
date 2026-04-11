package OOPS;

class Mobile
{

  String brand;
  int price;
  static String name;

  static
  {
    name = "phone";
  }

  // public void show()
  // {
  //   System.out.println(brand+" : "+price+" : "+ name);
  // }

  public Mobile()
  {
    brand = "";
    price = 200;
  }
}
public class Static_key
{
  /**
   * @param args
   */
  public static void main(String[] args) throws ClassNotFoundException
  {

     Class.forName("Mobile");
    // Mobile obj1 = new Mobile();
    // obj1.brand = "Apple";
    // obj1.price = 1000;
    // Mobile.name = "SmartPhone";

    // Mobile obj2 = new Mobile();
    // obj2.brand = "Samsung";
    // obj2.price = 1700;
    // Mobile.name = "SmartPhone";

    // Mobile.name = "Phone";
    
    // obj1.show();
    // obj2.show();
  }

  public Static_key() {
  }
}
