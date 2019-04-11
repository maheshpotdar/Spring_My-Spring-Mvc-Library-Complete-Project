package com.mahesh.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mahesh.Dao.Dbconnect;
import com.mahesh.Model.BeanAdminHandle;
import com.mahesh.Model.BeanLibrarianHandle;
import com.mahesh.Model.BeanRegister;

@Controller
public class libController {

	@Autowired
	private Dbconnect dbcon;

	// jar tuzyakade class available asel tar tyavarati @compoenent liha manaje
	// spring mvc objeissuedActionct tyacha to tayar karel nasel(class nasel inbuilt
	// tar small
	// name ghya chalata like Server class(inbuilt tar server chalata.) )
	@RequestMapping("/")
	public String getIndex() {
		return "index";
	}

	@RequestMapping("/libSection")
	public String getLib() {
		return "libSection";
	}

	@RequestMapping("/adminHeader")
	public String getadminHeader() {
		return "adminHeader";
	}

	@RequestMapping("/viewissuedbooks")
	public String getviewissuedbooks(@ModelAttribute("beanLibrarian") BeanLibrarianHandle beanLibrarian,
			ModelMap modelMap) {
		System.out.println("48 LST: " + dbcon.getListofIssuedLibrarian(beanLibrarian));
		modelMap.addAttribute("listofIssuedbooks", dbcon.getListofIssuedLibrarian(beanLibrarian));
		return "viewIssuedbooks";
	}

	@RequestMapping("/register")
	public String getRegister(@Valid @ModelAttribute("beanRegister") BeanRegister beanRegister, ModelMap modelMap) {
		modelMap.addAttribute("beanRegister", new BeanRegister(0, "", "", "", ""));
		return "register";
	}

	@RequestMapping("/registerAction")
	public String getregisterAction(@Valid @ModelAttribute("beanRegister") BeanRegister beanRegister,
			BindingResult result, ModelMap modelMap) {
		// Note==>
		// error send karatana redirect lihayacha nasata. direct => return "register";
		if (result.hasErrors()) {
			return "register";
		} else {
			int value = dbcon.insertUser(beanRegister);
			if (value > 0)// registred
				return "login";
			else
				return "failed";
		}

	}

	@RequestMapping("/failed")
	public String getFailed() {
		return "failed";
	}

	@RequestMapping("/login")
	public String getLogin(@ModelAttribute("beanRegister") BeanRegister beanRegister, ModelMap modelMap) {
		modelMap.addAttribute("beanRegister", new BeanRegister(0, "", "", "", ""));
		return "login";
	}

	@RequestMapping("/loginAction")
	public String getadminDashboard(@Valid @ModelAttribute("beanRegister") BeanRegister beanRegister,
			BindingResult bindingResult, ModelMap modelMap) {
		if (bindingResult.hasErrors()) {
			return "login";
		} else {
			if (dbcon.isValidUser(beanRegister)) {
				return "adminDashboard";
			} else {
				return "login";
			}
		}
	}

	@RequestMapping("/viewlib")
	public String getviewLib(@ModelAttribute("beanLibrarian") BeanAdminHandle beanLibrarian, ModelMap modelMap) {
		modelMap.addAttribute("listoflibs", dbcon.getListofLibrarian());
		return "viewlib";
	}

	@RequestMapping("/viewbooks")
	public String getviewbooks(@ModelAttribute("beanLibrarian") BeanAdminHandle beanLibrarian, ModelMap modelMap) {
		modelMap.addAttribute("listofbooks", dbcon.getListofBooks());
		return "viewbooks";
	}

	@RequestMapping("/adminDashboard")
	public String getadminDashboard() {
		return "adminDashboard";
	}

	@RequestMapping("/addlib")
	public String getaddLib(@ModelAttribute("beanRegister") BeanRegister beanRegister, ModelMap modelMap) {
		modelMap.addAttribute("beanRegister", new BeanRegister(0, "", "", "", ""));
		return "addlib";
	}

	@RequestMapping("/deletelib/{userId}")
	public String getdeleteLib(@ModelAttribute("beanLibrarian") BeanAdminHandle beanLibrarian, ModelMap modelMap,
			@PathVariable("userId") int userId) {
		int retval = dbcon.deleteLib(userId);
		if (retval > 0)
			return "redirect:/viewlib";
		else
			return "redirect:/failed";
	}

	@RequestMapping("/deletebook/{userId}")
	public String getdeleteBook(@ModelAttribute("beanLibrarian") BeanLibrarianHandle beanLibrarian, ModelMap modelMap,
			@PathVariable("userId") int userId) {
		int retval = dbcon.deletebook(userId);
		if (retval > 0)
			return "redirect:/viewbooks";
		else
			return "redirect:/deletebook";
	}

