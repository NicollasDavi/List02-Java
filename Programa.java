public class Programa {
    public static void main(String[] args) {
        int op = Prompt.lerInteiro("Digite qual exercicio:");
        switch (op) {
            case 1:
                Exercicio01.executar();
                break;
            case 2:
                Exercicio02.executar();
                break;
            case 3:
                Exercicio03.executar();
                break;
            case 4:
                Exercicio04.executar();
                break;
        
            default:
                break;
        }
    }
}
