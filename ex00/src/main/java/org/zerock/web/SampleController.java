/*
 *  [기초적인 컨트롤러 생성 실습 ]
 * 
 */
package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.domain.ProductVO;

@Controller
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("doA")
	public void doA() {
		logger.info("doA called............");
	}
	
	@RequestMapping("doB")
	public void doB() {
		logger.info("doB called............");
	}
	
	@RequestMapping()
	public String doC( @ModelAttribute("msg") String msg) {
		logger.info("doC called............");
		
		return "result";
	}
	
	@RequestMapping("/doD")
	public String doD(Model model) {
		
		ProductVO product = new ProductVO("Sample Product", 10000);
		logger.info("doD");
		model.addAttribute(product);
		
		return "productDetail";		
	}
}
