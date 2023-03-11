import java.util.Scanner;
public class HipotenusHesaplama 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("1.Kenarı gir : ");
		int a = scan.nextInt();
		System.out.print("2.Kenarı gir : ");
		int b = scan.nextInt();
		int c = (int)Math.sqrt((a*a) + (b+b));
		System.out.println("Hipotenus : " + (int)c);
	}
}