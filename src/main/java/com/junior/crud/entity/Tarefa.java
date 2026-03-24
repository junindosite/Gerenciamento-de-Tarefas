package com.junior.crud.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tarefa")
    private Long id;

    @Column(name = "descricao_tarefa")
    private String descricao;

    @Column(name = "data_vencimento")
    private LocalDate dataVencimento;

    @Column(name = "status_concluida")
    private Boolean concluida;

    public Tarefa() {}

    public Long getId() { return id; }
    public String getDescricao() { return descricao; }
    public LocalDate getDataVencimento() { return dataVencimento; }
    public Boolean getConcluida() { return concluida; }

    public void setId(Long id) { this.id = id; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setDataVencimento(LocalDate dataVencimento) { this.dataVencimento = dataVencimento; }
    public void setConcluida(Boolean concluida) { this.concluida = concluida; }
}