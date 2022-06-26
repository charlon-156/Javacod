package Aulas.T_0214;
public class Executar {
    public static void main(String[] args) {
        Papagaio ppg = new Papagaio("Roberto");
        ppg.falar();
        alimentar(ppg);
        ppg.comer();

        Urubu urb = new Urubu("Mengo");   
        urb.torcerProMengo();
        urb.locomover();

        PicaPau pcp = new PicaPau("Gugu", "Vasco");
        pcp.jogarBola();
    }

    static void alimentar(Animal animal){
        System.out.println("Alimentando o "+animal.getEspecie()+" "+animal.getNome());

    }
}
