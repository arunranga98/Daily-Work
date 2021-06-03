package com.example.controller;

import java.util.Arrays; 
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.model.Policy;
import com.example.model.Register;
import com.example.service.PolicyBO;

@Controller
public class LoginController {

	@Autowired
	PolicyBO policybo;

	public String userid = "";
	public String username = "";

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String login() {
		return "login";

	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(@ModelAttribute("registersubmit") Register registersubmit) {

		return "register";
	}

	@RequestMapping(value = "/registersubmit", method = RequestMethod.POST)
	public String registersubmit(@Valid @ModelAttribute("registersubmit") Register registersubmit, BindingResult result,
			ModelMap model) {
		if (result.hasErrors()) {
			return "register";
		}
		try {
			policybo.registerentry(registersubmit);
		} catch (Exception e) {
			model.addAttribute("msg", "Invalid mobile number,this mobile number already registered");
			return "register";
		}
		return "redirect:/index";
	}

	@RequestMapping(value = "/loginsubmit", method = RequestMethod.POST)
	public String loginSubmit(@RequestParam String mobileno, @RequestParam String password, ModelMap model,
			RedirectAttributes rtr) {
		try {
			Register register = policybo.getobject(mobileno);
			if (register.getPassword().equals(password)) {
				userid = register.getMobileno();
				username = register.getName();
				
				model.addAttribute("username","Welcome "+username);
				return "home";
			} else {
				rtr.addFlashAttribute("hint","Password hint:"+register.getPasshint());				
				rtr.addFlashAttribute("msg", "Invalid Login Credentials");
				return "redirect:/index";
			}

		} catch (Exception e) {
			rtr.addFlashAttribute("msg", "Invalid Login Credentials");
			return "redirect:/index";
		}

	}

	@RequestMapping(value = "/addpolicy", method = RequestMethod.GET)
	public String addpolicy(@ModelAttribute("addpolicy") Policy addpolicy, ModelMap model) {
		model.addAttribute("policyname",
				Arrays.asList(new String[] { "Jeevan Anand", "Jeevan Mithra", "Child Plan", "Health Plan" }));
		model.addAttribute("policytype", Arrays.asList(new String[] { "Monthly", "Yearly" }));
		return "addpolicy";
	}

	@RequestMapping(value = "/addpolicy", method = RequestMethod.POST)
	public String addingpolicy(@Valid @ModelAttribute("addpolicy") Policy addpolicy, BindingResult result,
			ModelMap model, RedirectAttributes rtr) {
		if (result.hasErrors()) {
			model.addAttribute("policyname",
					Arrays.asList(new String[] { "Jeevan Anand", "Jeevan Mithra", "Child Plan", "Health Plan" }));
			model.addAttribute("policytype", Arrays.asList(new String[] { "Monthly", "Yearly" }));
			return "addpolicy";
		}

		addpolicy.setUserid(userid);
		addpolicy.setUsername(username);
		try {
			policybo.addthispolicy(addpolicy);
		} catch (Exception e) {
			rtr.addFlashAttribute("msg", "Invalid policy id");
			return "redirect:/addpolicy";
		}
        model.addAttribute("msg","your policy is successfully added check it on show policy");
		return "home";
	}

	@RequestMapping(value = "/showpolicy", method = RequestMethod.GET)
	public ModelAndView showpolicy() {
		ModelAndView mv = new ModelAndView("showpolicy");
		List<Policy> pol = policybo.showpolicy(userid);

		mv.addObject("pol", pol);
		return mv;
	}

	@RequestMapping(value = "/editpolicy", method = RequestMethod.GET)
	public String editpolicy() {
		return "editpolicy";
	}

	@RequestMapping(value = "/editpolicy", method = RequestMethod.POST)
	public String editingpolicy(@RequestParam("policyid") String policyid, ModelMap model, RedirectAttributes rtr) {

		try {
			Policy policy = policybo.retrive(policyid, userid);
			model.addAttribute("updatepolicy", policy);
		} catch (Exception e) {
			rtr.addFlashAttribute("msg", "Invalid policy id");
			return "redirect:/editpolicy";
		}

		model.addAttribute("policyname",
				Arrays.asList(new String[] { "Jeevan Anand", "Jeevan Mithra", "Child Plan", "Health Plan" }));
		model.addAttribute("policytype", Arrays.asList(new String[] { "Monthly", "Yearly" }));

		return "updatepolicy";
	}

	@RequestMapping(value = "/updatepolicy", method = RequestMethod.POST)
	public String updatingpolicy(@Valid @ModelAttribute("updatepolicy") Policy policy, BindingResult br,ModelMap model,
			RedirectAttributes rtr) {
		if (br.hasErrors()) {
			
			model.addAttribute("policyname",
					Arrays.asList(new String[] { "Jeevan Anand", "Jeevan Mithra", "Child Plan", "Health Plan" }));
			model.addAttribute("policytype", Arrays.asList(new String[] { "Monthly", "Yearly" }));


			return "updatepolicy";
		}

		policy.setUserid(userid);
		policy.setUsername(username);

		policybo.deletepolicy(policy.getPolicyid(), userid);
		policybo.addthispolicy(policy);
		model.addAttribute("msg","your policy is successfully updated check it on show policy");
		return "home";
	}

	@RequestMapping(value = "/deletepolicy", method = RequestMethod.GET)
	public String deletepolicy() {
		return "deletepolicy";
	}

	@RequestMapping(value = "/deletepolicy", method = RequestMethod.POST)
	public String deletingpolicy(@RequestParam("policyid") String policyid, ModelMap model) {

		if (policybo.deletepolicy(policyid, userid)) {
			model.addAttribute("msg","your policy is successfully deleted check it on show policy");
			return "home";
		}
		model.addAttribute("msg", "Invalid policy id");
		return "deletepolicy";

	}
	
	@RequestMapping(value = "/gohome", method = RequestMethod.GET)
	public String gohome() {
		return "home";

	}
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout() {
		return "login";

	}

}
