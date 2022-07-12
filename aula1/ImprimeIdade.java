package aula1;

public class ImprimeIdade {

    public static void main(String[] args) {
        int idade = 40;
        String nome = "Victor Icoma";
        double altura = 1.88;
        double peso = 132.52;

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
            System.out.println("Novo demais para medição");

        }

    }
}