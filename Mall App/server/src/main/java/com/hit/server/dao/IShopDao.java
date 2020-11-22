package com.hit.server.dao;

import java.io.IOException; 

import com.hit.server.dm.Shop;

import com.hit.algorithm.*;

public interface IShopDao {

	Graph<Shop> getGraph() throws Exception;

	Shop getShopByName(String name) throws Exception;

	//void createShopConnection(Shop from, Shop to) throws Exception;

	void insertGraph(Graph<Shop> graph) throws Exception;
	
	void insertConnection(Shop shopFrom,Shop shopTo) throws Exception;
	
	void updateShop(String name, int deals) throws Exception;

//	void deleteShop(String name) throws Exception;

}
