package listadeexercicios;

import static listadeexercicios.MenuListas.ler;

public class ListaDeExercicios02 {

    public static void main(String[] args) {

        boolean rVouF = true;

        while (rVouF) {

            System.out.println("--------------------------------------------");
            System.out.printf("DIGITE O NÚMERO DA QUESTÃO > ");
            String resposta1 = ler.next();

            System.out.println("--------------------------------------------");

            switch (resposta1) {
                case "1":
                    Exercicio01();
                    rVouF = false;
                    break;
                case "2":
                    Exercicio02();
                    rVouF = false;
                    break;
                case "3":
                    Exercicio03();
                    rVouF = false;
                    break;
                case "4":
                    Exercicio04();
                    rVouF = false;
                    break;
                case "5":
                    Exercicio05();
                    rVouF = false;
                    break;
                case "6":
                    Exercicio06();
                    rVouF = false;
                    break;
                case "7":
                    Exercicio07();
                    rVouF = false;
                    break;
                case "8":
                    Exercicio08();
                    rVouF = false;
                    break;
                case "9":
                    Exercicio09();
                    rVouF = false;
                    break;
                case "10":
                    Exercicio10();
                    rVouF = false;
                    break;
                case "11":
                    Exercicio11();
                    rVouF = false;
                    break;
                case "0":
                    MenuListas menu = new MenuListas();
                    menu.main(null);
                default:
                    System.out.println("Questão não encontrada...");
                    main(null);
                    break;
            }
        }
    }

    public static void Exercicio01() {

        System.out.println("digite um numero");
        int v1 = ler.nextInt();
        System.out.println("digite outro numero");
        int v2 = ler.nextInt();
        if (v1 > v2) {
            System.out.println(v1 + "é maior");
        } else {
            System.out.println(v2 + "é maior");
        }
        if (v1 == v2) {
            System.out.println("eles sao iguais ");
        }
        main(null);
    }

    public static void Exercicio02() {

        System.out.println("digite um numero");
        int v1 = ler.nextInt();
        if ((v1 % 2) == 0) {
            System.out.println("esse numero é par");
        } else {
            System.out.println("esse numero é impar");
        }
        main(null);
    }

    public static void Exercicio03() {

        System.out.println("digite um numero");
        float v1 = ler.nextFloat();
        System.out.println("digite outro numero");
        float v2 = ler.nextFloat();
        if (v1 > v2) {
            System.out.println("o resultado é " + v1 / v2);
        } else if (v2 > v1) {
            System.out.println("o resulato é " + v2 / v1);
        }
        main(null);
    }

    public static void Exercicio04() {
        
        System.out.println("digite sua receita");
        int recc = ler.nextInt();
        System.out.println("digite sua despesa");
        int dess = ler.nextInt();
        if (recc < dess) {
            System.out.println("prejuizo");
        } else {
            System.out.println("lucro");
        }
        System.out.println("deseja executar novamente? (sim/nao)");
        String condicao = ler.next();

        if ("sim".equalsIgnoreCase(condicao)) {
            main(null);
        }
    }

    public static void Exercicio06(){
        
    }

    public static void Exercicio05() {
        
        System.out.println("escreva sua primeira nota ");
        double n1 = ler.nextDouble();
        System.out.println("escreva sua segunda nota ");
        double n2 = ler.nextDouble();
        System.out.println("escreva sua terçeira nota ");
        double n3 = ler.nextDouble();
        System.out.println("escreva sua quarta nota ");
        double n4 = ler.nextDouble();
        double media = (n1 + n2 + n3 + n4) / 4;
        if (media >= 7) {
            System.out.println("aprovado");
        } else if (media >= 5) {
            System.out.println("recuperação");
        } else {
            System.out.println("reprovado");
        }
        System.out.println("deseja executar novamente? (sim/nao)");
        String condicao = ler.next();

        if ("sim".equalsIgnoreCase(condicao)) {
            main(null);
        }
    }

    public static void Exercicio07(){
        
        System.out.println("Digite um número");
        int numero = scan.nextInt();
        
        
        if (numero > 100){
            System.out.println("Número Maior que 100");
        } else if (numero <0){
            System.out.println("Número negativo");
        } else {
            System.out.println("Número menor que 100");
        }
    }
    
    public static void Exercicio08() {

        System.out.println("digite o número 1 ou 2 para ver se pode atravessar");
        int sinal = ler.nextInt();
        if (sinal == 1) {
            System.out.println("nao atravesse, sinal vermelho");
        } else if (sinal == 2) {
            System.out.println("pode atravessar, sinal verde");
        }
        System.out.println("deseja executar novamente? (sim/nao)");
        String condicao = ler.next();

        if ("sim".equalsIgnoreCase(condicao)) {
            main(null);
        }
    }

    public static void Exercicio09() {

        System.out.println("digite o numero de vitorias");
        int v = ler.nextInt();
        System.out.println("digite o numero de derrotas");
        int d = ler.nextInt();
        if (v > d) {
            System.out.println("bom");
        } else if (v == d) {
            System.out.println("meia boca");
        } else {
            System.out.println("ruim");
        }
        main(null);
    }

    public static void Exercicio10(){
        
        System.out.println("Valor hora aula R$: ");
        Double HT = scan.nextDouble();

        System.out.println("Horas trabalhadas: ");
        Double VH = scan.nextDouble();

        System.out.println("Desconto INSS: ");
        Double PD = scan.nextDouble();

        System.out.println("Informe o salário bruto");
        Double SB = scan.nextDouble();

        Double calculaSalarioBruto = HT * VH;

        Double calculaTotalDesconto = (PD / 100) * calculaSalarioBruto;

        Double calculaSalarioLiquido = SB - calculaTotalDesconto;

        
        System.out.println("Total de desconto: " + calculaTotalDesconto);
        System.out.println("Salário liquido: " + calculaSalarioLiquido);
    }
    
    public static void Exercicio11() {

        System.out.println("digite um numero de 1 a 12 para saber qual mes corresponde");
        int mes = ler.nextInt();
        System.out
                .println(mes == 1 ? "janeiro"
                                : mes == 2 ? "fevereiro"
                                        : mes == 3 ? "março"
                                                : mes == 4 ? "abril"
                                                        : mes == 5 ? "maio"
                                                                : mes == 6 ? "junho"
                                                                        : mes == 7 ? "julho"
                                                                                : mes == 8 ? "agosto"
                                                                                        : mes == 9 ? "setembro"
                                                                                                : mes == 10 ? "outrubro"
                                                                                                        : mes == 11 ? "novembro"
                                                                                                                : mes == 12
                                                                                                                        ? "dezembro"
                                                                                                                        : 0);
        System.out.println("deseja executar novamente ?(sim/nao");
        String condicao = ler.next();
        if ("sim".equalsIgnoreCase(condicao)) {
            main(null);
        }
    }
}
