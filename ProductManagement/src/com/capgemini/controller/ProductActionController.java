package com.capgemini.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.beans.Product;
import com.capgemini.exception.ProductException;
import com.capgemini.services.ProductService;




@Controller
public class ProductActionController {
	
	@Autowired(required=true)
	private ProductService productServices;
	
	@RequestMapping(value="/registerProduct",method=RequestMethod.POST)
	public ModelAndView registerProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) throws ProductException {
		try {
		product =productServices.acceptProductDetails(product);
		ModelAndView modelAndView = new ModelAndView("registrationSuccessPage", "product", product);
		return modelAndView;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("errorPage");
	}
	
	//for getting all product Details
	
	@RequestMapping(value="/viewPage",method=RequestMethod.GET)  
    public ModelAndView viewProduct() throws ProductException  { 
        List<Product> list=productServices.getAllProductDetails();
        ModelAndView modelAndView = new ModelAndView("viewPage","list",list);
		return modelAndView;  
    } 
	
	
	//For Updating
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)  
    public ModelAndView edit(@PathVariable int id){  
		try {
			Product product = productServices.getProductDetails(id);
			return new ModelAndView("update","command",product);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        return new ModelAndView("errorPage");
	
	}
	
	//After updating to save the entities
	
	@RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public ModelAndView editsave(@ModelAttribute("product") Product product){  
        try {
			product=productServices.acceptFacultyDetails(product);
		} catch (Exception e) {
			e.printStackTrace();
		}  
        return new ModelAndView("redirect:/viewPage");  
    }
}
