package com.caiofeitosa.crud_basico.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Indica que esta classe é uma entidade JPA,
// ou seja, será mapeada para uma tabela no banco de dados.
@Entity

// Define o nome da tabela que será criada no banco.
// Sem essa anotação, o JPA usaria o nome da classe por padrão.
@Table(name = "usuarios")

// Lombok gera automaticamente todos os getters da classe.
@Getter

// Lombok gera automaticamente todos os setters da classe.
@Setter

// Lombok gera um construtor vazio.
// O JPA precisa dele para conseguir criar objetos da entidade.
@NoArgsConstructor

public class Usuario {

    // Define que este atributo é a chave primária (Primary Key) da tabela.
    @Id

    // Define como o valor do ID será gerado.
    // AUTO deixa o JPA escolher a estratégia mais adequada para o banco utilizado.
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUsuario;

    // Define informações adicionais da coluna no banco.
    // Neste caso, a coluna terá o nome "nome".
    @Column(name = "nome")
    private String nomeUsuario;

    // Define o nome da coluna e a restrição unique = true,
    // que impede que dois usuários tenham o mesmo e-mail.
    @Column(name = "email", unique = true)
    private String emailUsuario;

}
