
class Computer
{
  public void playMusic()
  {
    System.out.println("Music is playing");
  }

  public String getMePen(int cost)
  {
    return "Pen";
  }
}

public class Demo
{
  public static void main(String args[])
  {
  Computer obj = new Computer();

  obj.playMusic();
  String str = obj.getMePen(0);

  }
}