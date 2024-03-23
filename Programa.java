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
        
            default:
                break;
        }
    }
}
