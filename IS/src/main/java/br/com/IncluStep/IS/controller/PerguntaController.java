package br.com.IncluStep.IS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.IncluStep.IS.dto.RequisicaoNovoPessoa;
import br.com.IncluStep.IS.model.Pessoa;
import br.com.IncluStep.IS.repository.PessoaRepository;

@RestController
@RequestMapping("/pergunta")
public class PerguntaController {

	@Autowired
	private PessoaRepository pessoaRepository;

	@GetMapping("/formulario")
	public ModelAndView formulario() {
		ModelAndView mv = new ModelAndView("pergunta/formulario");
		return mv;

	}

	@PostMapping("/novo")
	public ModelAndView novo(RequisicaoNovoPessoa requisicao) {
		Pessoa pergunta = new Pessoa(requisicao);
		pessoaRepository.save(pergunta);
		ModelAndView mv = new ModelAndView("redirect:/home");
		return mv;

	}

}
