package Estudos.Repetição;
public class Lacos {
  public static void main(String[] args) {


    //For();
    //While();
    //DoWhile();
  
  }
  public static void For(){
    System.out.println("\nLaço de for");
    for(int i = 1; i<=5;i++){
      System.out.println(i);
        }
      }

  public static void While() {
    System.out.println("\nLaço de while");
    int i = 1;
    while (i<=5) {
      System.out.println(i);
      i++;
    }
  }

  public static void DoWhile() {
    System.out.println("\nLaço de DoWhile");
    int i=1;
    do { 
      System.out.println(i);
      i++;
    } while (i<=5);
  }

}