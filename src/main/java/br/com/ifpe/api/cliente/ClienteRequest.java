package br.com.ifpe.api.cliente;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.modelo.cliente.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class ClienteRequest {

    private String nome;
 
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;
 
    private String cpf;

    private String foneCelular;
 
 
    private String foneFixo;

    public Cliente build() {

        return Cliente.builder()
                .nome(nome)
                .cpf(cpf)
                .foneCelular(foneCelular)
                .foneFixo(foneFixo)
                .build();
    }
 

}
