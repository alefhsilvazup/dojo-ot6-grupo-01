package br.com.zupedu.dojo.ot4dojo.criarturma.request;

import br.com.zupedu.dojo.ot4dojo.criarturma.model.Turma;

import java.time.LocalDate;

public class TurmaDTO {


    private Long id;

    private String nome;
    private LocalDate iniciaEm;
    private LocalDate terminaEm;

    public TurmaDTO(Turma turma) {
        this.id = turma.getId();
        this.nome = turma.getNome();
        this.iniciaEm = turma.getIniciaEm();
        this.terminaEm = turma.getTerminaEm();
    }


    @Deprecated
    public TurmaDTO() {
    }

    public Long getId() {
        return id;
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

    @Override
    public String toString() {
        return "TurmaRequest{" +
                "nome='" + nome + '\'' +
                ", iniciaEm=" + iniciaEm +
                ", terminaEm=" + terminaEm +
                '}';
    }
}
