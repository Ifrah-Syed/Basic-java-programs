import java.util.Scanner;

class matrix{
    public static void main(String arg[]){
        int m, n, p, q, sum = 0, c, d, k;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no. of rows and columns of first matrix");
        m = s.nextInt();
        n = s.nextInt();
        int matrix1[][] = new int[m][n];
 
      System.out.print("Enter elements of first matrix");
 
      for (c = 0; c < m; c++)
         for (d = 0; d < n; d++)
            matrix1[c][d] = s.nextInt();


      System.out.print("Enter the number of rows and columns of second matrix");
            p = s.nextInt();
            q = s.nextInt();

            
        if (n != p)
                  System.out.print("The matrices can't be multiplied with each other.");
               else
               {
                  int matrix2[][] = new int[p][q];
                  int product[][] = new int[m][q];
          
                  System.out.print("Enter elements of second matrix");
          
                  for (c = 0; c < p; c++)
                     for (d = 0; d < q; d++)
                        matrix2[c][d] = s.nextInt();
          
                  for (c = 0; c < m; c++)
                  {
                     for (d = 0; d < q; d++)
                     {  
                        for (k = 0; k < p; k++)
                        {
                           sum = sum + matrix1[c][k]*matrix2[k][d];
                        }
                        product[c][d] = sum;
                  sum = 0;
                  }
         }
 
         System.out.print("Product of the matrices:");
 
         for (c = 0; c < m; c++)
         {
            for (d = 0; d < q; d++)
               System.out.print(product[c][d]+"\t");
 
            System.out.print("\n");
         }
      }
 }
}

    
