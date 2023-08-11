// Indica que esse arquivo Java pertence ao pacote (diretório) 'br.com.senai'
package br.com.senai;

// Importa a classe SpringApplication do Spring Boot, que é usada para iniciar o aplicativo
import org.springframework.boot.SpringApplication;

// Importa a anotação SpringBootApplication, que configura automaticamente o aplicativo
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Essa anotação marca essa classe como a classe principal do aplicativo
@SpringBootApplication
public class ProjetoComThymeleafApplication {

    // Método principal que o computador vai executar ao rodar o programa
    public static void main(String[] args) {
        // Aqui usamos a classe SpringApplication para iniciar o aplicativo
        // Passamos a classe ProjetoComThymeleafApplication como argumento, indicando que é a classe principal do aplicativo
        SpringApplication.run(ProjetoComThymeleafApplication.class, args);
    }

}
