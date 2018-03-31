package com.cmr.scratch.gcs;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
   name = "HelloAppEngine",
    urlPatterns = {"/hello"}
)

public class HelloAppEngine extends HttpServlet {

	private static final long serialVersionUID = -831988846882785069L;

@Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
      
    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");

    response.getWriter().print("Hello App Engine!\r\n");

  }
}