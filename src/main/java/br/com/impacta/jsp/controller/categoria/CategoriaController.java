package br.com.impacta.jsp.controller.categoria;

import br.com.impacta.jsp.model.Categorias;
import br.com.impacta.jsp.service.CategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {


    @Autowired
    private CategoriasService categoriasService;

    @GetMapping
    public ModelAndView getCategoria(){
        ModelAndView modelAndView = new ModelAndView("cadastro/cadastro-categoria");
        modelAndView.addObject("categoria", new Categorias());
        return modelAndView;
    }


    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ModelAndView salvarCategoria(
            @Valid @ModelAttribute("categoria")Categorias categorias,
            Errors errors){

        ModelAndView modelAndView =
                new ModelAndView("cadastro/cadastro-categoria");

        if(errors.hasErrors()){
            return modelAndView;
        }


        categoriasService.salvar(categorias);
        modelAndView.addObject("mensagem", "Despesa salva");
        return modelAndView;
    }

    postgres://fyrsiqtzjzfycf:51a5f1a6d68a804bc86d9c026f06acc82d1c29ef50ef6825061208c32357193a@ec2-44-198-82-71.compute-1.amazonaws.com:5432/d6s0q1blsmh8lf
}