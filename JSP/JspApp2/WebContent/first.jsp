<%@page import="java.util.*"%>

<%! public String  generateWishMsg(String name){
       int hour=0;
       String msg=null;
      Calendar calendar=null;
      
        //get Sys Date
        calendar=Calendar.getInstance();
        //get hour (24hrs)
        hour=calendar.get(Calendar.HOUR_OF_DAY);
        //geneate wish msg
        if(hour<=12)
          msg="GM:"+name;
         else if(hour<=16)
          msg="GA:"+name;
          else if(hour<=20)
          msg="GE:"+name;
          else
          msg="GN:"+name;
          return msg;
          } %>
<!--   <h1><center> welcome </center></h1> <br> -->
  <br> sys Date:: <%--<%=new java.util.Date() --%>
  <% String name="raja1"; %> <br>
  Wish Msg :: <%=generateWishMsg(name) %>
  <br><br>
  request obj class name: <%=request.getClass() %>
    <br><br>
   out object class name : <%=out.getClass() %>
  