package com.simpleproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.simpleproject.model.WarehousesModel;
import com.simpleproject.repository.WarehousesRepository;

@RestController
@CrossOrigin(origins = "*")
//@CrossOrigin(origins = "http://localhost:3000") // originsに*を指定するとどのサイトからのアクセスも受け付ける
@RequestMapping("api")
public class WarehouseController {

	@Autowired
	WarehousesRepository  warehousesRepository;

	@RequestMapping(value = "/getwarehouses", method = RequestMethod.GET)
	@ResponseBody
	public WarehousesModel getProducts(Model model) {
		WarehousesModel warehousesModel = warehousesRepository.selectByPrimaryKey(2);
        return warehousesModel;
    }
}
