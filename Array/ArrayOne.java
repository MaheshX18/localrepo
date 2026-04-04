package Array;
class Student
{
  int rollNo;
  String name;
  int marks;
}
public record ArrayOne()
{
  public static void main(String[] args)
  {
    Student s1 = new Student();
    s1.rollNo = 3;
    s1.marks = 99;
    s1.name = "Mahesh";

    Student s2 = new Student();
    s2.rollNo = 24;
    s2.marks = 100;
    s2.name = "Hemanshu";

    Student s3 = new Student();
    s3.rollNo = 18;
    s3.marks = 85;
    s3.name = "Ajinkya";

    Student students[] = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    // for(int i = 0; i < students.length; i++)
    // {
    //   System.out.println(students[i].name + ":"+ students[i].marks);
    // }


    for(Student stud : students)
    {
      System.out.println(stud.name+" : "+ stud.marks);
    }

    // int nums[] = new int[4];
    // nums[0] = 4;
    // nums[1] = 2;
    // nums[2] = 9;
    // nums[3] = 9;

    // for(int n : nums)
    // {
    //   System.out.println(n);
    // }




    // int num[][] = new int[3][]; //Jagged Array

    // num[0] = new int[3];
    // num[1] = new int[4];
    // num[2] = new int[2];
    

    // for(int i = 0; i < num.length; i++)
    // {

    //   for(int j = 0; j < num[i].length; j++)
    //   {
    //     num[i][j] = (int)(Math.random()*10);
    //   }
    // }

    // for(int n[] : num)
    // {
    //   for(int m : n)
    //   {
    //     System.err.print(m+" ");
    //   }
    //   System.err.println();
    // }
  }
}
