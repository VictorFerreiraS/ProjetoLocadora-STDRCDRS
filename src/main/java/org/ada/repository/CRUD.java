package org.ada.repository;

public interface CRUD<T, I> {

    void inserir(T obj);
    T editar(T obj);
    T buscarPorId(I id);
    void excluir(T obj);

}
