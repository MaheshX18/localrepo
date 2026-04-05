
public class String_as_class
{
  public static void main(String[] args) {
    String name = new String("Mahesh");
    System.out.println(name);
    System.out.println(name +", Hello");
    System.out.println(name.charAt(3));
    System.out.println(name.concat("(Doron)"));
    System.out.println(name.hashCode());
  }
}