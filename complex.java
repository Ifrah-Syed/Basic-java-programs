import java.util.Scanner;
class complex{
	int real, image;
	public complex(int r, int i)
	{
		this.real = r;
		this.image = i;
    }
	public void showC()
	{
		System.out.print(this.real + " +i" + this.image);
	}
	public static complex add(complex n1,
									complex n2)
	{
		complex res = new complex(0, 0);
		res.real = n1.real + n2.real;
		res.image = n1.image + n2.image;
		return res;
	}
    public static complex sub(complex n1,
									complex n2)
	{
		complex res = new complex(0, 0);
		res.real = n1.real - n2.real;
		res.image = n1.image - n2.image;
		return res;
	}

    
	public static void main(String arg[])
	{   Scanner s=new Scanner(System.in);
        System.out.print("Enter the real and imaginary part of first Complex number: ");
        int a1=s.nextInt();
        int b1=s.nextInt();
        System.out.print("Enter the real and imaginary part of second Complex number: ");
        int a2=s.nextInt();
        int b2=s.nextInt();
		complex c1 = new complex(a1, b1);
		complex c2 = new complex(a2, b2);
		System.out.print("first Complex number: ");
		c1.showC();
		System.out.print("\nSecond Complex number: ");
		c2.showC();
        complex res1 = add(c1, c2);
        complex res2 = sub(c1, c2);
		System.out.println("\nAddition is :");
		res1.showC();
        System.out.println("\nSubtraction is :");
		res2.showC();
	}
}

