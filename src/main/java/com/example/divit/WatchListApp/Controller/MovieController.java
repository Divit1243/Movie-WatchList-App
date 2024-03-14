package com.example.divit.WatchListApp.Controller;

import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.divit.WatchListApp.entity.Movie;

@RestController
public class MovieController {
	@Autowired
	@GetMapping("/watchlistItemForm")
	public ModelAndView showwatchlistForm() {
		
		String viewName = "watchlsitItemForm";
		Map<String,Object> model = new HashMap<>();
		String watchListItem = null;
		model.put(watchListItem, new Movie());
		
		return new ModelAndView(viewName,model);
	}
}
