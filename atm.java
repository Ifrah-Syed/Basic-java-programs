import java.util.Scanner;

class operation{
    public void showBalance(int balance){
        System.out.print("Your current balance is\t" + balance);
    }
    public int deposit(int sum){
        balance=balance+sum;
        System.out.print("Current balance after depositing the amount is\t" + balance);
        return balance;
    }
    public int withdrawal(int sum,int balance){
        balance=balance-sum;
        System.out.print("Current balance after withdrawing the amount is\t" + balance);
        return balance;
    }
}

class atm{
    public static void main(String arg[]){
        int balance=1000;
        int m;
        do
        {
            System.out.print("\nEnter your choice - \n 1 for withdrawal \n 2 for deposit \n 3 for balance \n 4 for exit\n");
            Scanner s=new Scanner(System.in);
            m = s.nextInt();
            operation o=new operation();
            if(m==1){
            System.out.print("Enter amount to withdraw\t");
            int p= s.nextInt();
            balance=o.withdrawal(p,balance);
            }
            if(m==2){
            System.out.print("Enter amount to deposit\t");
            int q=s.nextInt();
            balance=o.deposit(q,balance);
            }
            if(m==3)
            o.showBalance(balance);

        }
        while(m!=4);

    
        System.out.print("process ended");
    }
}
