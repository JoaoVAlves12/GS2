package br.com.IncluStep.IS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.IncluStep.IS.model.Pessoa;
import br.com.IncluStep.IS.repository.PessoaRepository;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private PessoaRepository pessoaRepository;

	@GetMapping
	public ModelAndView home() {
		List<Pessoa> pessoas = pessoaRepository.findAll();
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("pessoas", pessoas);
		return mv;

	}

}
