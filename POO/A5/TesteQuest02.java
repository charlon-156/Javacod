package POO.A5;
//developer @charlon_fernandes
//Charlon Fernandes Monteiro

import java.util.*;
public class TesteQuest02{

    //Codigo para testar o Q2

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int escolha;


        /* Inicialização do Do While
         * 
         * Laco de repeticao para imprimir o menu de cliente, funcionario e fornecedor
         * O sistema de repetição vai perdurar até usario digitar corretamente
         */
        do {
            System.out.println("Bem vindo ao Menor Preco\n\nDigite sua função:\n1- Cliente\n2- Funcionario\n3- Fonecedor");
            escolha = in.nextInt();
        } while(!(escolha>=1 && escolha<=3));



        /* Inicialização do switch case
         * 
         * Densenvolvido para subdivir qual codido deve excutar
         * 
         * case 1 -> cliente | case 2 -> funcionario | case 3 -> fornecedor
         */
        switch (escolha) {



            /* Case 1 - CLIENTE
            * 
            * Vai ser pedido -> nome,endereço, telefone, CPF e RG
            * caso informado telefone, CPF ou RG incorretos um try catch vai ser ativado
            */
            case 1:
                Quest02Charlon_Arq02 cliente = new Quest02Charlon_Arq02();

                System.out.println("\nDigite o seu nome:");
                cliente.setNome(in.nextLine());
                in.nextLine();

                System.out.println("\nDigite o endereço");
                cliente.setEndereco(in.nextLine());
                in.nextLine();
                
                System.out.println("\nDigite o telefone");
                cliente.setTelefone(in.nextLine());
                in.nextLine();


                    /* Try catch
                    *
                    * Para lancamento de dados incorretos
                    * Codigo encerrado quando inseridos valores invalidos 
                    */
                    try {
                    cliente.validar(cliente.getTelefone(), 11); 
                    } catch (Quest02Charlon_Expetion e1) {
                        e1.erro();
                    }
                    
                System.out.println("\nDigite o CPF");
                cliente.setCpf(in.nextLine());

                    try { 
                        cliente.validar(cliente.getCpf(), 11);
                    } catch (Quest02Charlon_Expetion e1) {
                        e1.erro();
                    }
                    
                System.out.println("\nDigite o RG");
                cliente.setRg(in.nextLine());

                    try {
                        cliente.validar(cliente.getRg(), 7);
                    } catch (Quest02Charlon_Expetion e1) {
                        e1.erro();
                    }
                    break;
                    


                   /* Case 2 - FUNCIONARIO
                    * 
                    * Vai ser pedido -> CPF, Nome, Endereço, Telefone, CPF, CTPS, Banco, Agencia, e conta-corrente.
                    * caso informado telefone, CPF, CTPS, Banco e Agencia incorretos um try catch vai ser ativado
                    */
                    case 2:
                    Quest02Charlon_Arq03 funcionario = new Quest02Charlon_Arq03();
                    
                    System.out.println("\nDigite o seu nome:");
                    funcionario.setNome(in.nextLine());
                    in.nextLine();
                    
                    System.out.println("\nDigite o seu endereço:");
                    funcionario.setEndereco(in.nextLine());
                    in.nextLine();

                    System.out.println("\nDigite o seu telefone:");
                    funcionario.setTelefone(in.nextLine());
                    in.nextLine();
                    
                        try {
                            funcionario.validar(funcionario.getTelefone(), 11);
                        } catch (Quest02Charlon_Expetion e1) {
                            e1.erro();
                        }

                    System.out.println("\nDigite o CPF");
                    funcionario.setCpf(in.nextLine());

                        try { 
                            funcionario.validar(funcionario.getCpf(), 11);
                        } catch (Quest02Charlon_Expetion e1) {
                            e1.erro();
                        }

                    System.out.println("\nDigite o CTPS");
                    funcionario.setCtps(in.nextLine());

                        try { 
                            funcionario.validar(funcionario.getCtps(), 11);
                        } catch (Quest02Charlon_Expetion e1) {
                            e1.erro();
                        }
                        
                    System.out.println("\nDigite o Banco");
                    funcionario.setBanco(in.nextLine());

                        try {
                            funcionario.validar(funcionario.getBanco(), 4);
                        } catch (Quest02Charlon_Expetion e1) {
                            e1.erro();
                        }
                    
                    System.out.println("\nDigite a agencia");
                    funcionario.setAgencia(in.nextLine());

                        try {
                            funcionario.validar(funcionario.getAgencia(), 9);
                        } catch (Quest02Charlon_Expetion e1) {
                            e1.erro();
                        }

                    System.out.println("\nDigite sua conta corrente:");
                    funcionario.setContacorrente(in.nextLine());
                    in.nextLine();
                break;


               /* Case 3 - FORNECEDOR
                * 
                * Vai ser pedido -> CNPJ ou CPF e RG, Nome, Endereço, Telefone.
                * caso informado cnpj, cpf, rg ou telefone incorretos um try catch vai ser ativado
                */
            case 3:
                Quest02Charlon_Arq04 fornecedor = new Quest02Charlon_Arq04();
                
                System.out.println("Escolha:\n1- CNPJ\n2-CPF e RG");
                escolha = in.nextInt();
                in.nextLine();

                //sistema de condição para escolher entre CNPJ ou CPF e RG
                switch (escolha) {
                    case 1:
                    System.out.println("\nDigite seu CNPJ");
                    fornecedor.setCnpj(in.nextLine());
                    in.nextLine();
                        try {
                            fornecedor.validar(fornecedor.getCnpj(), 14);
                        } catch (Quest02Charlon_Expetion e1) {
                            e1.erro();
                        }
                        break;
                        case 2:
                        System.out.println("\nDigite seu CPF");
                        fornecedor.setCpf(in.nextLine());
                        in.nextLine();

                            try {
                                fornecedor.validar(fornecedor.getCpf(), 14);
                            } catch (Quest02Charlon_Expetion e1) {
                                e1.erro();
                            }

                        System.out.println("\nDigite seu RG");
                        fornecedor.setCpf(in.nextLine());

                        try {
                            fornecedor.validar(fornecedor.getCpf(), 14);
                        } catch (Quest02Charlon_Expetion e1) {
                            e1.erro();
                        }

                        break;
                    }

                    System.out.println("\nDigite o seu nome:");
                    fornecedor.setNome(in.nextLine());
                    in.nextLine();

                    System.out.println("\nDigite o seu endereco:");
                    fornecedor.setEndereco(in.nextLine());
                    in.nextLine();

                    System.out.println("\nDigite o seu telefone:");
                    fornecedor.setTelefone(in.nextLine());
                    in.nextLine();
                    
                        try {
                            fornecedor.validar(fornecedor.getTelefone(), 11);
                        } catch (Quest02Charlon_Expetion e1) {
                            e1.erro();
                        }
                break;
        }
    in.close();
    }
}