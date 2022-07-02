# Súmario do diretório de POO

## A1

**Questao1** - Defina uma estrutura de dados para agrupar e representar os dados de um automóvel (marca do fabricante, modelo, ano de fabricação e quantidade máxima de passageiros). Essa questão já foi trabalhada em sala de aula. Quem fez na sala, acrescenta a descrição de como fez para resolvê-la.

**Questao2** - Escreva um programa que armazene os dados relacionados a um filme (nome, autor, ano, preço) em uma estrutura de dados do tipo registro. Crie funções para ler e para imprimir os dados desse tipo de registro. Crie uma função main para ler e imprimir os dados de 3 diferentes filmes.

**Qustao3** - Faça uma função que leia um número não determinado de valores positivos e retorne a média aritmética dos mesmos.


## A2 

**CharlonFQ1** - Faça um programa que simule o sistema de um mercado. Determine um conjunto de produtos que terá no seu mercado e estabeleça dois vetores, um de preço e um de quantidade no estoque, que contenham as informações dos produtos. Crie uma variável que represente o dinheiro no caixa com um valor inicial que desejar. Leia um inteiro na função principal que corresponde à ação que se deseja fazer (1 - adicionar ao estoque, em caso de compra de um fornecedor, e 2 - retirar do estoque, em caso de venda a um cliente). 
Faça uma função que implemente cada um desses casos. Ambas as funções devem receber os vetores de preço e quantidade, assim como o dinheiro no caixa, através de passagem por valor.Elas também devem imprimir um menu com os produtos, cada produto representado por um número. Depois que for lido o inteiro do produto escolhido, será lido a quantidade comprada ou vendida. Caso seja a função da opção 1, esse valor será adicionado à quantidade no estoque e o dinheiro em caixa será decrementado de acordo com o preço do produto e a quantidade comprada. Caso seja a opção 2, a quantidade no estoque será diminuída, mas o dinheiro no caixa será incrementado.Exemplo de menu:
(1) - Arroz
(2) - Feijão
(3) - Biscoito
(4) - Molho de tomate

**CharlonFQ2** - Desenvolva um programa que tenha uma função que leia uma matriz de inteiros positivos de dimensões desconhecidas. O seu programa irá ler os números e salvá-los, exceto quando ele for menor que 0. Se o número lido for -1, considere-o como um delimitador que diz o final da linha. Se for -2, a matriz completa foi lida. Além de ler a matriz, a função deve retornar a quantidade de colunas e a quantidade de linhas. As variáveis da matriz, do número de colunas e do número de linhas devem ser passadas por valor. Declare sua matriz utilizando um valor de tamanho máximo.


## A3

**Jogador e JogadorMain** - Crie uma classe para representar um jogador de futebol, com os atributos nome, posição, data de nascimento, nacionalidade, altura e peso. Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos os dados do jogador. Crie um método para calcular a idade do jogador e outro método para mostrar quanto tempo falta para o jogador se aposentar. Para isso, considere que os jogadores da posição de defesa se aposentam em média aos 40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35. 

**Elevador** Crie uma classe Elevador para armazenar as informações de um elevador de prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:
    * que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
    * para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
    * para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
    * para subir um andar (não deve subir se já estiver no último andar);
    * para descer um andar (não deve descer se já estiver no térreo);


## A4

**Exercício 1:** Implemente a classe Funcionario e a classe Gerente.
a. crie a classe Assistente, que também é um funcionário, e que possui um número de matrícula (faça o método GET). Sobrescreva o método exibeDados().
b. sabendo que os Assistentes Técnicos possuem um bônus salarial e que os Assistentes Administrativos possuem um turno (dia ou noite) e um adicional noturno, crie as classes Tecnico e Administrativo.

**Exercício 2:** Implemente os diagramas de classe abaixo:

**Exercício 3:** Crie uma classe chamada Ingresso que possui um valor em reais e um método imprimeValor().
a. crie uma classe VIP, que herda Ingresso e possui um valor adicional. Crie um método que retorne o valor do ingresso VIP (com o adicional incluído).
b. crie uma classe Normal, que herda Ingresso e possui um método que imprime: "Ingresso Normal".
c. crie uma classe CamaroteInferior (que possui a localização do ingresso e métodos para acessar e imprimir esta localização) e uma classe CamaroteSuperior, que é mais cara (possui valor adicional). Esta última possui um método para retornar o valor do ingresso. Ambas as classes herdam a classe VIP.

**Exercício 4:** Crie a classe Imovel, que possui um endereço e um preço.
a. crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie métodos de acesso e impressão deste valor adicional.
b. crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie métodos de acesso e impressão para este desconto.

**Exercício 5:** Crie uma classe de Teste com o método main. Neste método:
a. crie um assistente administrativo e um técnico. Imprima o número de matrícula e o nome de cada um deles.
b. crie um animal do tipo cachorro e faça-o latir. Crie um gato e faça-o miar. Faça os dois animais caminharem.
c. teste (como quiser) as classes Rica, Pobre e Miseravel.
d. crie um ingresso. Peça para o usuário digitar 1 para normal e 2 para VIP. Conforme a escolha do usuário, diga se o ingresso é do tipo normal ou VIP. Se for VIP, peça para ele digitar 1 para camarote superior e 2 para camarote inferior. Conforme a escolha do usuário, diga se que o VIP é camarote superior ou inferior. Imprima o valor do ingresso.
e. crie um imóvel. Peça para o usuário digitar 1 para novo e 2 para velho. Conforme a definição do usuário, imprima o valor final do imóvel.