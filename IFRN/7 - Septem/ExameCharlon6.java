package IFRN.Septem;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class ExameCharlon6 {
    public static void main(String[] args) {

    int i = 0;
    
    int[] valores  = new int[10];

    String linha = new String();

    String nomeArquivo = ("dez_valores.txt");

    File arq = new File(nomeArquivo);

    if (arq.exists()) {
        
        try {
            
            FileReader leitoDeArquivo = new FileReader(nomeArquivo);
            BufferedReader bufferDeArquivo = new BufferedReader(leitoDeArquivo);

            while (true) {

                linha = bufferDeArquivo.readLine();

                if (linha == null) {
                    break;
                }

                valores[i] = Integer.parseInt(linha);
                i++;
                bufferDeArquivo.close();
            }

        } catch (Exception e) {
            
        }
    }
        System.out.print("A média dos valores é: "+(valores[0]+valores[1]+valores[2]+valores[3]+valores[4]+valores[5]+valores[6]+valores[7]+valores[8]+valores[9])/10);
        
    }
}