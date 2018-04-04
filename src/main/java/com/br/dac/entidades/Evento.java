package com.br.dac.entidades;

/**
 * @brief Classe Evento
 * @author Joseph Sousa
 * @mail jsantos.te@gmail.com
 * @date   02/04/2018
 */
public class Evento {
    private int codigo; 
    private String nome;
    private String local;
    private int ano;

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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Evento{" + "codigo=" + codigo + ", nome=" + nome + ", local=" + local + ", ano=" + ano + '}';
    }
}
