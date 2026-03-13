import org.example.AuthService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthServiceTest {

    AuthService auth = new AuthService();

    // Verifica se o login funciona com usuário e senha corretos
    @Test
    void loginValido() {
        assertTrue(auth.login("admin","123"));
    }

    // Verifica comportamento quando a senha está incorreta
    @Test
    void loginInvalido() {
        assertFalse(auth.login("admin","999"));
    }

    // Testa login com usuário vazio
    @Test
    void usuarioVazio() {
        assertFalse(auth.login("","123"));
    }

    // Testa login com senha vazia
    @Test
    void senhaVazia() {
        assertFalse(auth.login("admin",""));
    }

    // Verifica validação de email válido
    @Test
    void emailValido() {
        assertTrue(auth.emailValido("teste@email.com"));
    }

    // Verifica comportamento para email inválido
    @Test
    void emailInvalido() {
        assertFalse(auth.emailValido("testeemail.com"));
    }
}