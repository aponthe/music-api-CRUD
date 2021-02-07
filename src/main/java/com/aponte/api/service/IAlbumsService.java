package com.aponte.api.service;

import com.aponte.api.entity.Album;

import java.util.List;

public interface IAlbumsService {
    List<Album> buscarTodos();
    void guardar(Album album);
    void eliminar(int idAlbum);
}
