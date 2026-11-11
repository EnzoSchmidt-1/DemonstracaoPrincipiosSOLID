package LSP;

import java.util.ArrayList;
import java.util.List;

/**
 * Pizza Hamburguer e Bebida todos se extendem
 * de produto e respeitam o contrato base, Qualquer
 * classe que receber Produto funciona com as outras
 * subclasses dela
 */

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Hamburger("X-Burger", 30.0, "Carne Extra"));
        produtos.add(new Pizza("Pizza calabresa", 50.0, 12));
        produtos.add(new Bebida("Refrigerante", 7.0, 500));

        double total = 0;
        for (Produto produto : produtos){
            total += produto.getPreco();
        }

        System.out.println("Total: R$" + total);

    }
}
