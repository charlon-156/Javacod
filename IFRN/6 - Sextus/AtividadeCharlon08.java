
import java.util.*;

public class AtividadeCharlon08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double []valor1 = new double[4];
        double []valor2 = new double[4];
        String []operação = new String[4];
        double []resultado = new double[4];

        for (int i = 0; i < valor1.length; i++) {
            System.out.println("Valor do vetor "+(i+1)+" da 1 parte");
            valor1[i] = in.nextDouble();
            System.out.println("Valor do vetor "+(i+1)+" da 2 parte");
            valor2[i] = in.nextDouble();
        }
        System.out.println("\nDigite qual operação deseja: (+,*,/ ou -)\n");
        for (int i = 0; i < operação.length; i++) {
        operação[i] = in.next();

        if (operação[i].equals("+")) {
            for (int j = 0; j < resultado.length; j++) {
                resultado[j]= valor1[j]+valor2[j];
                System.out.println("O resultado da soma: "+resultado[j]);
                
            }
        }else if(operação[i].equals("-")){
            for (int j = 0; j < resultado.length; j++) {
                resultado[j]= valor1[j]-valor2[j];
                System.out.println("O resultado da subtração: "+resultado[j]);
            }
        }else if(operação[i].equals("*")){
            for (int j = 0; j < resultado.length; j++) {
                resultado[j]= valor1[j]*valor2[j];
                System.out.println("O resultado da multiplação: "+resultado[j]);
            }
        }else if(operação[i].equals("/")){
            for (int j = 0; j < resultado.length; j++) {
                resultado[j]= valor1[j]/valor2[j];
                System.out.println("O resultado da divisão: "+resultado[j]);
            }
        }
    }
        in.close();
    }
}
