  
import java.util.Scanner;
public class CharlonQuest03 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Digite um numero para verificar se e´postivo ou negativo:");
        int num = in.nextInt();

        if (num>0) {
            System.out.println(num+" é positivo!");
            
        } else if(num<0){
            System.out.println(num+" é negativo!");
            
        } else{
            System.out.println("Esse numero é O");
        }
        in.close();
    }
}
