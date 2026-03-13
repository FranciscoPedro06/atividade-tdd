package org.example;

public class AuthService {

    // Método que simula um processo simples de login
    public boolean login(String usuario, String senha) {

        // Verifica se o usuário foi informado
        if (usuario == null || usuario.isEmpty()) {
            return false;
        }

        // Verifica se a senha foi informada
        if (senha == null || senha.isEmpty()) {
            return false;
        }

        // Validação simples de usuário e senha
        return usuario.equals("admin") && senha.equals("123");
    }

    // Método responsável por validar o formato básico de um email
    public boolean emailValido(String email) {

        if (email == null) {
            return false;
        }

        // Verifica se contém os elementos básicos de um email
        return email.contains("@") && email.contains(".");
    }
}