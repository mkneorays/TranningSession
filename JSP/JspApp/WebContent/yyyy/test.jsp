
<%!
  public void jspInit(){  
     ServletConfig cg=getServletConfig();
     System.out.println("db user init param value  "
                                         +cg.getInitParameter("dbuser"));
     }
    %>
    
    <%=request.getParameter("name") %>
    
    <a href="pages/home.html">home</a>