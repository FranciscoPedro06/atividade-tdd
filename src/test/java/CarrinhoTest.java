import org.example.Carrinho;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoTest {

    // Testa se um item é adicionado corretamente ao carrinho
    @Test
    void adicionarItem() {

        Carrinho carrinho = new Carrinho();

        carrinho.adicionarItem(10);

        assertEquals(1, carrinho.quantidadeItens());
    }

    // Testa remoção de um item do carrinho
    @Test
    void removerItem() {

        Carrinho carrinho = new Carrinho();

        carrinho.adicionarItem(10);
        carrinho.removerItem(10);

        assertEquals(0, carrinho.quantidadeItens());
    }

    // Verifica se o cálculo do total do carrinho está correto
    @Test
    void calcularTotal() {

        Carrinho carrinho = new Carrinho();

        carrinho.adicionarItem(10);
        carrinho.adicionarItem(20);

        assertEquals(30, carrinho.calcularTotal());
    }
}