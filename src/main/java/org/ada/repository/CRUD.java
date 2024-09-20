package org.ada.repository;

public interface CRUD<T, I> {

    void inserir(T obj);
    T editar(I id, T obj);
    T buscarPorId(I id);
    void excluir(T obj);

}
