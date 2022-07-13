package aula1;

public class ImprimeIdade {

    public static void main(String[] args) {
        int idade = 24;
        String nome = "Natália";
        double altura = 1.72;
        double peso = 122;

        double imc = (peso) / (altura * altura);

        System.out.println("Olá: " + nome);
        if (idade >= 40) {
            if (imc < 22) {
                System.out.println("IMC: " + imc + " sua idade é " + idade + " risco de subnutrição.");
            } else if (imc <= 30) {
                System.out.println("IMC: " + imc + " sua idade é " + idade + " isso aí!");
            } else if (imc <= 35) {
                System.out.println("IMC: " + imc + " sua idade é " + idade + " opa, pode estar pesado.");
            } else {
                System.out.println("IMC: " + imc + " sua idade é " + idade + " procure um médico e nutricionista");
            }

        } else {
            if (imc <= 18) {
                System.out.println("IMC: " + imc + " sua idade é " + idade + " Procure um médico para avaliação de subnutrição");

            } else if (imc <= 26) {
                System.out.println("IMC: " + imc + " sua idade é " + idade + " Seu indice está controlado e saudável procure um nutricionista.");

            } else if (imc <= 32) {
                System.out.println("IMC: " + imc + " sua idade é " + idade + " Parabéns consulte um médico para medição muscular");
            
            } else if (imc <= 40) {
                System.out.println("IMC: " + imc + " sua idade é " + idade + " Pré obesidade precisará de acompanhamento nutricional");

            } else {
                System.out.println("IMC: " + imc + " sua idade é " + idade + " Procure um médico endocrinologista com urgência");

            }
        }

    }
}