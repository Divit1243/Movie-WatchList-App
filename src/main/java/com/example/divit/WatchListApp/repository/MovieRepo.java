package com.example.divit.WatchListApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.divit.WatchListApp.entity.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie,Integer> {

	
}
