package slidenerd.vivz.gpdemo.rest;

import java.util.Map;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.QueryMap;
import slidenerd.vivz.gpdemo.model.CoffeeShops;

/**
 * Created by vivz on 24/08/15.
 */
public interface GooglePlacesService {
    @GET("/maps/api/place/nearbysearch/json")
    void getCafes(@QueryMap Map<String, String> options, Callback<CoffeeShops> callback);
}
