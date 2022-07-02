
import java.util.Scanner;

//Faça um programa que leia uma data de nascimento no formato dd/mm/aaaa e imprima a data com o mês escrito por extenso.

public class AtividadeCharlon01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite sua data de nascimento:\n dd/mm/aaaa");
        String data = in.next();
        String [] output = data.split("/");

        if((output[1]).equals("01")){
            System.out.println(output[0]+" de Janeiro de "+output[2]);

        }else if((output[1]).equals("02")){
            System.out.println(output[0]+" de Fevereiro de "+output[2]);

        }else if((output[1]).equals("03")){
            System.out.println(output[0]+" de Março de "+output[2]);

        }else if((output[1]).equals("04")){
            System.out.println(output[0]+" de Abril de "+output[2]);

        }else if((output[1]).equals("05")){
            System.out.println(output[0]+" de Maio de "+output[2]);

        }else if((output[1]).equals("06")){
            System.out.println(output[0]+" de Junho de "+output[2]);

        }else if((output[1]).equals("07")){
            System.out.println(output[0]+" de Julho de "+output[2]);

        }else if((output[1]).equals("08")){
            System.out.println(output[0]+" de Agosto de "+output[2]);

        }else if((output[1]).equals("09")){
            System.out.println(output[0]+" de Setembro de "+output[2]);

        }else if((output[1]).equals("10")){
            System.out.println(output[0]+" de Outubro de "+output[2]);

        }else if((output[1]).equals("11")){
            System.out.println(output[0]+" de Novembro de "+output[2]);

        }else if((output[1]).equals("12")){
            System.out.println(output[0]+" de Dezembro de "+output[2]);

        }else{
            System.out.println("Número invalido, trouxa ;)");
        }
        in.close();
    }
}