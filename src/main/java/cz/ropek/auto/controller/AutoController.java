package cz.ropek.auto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.validation.BindingResult;

import javax.servlet.http.HttpServletRequest;

import cz.ropek.auto.entity.Auto;
import cz.ropek.auto.service.AutoService;

import javax.validation.Valid;

@Controller
public class AutoController {

	@Autowired
	private AutoService autoService;

	@GetMapping("/list")
	public String listAuto(Model theModel) {

		List<Auto> auto = autoService.findAll();

		theModel.addAttribute("autos", auto);

		return "list";
	}

	@RequestMapping(value = "/delete")
	public String deleteAuto(HttpServletRequest getId, Model model) {

		Auto auto = autoService.findById(Integer.parseInt(getId.getParameter("Id")));

		model.addAttribute("autos", auto);

		return "delete";
	}

	@RequestMapping(value = "/deleteConfirmed")
	public String deleteConfirmed(HttpServletRequest getId) {

		autoService.deleteById(Integer.parseInt(getId.getParameter("Id")));

		return "redirect:/list";
	}

	@PostMapping("/addAuto")
	public String addAuto(@Valid @ModelAttribute("auto") Auto auto, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			return "add";
		} else {

			autoService.save(auto);

			return "redirect:/list";
		}
	}

	@PostMapping("/uptAuto")
	public String uptAuto(@Valid @ModelAttribute("auto") Auto auto, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			return "update";
		} else {

			autoService.save(auto);

			return "redirect:/list";
		}
	}

	@RequestMapping(value = "/add")
	public String add(Model model) {
		Auto auto = new Auto();
		model.addAttribute("auto", auto);

		return "add";
	}

	@RequestMapping(value = "/update")
	public String updateAuto(HttpServletRequest getId, Model model) {

		Auto auto = autoService.findById(Integer.parseInt(getId.getParameter("Id")));

		model.addAttribute("auto", auto);

		return "update";
	}

}
