package com.simpleproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.simpleproject.model.ProdcutStockModel;
import com.simpleproject.model.ProductsModel;
import com.simpleproject.repository.ProductStockRepository;
import com.simpleproject.repository.ProductsRepository;

@RestController
@CrossOrigin(origins = "*")
//@CrossOrigin(origins = "http://localhost:3000") // originsに*を指定するとどのサイトからのアクセスも受け付ける
@RequestMapping("api")
public class ProductController {

	@Autowired
	ProductsRepository  productsRepository;

	@RequestMapping(value = "/getproducts", method = RequestMethod.GET)
	@ResponseBody
	public ProductsModel getProducts(Model model) {
		ProductsModel productsModel = productsRepository.selectByPrimaryKey(2);
        return productsModel;
    }

	@Autowired
	ProductStockRepository  productStockRepository;

	@RequestMapping(value = "/getproductstock", method = RequestMethod.GET)
	@ResponseBody
	public ProdcutStockModel getProductstock(Model model) {
		ProdcutStockModel productStockModel = productStockRepository.selectByPrimaryKey(1, 2);
        return productStockModel;
    }
}
