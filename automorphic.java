import java.util.Scanner;

class isAutomorphic{
public void checkAuto(int n){
    int m=n*n;
    bool x=true;
    while(n>0)
    {
    if(m%10!=n%10)
      {
          x=false;
      }
        m=m/10;
        n=n/10;
     
   }
   System.out.print( (x) ? "Automorphic" : "Not Automorphic");
}
}
    

class automorphic{
public static void main(String arg[]){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no. to check");
        n=s.nextInt();
        isAutomorphic A = new isAutomorphic();
        A.checkAuto(n);
    }
}
