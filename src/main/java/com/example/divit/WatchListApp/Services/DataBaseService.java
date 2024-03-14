package com.example.divit.WatchListApp.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.divit.WatchListApp.entity.Movie;
import com.example.divit.WatchListApp.repository.MovieRepo;

public class DataBaseService {

	@Autowired
	MovieRepo movieRepo;
	public void create(Movie movie) {
		
		movieRepo.save(movie);
	}
}
