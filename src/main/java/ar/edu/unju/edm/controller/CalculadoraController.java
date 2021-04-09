package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Calculadora;


@Controller

public class CalculadoraController {
	
	@Autowired
	Calculadora unaCalculadora;
	
	@GetMapping("/calculadora")
	public String getMenuCalculadora() {
		return("calculadora");
	}
	
	@GetMapping("/calculoSuma")
	public ModelAndView getCalculoSuma(@RequestParam (name = "num1") String num1 , @RequestParam (name = "num2") int num2){
		
		
		unaCalculadora.setNum1(Integer.valueOf(num1));
		unaCalculadora.setNum2(num2);
		
		int resultadoSuma = unaCalculadora.sumar();
		
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoSuma", resultadoSuma);
		
		return modelView;		
	}
	@GetMapping("/calculoResta")
	public ModelAndView getCalculoResta(@RequestParam (name = "num1") String num1 , @RequestParam (name = "num2") int num2) {
		
	
		unaCalculadora.setNum1(Integer.valueOf(num1));
		unaCalculadora.setNum2(num2);
		
		int resultadoResta = unaCalculadora.restar();
		
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoResta", resultadoResta);
		
		return modelView;
	}
	@GetMapping("/calculoMultiplicacion")
	public ModelAndView getCalculoMultiplicacion(@RequestParam (name = "num1") String num1 , @RequestParam (name = "num2") int num2) {
		
	
		unaCalculadora.setNum1(Integer.valueOf(num1));
		unaCalculadora.setNum2(num2);
		
		int resultadoMultiplicar = unaCalculadora.multiplicar();
		
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoMultiplicacion", resultadoMultiplicar);
		
		return modelView;
	}
	@GetMapping("/calculoDividir")
	public ModelAndView getCalculoDividir(@RequestParam (name = "num1") String num1 , @RequestParam (name = "num2") int num2) {
		
	
		unaCalculadora.setNum1(Integer.valueOf(num1));
		unaCalculadora.setNum2(num2);
		
		int resultadoDivision = unaCalculadora.dividir();
		
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoMultiplicacion", resultadoDivision);
		
		return modelView;
}
}
