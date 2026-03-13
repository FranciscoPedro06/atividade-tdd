import org.example.AlunoService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoServiceTest {

    AlunoService aluno = new AlunoService();

    // Testa cálculo da média de duas notas
    @Test
    void calcularMedia() {
        assertEquals(8, aluno.calcularMedia(7,9));
    }

    // Verifica se aluno com média suficiente está aprovado
    @Test
    void alunoAprovado() {
        assertTrue(aluno.estaAprovado(7));
    }

    // Verifica se aluno com média baixa é reprovado
    @Test
    void alunoReprovado() {
        assertFalse(aluno.estaAprovado(5));
    }
}