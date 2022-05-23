package com.action;

import com.Db.dao;
import com.form.insertform;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class view extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {


        dao d1 = new dao();

      ArrayList<insertform> a1=new ArrayList<>();
      a1=d1.execute();

      request.setAttribute("list",a1);


      return mapping.findForward("success");
    }
}
