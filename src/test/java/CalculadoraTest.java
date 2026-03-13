import org.example.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    // Instância da classe que será testada
    Calculadora calc = new Calculadora();

    // Testa a soma de dois números positivos
    @Test
    void somaDeNumerosPositivos() {
        assertEquals(5, calc.somar(2,3));
    }

    // Testa soma envolvendo número negativo
    @Test
    void somaComNumeroNegativo() {
        assertEquals(3, calc.somar(5,-2));
    }

    // Verifica se a subtração retorna o resultado esperado
    @Test
    void subtracaoSimples() {
        assertEquals(4, calc.subtrair(7,3));
    }

    // Verifica funcionamento da multiplicação
    @Test
    void multiplicacaoSimples() {
        assertEquals(12, calc.multiplicar(4,3));
    }

    // Testa divisão simples
    @Test
    void divisaoSimples() {
        assertEquals(5, calc.dividir(10,2));
    }

    // Testa comportamento quando ocorre divisão por zero
    @Test
    void divisaoPorZero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(10,0));
    }
}