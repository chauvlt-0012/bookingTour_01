package app.service;

import java.util.List;


import app.model.Tours;

public interface ToursService  extends  BaseService<Integer, Tours> {
	boolean deleteTours(Integer id);
	List<Tours> loadTours(Integer offset,Integer maxResults);
	List<Tours> loadTours();
	long count();
	List<Tours> loadSaleOffTours();
	Tours maxSaleOffTours();
}