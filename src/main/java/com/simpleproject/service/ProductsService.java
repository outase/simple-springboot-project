package com.simpleproject.service;

import org.springframework.stereotype.Component;

import com.simpleproject.domain.Products;
import com.simpleproject.mapper.ProductsMapper;

@Component
public class ProductsService {

	private final ProductsMapper productsMapper;

	public ProductsService(ProductsMapper productsMapper) {
		this.productsMapper = productsMapper;
	}

	public Products runLogic() {
		Products newProducts = new Products();
        newProducts.setName("商品１");
        newProducts.setPrice(45000);

        this.productsMapper.insert(newProducts); // 新しいProductsをインサートする

        Products loadedProducts = this.productsMapper.select(newProducts.getId()); // インサートしたProductsを取得して標準出力する
        System.out.println(loadedProducts.getId());

        return loadedProducts;
	}
}
