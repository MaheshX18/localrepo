package OOPS;

class Human
{
  private int age = 118;
  private String name = "Mahesh";


  public Human() {
  }
  
  public Human(int age, String name) {
    this.age = age;
    this.name = name;
  }
  

  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  

  // public int getAge()
  // {
  //   return age;
  // }

  // public String getName()
  // {
  //   return name;
  // }

  // public void setAge(int a)
  // {
  //   age = a;
  // }
  // public void setName(String n)
  // {
  //   name = n;
  // }
}
public class Encapsulation
{
  public static void main(String[] args) {
    
    Human obj = new Human();
    Human obj1 = new Human();

    // obj.age = 19;
    // obj.name = "Doron";

    System.out.println(obj.getAge()+" "+obj.getName());

    obj.setAge(12);
    obj.setName("Doron");


    System.out.println(obj.getAge()+" "+obj.getName());
  }


}
