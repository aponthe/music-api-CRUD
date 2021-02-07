package com.aponte.api.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aponte.api.service.IAlbumsService;
import com.aponte.api.repository.AlbumsRepository;
import com.aponte.api.entity.Album;

import java.util.List;

@Service
public class AlbumsService implements IAlbumsService {
    @Autowired
    private AlbumsRepository repoAlbums;

    public List<Album> buscarTodos() {
        return repoAlbums.findAll();
    }

    public void guardar(Album album) {
        repoAlbums.save(album);
    }

    public void eliminar(int idAlbum){
        repoAlbums.deleteById(idAlbum);
    }
}
