package br.com.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
   private String nome;
    private Set<Conteudo> conteudoInscricao = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();
//metodos

public void inscreverBootcamp(Bootcamp bootcamp){ }

public void progredir(){}

public void calcularTotalXp(){}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudoInscricao == null) ? 0 : conteudoInscricao.hashCode());
        result = prime * result + ((conteudoConcluidos == null) ? 0 : conteudoConcluidos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudoInscricao == null) {
            if (other.conteudoInscricao != null)
                return false;
        } else if (!conteudoInscricao.equals(other.conteudoInscricao))
            return false;
        if (conteudoConcluidos == null) {
            if (other.conteudoConcluidos != null)
                return false;
        } else if (!conteudoConcluidos.equals(other.conteudoConcluidos))
            return false;
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscricao() {
        return conteudoInscricao;
    }

    public void setConteudoInscricao(Set<Conteudo> conteudoInscricao) {
        this.conteudoInscricao = conteudoInscricao;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }

}
