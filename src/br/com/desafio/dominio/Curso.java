package br.com.desafio.dominio;


public class Curso extends Conteudo{
    private String curso;

    private int cargahoraria;

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    public int getCargahoraria() {
        return cargahoraria;
    }
    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }
    @Override
    public String toString() {
        return "Curso [curso=" + curso + ", titulo=" + getTitulo() + ", cargahoraria=" + cargahoraria + "]";
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargahoraria;
    }
    
}
//curso
//titulo
//cargahoraria
//METODO
//Calcular xp
