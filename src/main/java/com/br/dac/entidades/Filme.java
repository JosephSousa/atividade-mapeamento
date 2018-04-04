package com.br.dac.entidades;

import javax.persistence.ManyToOne;

/**
 * @brief Classe Filme
 * @author Joseph Sousa
 * @mail jsantos.te@gmail.com
 * @date   02/04/2018
 */
public class Filme {
    
    private int codigo;
    private String titulo;
    private int ano;
    private String diretor;
    @ManyToOne
    private Evento evento;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme{" + "codigo=" + codigo + ", titulo=" + titulo + ", ano=" + ano + ", diretor=" + diretor + '}';
    }
    
}
