package br.com.desafio.dominio;


public class Curso {
    private String curso;
    private String titulo;
    private int cargahoraria;
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getCargahoraria() {
        return cargahoraria;
    }
    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }
    @Override
    public String toString() {
        return "Curso [curso=" + curso + ", titulo=" + titulo + ", cargahoraria=" + cargahoraria + "]";
    }
    
}
//curso
//titulo
//cargahoraria
//METODO
//Calcular xp
