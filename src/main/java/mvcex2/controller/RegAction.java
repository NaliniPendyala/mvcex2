package mvcex2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import mvcex2.model.UserDetails;
import mvcex2.service.UserDetService;


public class RegAction extends DispatchAction {

	
	
	//@Override
	public ActionForward register(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		try {
		UserDetService uds= new UserDetService();
		UserDetails ud= (UserDetails)form;
		
		uds.saveUser(ud);
	     return mapping.findForward("success");
		}catch(Exception e) {
			return mapping.findForward("exception");
		}
		
	}
	public ActionForward login(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		try {
		UserDetService uds= new UserDetService();
		UserDetails ud= (UserDetails)form;
		
		ud = uds.validate(ud.getUsername());
	 HttpSession session= request.getSession();
	 session.setAttribute("userdetails", ud);
	     return mapping.findForward("loginsuccess");
		}catch(Exception e) {
			return mapping.findForward("loginexception");
		}
		
	}
}
