import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Atendente atendente = new Atendente();
        
        int opcaoEscolhida = atendente.menuPrincipal();
        
        Estoque estoque = new Estoque();
        estoque.gerenciarEstoque(opcaoEscolhida, atendente);
        
    }

}