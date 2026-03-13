import org.example.DescontoService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DescontoServiceTest {

    DescontoService desconto = new DescontoService();

    // Testa aplicação de desconto padrão de 10%
    @Test
    void descontoDezPorcento() {
        assertEquals(90, desconto.calcularDesconto(100));
    }

    // Testa desconto aplicado para cliente VIP
    @Test
    void descontoVip() {
        assertEquals(80, desconto.descontoVIP(100));
    }
}