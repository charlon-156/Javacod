package POO;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        Scanner in = new Scanner(System.in);
        String [] paciente = new String[5];
        Date [] datas = new Date[5];
        String aux;

        for (int i = 0; i < datas.length; i++) {
            System.out.println("Consulta "+(i+1));

            System.out.println("Digite o nome do paciente: ");
            paciente[i] = in.nextLine();

            System.out.println("Digite a data da consulta (dia/mês/ano): "); // dd/MM/yyyy
            aux = in.nextLine(); // pega String
            datas[i] = fmt.parse(aux); // passa de String para Date
        }

        for (int i = 0; i < datas.length; i++) {
            System.out.println(fmt.format(datas[i]));
        }
        in.close();
    }
}
