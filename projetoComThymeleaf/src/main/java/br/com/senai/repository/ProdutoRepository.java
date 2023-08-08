// Importações das classes e anotações necessárias
package br.com.senai.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.senai.model.Produto;

// Anotação @Repository indica que essa interface é um repositório gerenciado pelo Spring
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // A interface ProdutoRepository estende JpaRepository, que fornece operações CRUD prontas para a entidade Produto
    
    // Nenhum método adicional é definido aqui, mas o JpaRepository já inclui métodos como save, findById, findAll, delete, etc.
    // Isso é possível devido à convenção de nomenclatura do Spring Data JPA, que analisa os nomes dos métodos para gerar consultas automáticas
    
    // A sintaxe JpaRepository<Produto, Long> especifica que esta interface lida com a entidade Produto e utiliza o tipo Long para a chave primária
    
    // Como não há métodos adicionais definidos, o repositório herda automaticamente todas as operações de consulta e gerenciamento de entidades
}

