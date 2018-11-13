package com.Collection;

public class Books {

    private String autor;

    public Books(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Books{" +
                "autor='" + autor + '\'' +
                '}';
    }
}
