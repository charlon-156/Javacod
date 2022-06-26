package Estudos.Desenvolvimento;
import java.util.Scanner;
public class Organiza {
    public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		int a, b, c;

		System.out.print("Primeiro numero inteiro: ");
		a = in.nextInt();

		System.out.print("Segundo numero inteiro: ");
		b = in.nextInt();

		System.out.print("Terceiro numero inteiro: ");
		c = in.nextInt();

		if(a > b){
			if(b > c){
				System.out.print(a+"-"+b+"-"+c);
			}
			 else if(a > c) {
			 	System.out.print(a+"-"+c+"-"+b);
			} else{
				System.out.print(c+"-"+a+"-"+b);
			}
		}
		else if (b > c){
			if(a > c){
				System.out.print(b+"-"+a+"-"+c);
			} else{
				System.out.print(b+"-"+c+"-"+a);
			}
		} else{
			System.out.print(c+"-"+b+"-"+a);
	
		}
		in.close();
	}
}