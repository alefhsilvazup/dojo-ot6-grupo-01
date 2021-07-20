package br.com.zupedu.dojo.ot4dojo.criarturma.request;

import br.com.zupedu.dojo.ot4dojo.criarturma.controller.model.Turma;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class TurmaRequest {

    @Size(max=50) @NotBlank
    private String nome;
    @NotNull
    private LocalDate iniciaEm;
    @NotNull
    private LocalDate terminaEm;

    public TurmaRequest(String nome, LocalDate iniciaEm, LocalDate terminaEm) {
        this.nome = nome;
        this.iniciaEm = iniciaEm;
        this.terminaEm = terminaEm;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getIniciaEm() {
        return iniciaEm;
    }

    public LocalDate getTerminaEm() {
        return terminaEm;
    }

    @Deprecated
    public TurmaRequest() {
    }

    public Turma toModel() {
        return new Turma(nome, iniciaEm, terminaEm);
    }

    @Override
    public String toString() {
        return "TurmaRequest{" +
                "nome='" + nome + '\'' +
                ", iniciaEm=" + iniciaEm +
                ", terminaEm=" + terminaEm +
                '}';
    }
}
