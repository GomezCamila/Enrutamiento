package com.camila.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController


public class dojoController {


    @RequestMapping("/{dojo}")
    public String showPaths(@PathVariable String dojo){
        return "¡El " + dojo + " es increible!";
    }
		@RequestMapping("/burbank-dojo")
		public String burBank() {
			
				 return "El Dojo Burbank está localizado al sur de California";
			 }
			@RequestMapping("/san-jose")
			public String lugar() {
				 return "El Dojo SJ es el cuartel general";
			}	
	

	
	public dojoController() {
	}

}
