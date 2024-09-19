package org.ada.repository;

public interface CRUD<T> {

    void salvar(T obj);
    T editar(T obj);
    T buscar(T obj);
    void excluir(T obj);

}
