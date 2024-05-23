import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProcess = true;

        System.out.println("1. Identificação da pessoa colaboradora trans e primeira comunicação");

        while (continueProcess) {
            System.out.println("2. A pessoa colaboradora deseja ter orientações da área de D&I? (sim/não)");
            String decision = scanner.nextLine().trim().toLowerCase();

            if (decision.equals("sim")) {
                System.out.println("3. Encontro para entender as necessidades e expectativas");
                System.out.println("3.1 Orientação junto às áreas envolvidas para sanar as necessidades");
                System.out.println("3.2 Passar informações e devolutivas para a pessoa colaboradora");

                boolean hasMoreQuestions = true;
                while (hasMoreQuestions) {
                    System.out.println("3.3 Colaborador tem mais alguma questão? (sim/não)");
                    String moreQuestions = scanner.nextLine().trim().toLowerCase();

                    if (moreQuestions.equals("sim")) {
                        System.out.println("3.3.1 Realizar outro encontro para entender a demanda");
                        System.out.println("3.1 Orientação junto às áreas envolvidas para sanar as necessidades");
                        System.out.println("3.2 Passar informações e devolutivas para a pessoa colaboradora");
                    } else {
                        System.out.println("3.3.2 Nos colocamos à disposição, caso precise de ajuda ou orientação");
                        hasMoreQuestions = false;
                    }
                }
            } else {
                System.out.println("4. Nos colocamos à disposição da pessoa colaboradora, caso precise de ajuda ou orientação");
                continueProcess = false;
            }
        }

        scanner.close();
    }
}
