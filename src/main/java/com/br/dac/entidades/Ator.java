package com.br.dac.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * @brief Classe Ator
 * @author Joseph Sousa
 * @mail jsantos.te@gmail.com
 * @date   02/04/2018
 */
@Entity
public class Ator {
    @Id
    private int codigo; 
    private String nome;
    private String Sexo; 
    private String Nacionalidade;
    @ManyToOne
    private Filme filme;
    @OneToOne
    private Ator par;
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public void setNacionalidade(String Nacionalidade) {
        this.Nacionalidade = Nacionalidade;
    }

    @Override
    public String toString() {
        return "Ator{" + "codigo=" + codigo + ", nome=" + nome + ", Sexo=" + Sexo + ", Nacionalidade=" + Nacionalidade + '}';
    }
}
