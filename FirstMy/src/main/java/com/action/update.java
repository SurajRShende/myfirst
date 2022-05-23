package com.action;

import com.Db.dao;
import com.form.insertform;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class update extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {


        dao d1 = new dao();

       insertform FForm= d1.updatedata(request.getParameter("firstName"));


        request.setAttribute("fname",FForm.getFirstName());
        request.setAttribute("lname",FForm.getLastName());

        return mapping.findForward("success");
    }


}
