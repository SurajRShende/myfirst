package com.action;

import com.Db.dao;
import com.form.insertform;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class in extends Action {



    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {


        insertform m = (insertform) form;

        String name = m.getFirstName();
        String lname=m.getLastName();

        dao d1 = new dao();
        int a = d1.insertdata(name,lname);


        request.setAttribute("NAME",name);
        request.setAttribute("lNAME",lname);


        if (a <1) {
            return mapping.findForward("fail");
        }
        else {
            return mapping.findForward("success");
        }
    }
}
