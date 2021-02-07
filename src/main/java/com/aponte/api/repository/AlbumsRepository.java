package com.aponte.api.repository;

import com.aponte.api.entity.Album;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumsRepository extends JpaRepository<Album,Integer>{
}