	@RequestMapping("/editlibs/{id}")
	public String geteditLib(@ModelAttribute("beanAdminHandle") BeanAdminHandle beanAdminHandle, ModelMap modelMap,
			@PathVariable("id") int id) {
		// baherun id alela ahe so forfully setter and access there variable.
		BeanAdminHandle beanAdminHandle2 = dbcon.getEditlib(id);
		beanAdminHandle2.setId(id);
		modelMap.addAttribute("beanAdminHandle2", beanAdminHandle2);
		return "editlibs";
	}

	@RequestMapping("/logout")
	public String getLogout() {
		return "logout";
	}

	@RequestMapping("/success")
	public String getSuccess() {
		return "success";
	}

	@RequestMapping("/addlibAction")
	public String addlibAction(@Valid @ModelAttribute("beanAdminHandle") BeanAdminHandle beanAdminHandle,
			BindingResult result, ModelMap modelMap) {
		if (result.hasErrors()) {
			return "redirect:/failed";
		} else {
			boolean insvalue = dbcon.insertLibAction(beanAdminHandle);
			if (insvalue) {
				return "redirect:/viewlib";
			} else {
				return "redirect:/failed";
			}
		}

	}

	@RequestMapping("/addbook")
	public String getaddbook(@ModelAttribute("librarianHandle") BeanLibrarianHandle librarianHandle,
			ModelMap modelMap) {
		modelMap.addAttribute("librarianHandle", librarianHandle);
		return "addbook";
	}

	@RequestMapping("addbookAction")
	public String getaddbookAction(@Valid @ModelAttribute("librarianHandle") BeanLibrarianHandle librarianHandle,
			BindingResult result, ModelMap modelMap) {
		if (result.hasErrors()) {
			return "redirect:/addbook";
		} else {
			int insvalue = dbcon.insertbookAction(librarianHandle);
			if (insvalue > 0) {
				return "redirect:/viewbooks";
			} else
				return "redirect:/addbook";
		}
	}

	@RequestMapping(value = "/updatelibs/{userId}", method = RequestMethod.POST)
	public String UpdateEmpFormAction(@PathVariable("userId") int userId,
			@ModelAttribute("beanAdminHandle") BeanAdminHandle beanAdminHandle, ModelMap modelMap) {
		int val = dbcon.updateLib(beanAdminHandle, userId);
		if (val > 0)
			return "redirect:/viewlib";
		else
			return "redirect:/failed";
	}

	@RequestMapping("/booksreturn")
	public String getviewReturnbooks(@ModelAttribute("beanLibrarian") BeanAdminHandle beanLibrarian,
			ModelMap modelMap) {
		modelMap.addAttribute("beanLibrarian", beanLibrarian);
		return "viewissuedbooks";
	}

	@RequestMapping("/issuebooks")
	public String getissuebooks(@ModelAttribute("beanLibrarianHandle") BeanLibrarianHandle beanLibrarianHandle,
			ModelMap modelMap) {
		modelMap.addAttribute("beanLibrarianHandle", beanLibrarianHandle);
		return "issuebooks";
	}

	@RequestMapping("/returnbook")
	public String getreturnbookAction(@ModelAttribute("beanLibrarian") BeanAdminHandle beanLibrarian,
			ModelMap modelMap) {
		modelMap.addAttribute("beanLibrarian", new BeanLibrarianHandle("", "", "", "", "", 0, "", 0, 0, 0));
		return "returnbook";
	}

	@RequestMapping("/booksreturnAction")
	public String getissuedReturnAction(@Valid @ModelAttribute("librarianHandle") BeanLibrarianHandle librarianHandle,
			BindingResult result, ModelMap modelMap) {
		if (result.hasErrors()) {
			return "returnbook";
		} else {
			int insvalue = dbcon.issuereturnbookAction(librarianHandle);
			if (insvalue > 0) {
				boolean retvalue = dbcon.updateRetBooks(librarianHandle);
				if (retvalue) {
					return "redirect:/viewissuedbooks";
				} else {
					return "redirect:/returnbook";
				}

			} else
				return "redirect:/returnbook";
		}
	}

	@RequestMapping("/issuedAction")
	public String getissuedAction(@Valid @ModelAttribute("librarianHandle") BeanLibrarianHandle librarianHandle,
			BindingResult result, ModelMap modelMap) {
		if (result.hasErrors()) {
			return "issuebooks";
		} else {
			int insvalue = dbcon.issuebookAction(librarianHandle);
			// inserted issue book
			if (insvalue > 0) {
				boolean upBook = dbcon.updateviewBook(librarianHandle);
				if (upBook) {
					// issued success
					return "redirect:/viewissuedbooks";
				} else {
					// failed
					return "redirect:/issuebooks";
				}
			} else {
				return "redirect:/issuebooks";
			}
		}
	}
}
