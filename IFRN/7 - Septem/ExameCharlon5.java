  
import java.util.*;
import java.io.*;
public class ExameCharlon5 {
    public static void main(String[] args) throws IOException {
      Random rd = new Random();

      FileWriter arq = new FileWriter("dez_valores.txt");
      PrintWriter gravar = new PrintWriter(arq);

      for (int i = 0; i < 10; i++) {
          gravar.println(rd.nextInt());
        }
        arq.close();
    }
}

