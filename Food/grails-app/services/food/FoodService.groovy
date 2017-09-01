package food


import com.google.gson.*;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

import com.fatsecret.platform.services.FatsecretService;
import com.fatsecret.platform.model.CompactFood;
import java.util.List;

class FoodService{

def t

	def void similar(String query) {
		def key = "991b83c9acfd4f6bb8f4762b7cd70daf"
		def secret = "c5fe4a17e9d645a398797051579c71f6"
		FatsecretService service = new FatsecretService(key, secret)
		
		
		def response = service.searchFoods(query)
		//This response contains the list of food items at zeroth page for your query
		
		def results = response.getResults()
		//This list contains summary information about the food items
		
		def responseAtPage3 = service.searchFoods(query, 3)
		//This response contains the list of food items at page number 3 for your query
		//If total results are less, then this response will have empty list of the food items		
	}
	

}