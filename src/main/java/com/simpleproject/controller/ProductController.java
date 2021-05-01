package com.simpleproject.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.simpleproject.domain.Products;
import com.simpleproject.service.ProductsService;

@RestController
@CrossOrigin(origins = "*")
//@CrossOrigin(origins = "http://localhost:3000") // originsに*を指定するとどのサイトからのアクセスも受け付ける
@RequestMapping("api")
public class ProductController {

	private final ProductsService productsService;

	public ProductController(ProductsService productsService) {
		this.productsService = productsService;
	}

	@RequestMapping(value = "/gettest/{testid}/{testname}", method = RequestMethod.GET)
	@ResponseBody
	public String getTest(
			@PathVariable("testid") String testId
			,@PathVariable("testname") String testName
			,@RequestHeader(value="Content-Type", required=false) String type
			,@RequestParam("id") String id
			,@RequestParam("val") String val
			) {
		System.out.print(val + " " + type);

		Products products = this.productsService.runLogic();

        return testId + " " + testName + " " + products.getName();
    }

	@RequestMapping(value = "/posttest", method = RequestMethod.POST)
	@ResponseBody
	public String postTest(
			@RequestHeader(value="Content-Type", required=false) String type
			,@RequestBody String body
			) {
		System.out.print(body);
        return body;
    }
}
