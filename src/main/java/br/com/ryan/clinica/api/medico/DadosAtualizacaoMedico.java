package br.com.ryan.clinica.api.medico;

import br.com.ryan.clinica.api.endereco.DadosEndereco;
import br.com.ryan.clinica.api.endereco.Endereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        String email,
        DadosEndereco endereco) {

}
