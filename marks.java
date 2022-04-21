//using array of objects
import java.util.Scanner;
class Student
{
   Scanner s=new Scanner(System.in);
   int RegNo,Total=0,subjects;
   String name;
   int marks[];
   Student()
   {
      System.out.print("Enter roll No. of student: ");
      RegNo=s.nextInt();
      System.out.print("Enter Student's Name: ");
      name=s.next();;
      qualify();
   }
   public void qualify()
   {
       marks=new int[6];
       System.out.print("Enter marks of AI: ");
       marks[0]=s.nextInt();
       System.out.print("Enter marks of Java: ");
       marks[1]=s.nextInt();
       System.out.print("Enter marks of Big Data: ");
       marks[2]=s.nextInt();
       System.out.print("Enter marks of MIS: ");
       marks[3]=s.nextInt();
       System.out.print("Enter marks of Networks: ");
       marks[4]=s.nextInt();
       System.out.print("Enter marks of Graphics: ");
       marks[5]=s.nextInt();
       int count=0;
       for(int i=0;i<6;i++)
       {
          if(marks[i]<33){
              count++;
          }
       }
       if(count==2)
         System.out.print("Student has supply\n");
       else if(count>2)
         System.out.print("Student has failed\n");
       else
       System.out.print("Student has passed\n");

   }

}

class marks
{
    public static void main(String args[])
    {
        Student s[]=new Student[10];
        for(int i=0;i<10;i++)
              s[i]=new Student();
     }

}


