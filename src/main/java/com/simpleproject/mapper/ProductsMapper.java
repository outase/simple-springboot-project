package com.simpleproject.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.simpleproject.domain.Products;

@Mapper
public interface ProductsMapper {
	void insert(Products products);
	Products select(int id);
}
