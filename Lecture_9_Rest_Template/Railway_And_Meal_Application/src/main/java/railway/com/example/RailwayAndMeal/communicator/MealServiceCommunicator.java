package railway.com.example.RailwayAndMeal.communicator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import railway.com.example.RailwayAndMeal.Entity.Meal;

@Service
public class MealServiceCommunicator {
	
	private final RestTemplate restTemplate;
	String baseURL = "http://localhost:8081/pantry";


	@Autowired
	MealServiceCommunicator(RestTemplateBuilder restTemplateBuilder){
		restTemplate = restTemplateBuilder.build();
	}

	public Meal getMealByPnr(long pnr) {
		String url = baseURL + "/meal/" + pnr;
		ResponseEntity<Meal> mealResponse =restTemplate.getForEntity(url, Meal.class);
		return mealResponse.getBody();
	}
	
}
