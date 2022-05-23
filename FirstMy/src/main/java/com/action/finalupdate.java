package com.action;

import com.Db.dao;
import com.form.insertform;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class finalupdate extends Action {


    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {


        dao d1=new dao();
        insertform f=(insertform) form;
//        String name=request.getParameter("firstName");
//        String lname=request.getParameter("lastName");
        System.out.println(f.getFirstName());
        System.out.println(f.getLastName());
        int a=d1.update(f.getFirstName(),f.getLastName());


        return mapping.findForward("success");


    }





}
