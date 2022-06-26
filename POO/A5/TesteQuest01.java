package POO.A5;
public class TesteQuest01 {
    public static void main(String[] args) {
        Quest01Charlon c1 = new Quest01Charlon();

        //chamando os metodos - StatusPessoa() & libra()
        c1.StatusPessoa();
        System.out.println(c1.libra(100));
    }
}
