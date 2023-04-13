package br.com.ifpe.modelo.produto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import br.com.ifpe.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Produto")
@Where(clause = "habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto extends EntidadeAuditavel{
    
    private String nome;

    private String titulo;
 
    private String descricao;
 
    private Double valorUnitario;
 
    private Integer tempoEntregaMinimo;

    private Integer tempoEntregaMaximo;
 
}
