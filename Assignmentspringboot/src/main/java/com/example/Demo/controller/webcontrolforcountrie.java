package com.example.Demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Demo.Serviceimpl.Countreserimpl;
import com.example.Demo.model.Countries;

@Controller
public class webcontrolforcountrie {
	@Autowired
	Countreserimpl impl;
	@GetMapping("/loadfor")
	public String add(Model model)
	{
		Countries c=new Countries();
		model.addAttribute("frm", c);
		return "home";
	}
	
	@PostMapping("/stdform")
	public String adfrm(Model model , @ModelAttribute("frm") Countries countries )
	{
		impl.add(countries);
		return "redirect:/loadfor";
	}
	@GetMapping("/dis")
	public String dis(Model model)
	{
		List<Countries> m=impl.show();
		model.addAttribute("frm", m);
		return "display";
	}
}
