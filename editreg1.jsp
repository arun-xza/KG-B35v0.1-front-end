<%@page import="java.sql.*" %>
<link href="bootstrap/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="bootstrap/bootstrap.min.js"></script>
<script src="bootstrap/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->



                               
                                 <%
                  String name=request.getParameter("name");
                   System.out.println(name);
                   
        		  try{
        			  Class.forName("com.mysql.jdbc.Driver");
        			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost/knowledgegraph","root","root");
        			  Statement st=con.createStatement();
        			  ResultSet rs=st.executeQuery("SELECT *from register where name='"+name+"'");
        			  while(rs.next()){
        				  %>
        			  }
        				 <div class="container">
<div class="row justify-content-center">
                    <div class="col-md-8">
                        <div class="card">
                            <div class="card-header"></div>
                            <div class="card-body">

                                <form class="form-horizontal" method="post" action="editreg">

                                    <div class="form-group">
                                        <label for="name" class="cols-sm-2 control-label">Faculty Name</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="name" id="name" value='<%=rs.getString(1) %>' />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="email" class="cols-sm-2 control-label"> branch</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="branch" id="email" value='<%=rs.getString(4) %>' />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="email" class="cols-sm-2 control-label"> sem</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="sem" id="email" value='<%=rs.getString(9) %>' />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group ">
                                        <input type="Submit" class="btn btn-primary btn-lg btn-block login-button"></input>
                                    </div>
                                    <div class="login-register">
                                        
                                    </div>
                                </form>
                            </div>

                        </div>
                    </div>
                </div>
</div>
                                <%
        		  }
    			  
    		  }
    		  catch(Exception e){
    			  e.printStackTrace();
    		  }
               %>
                           