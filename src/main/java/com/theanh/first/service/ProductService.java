package com.theanh.first.service;

import java.util.Map;

import com.theanh.first.model.DataTableJson;
import com.theanh.first.model.ProductModel;

public interface ProductService {
	void save(Map<String, String> customer);
	DataTableJson getListProduct(String sort, String order, int limit, int offset, String typeSearch, String textSearch);
	void delete(Integer cusId);
	ProductModel getProductById(Integer cusId);
	void edit(Map<String, String> data);
}