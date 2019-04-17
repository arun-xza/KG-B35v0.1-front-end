<%@page import="java.sql.*" %>
<link href="bootstrap/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="bootstrap/bootstrap.min.js"></script>
<script src="bootstrap/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="container">
<div class="row justify-content-center">
                    <div class="col-md-8">
                        <div class="card">
                            <div class="card-header"></div>
                            <div class="card-body">

                                <form action="assign"method="post">
          <!-- DataTables Example -->
          <div class="card mb-3">
            <div class="card-header">
              <i class="fas fa-table"></i>
              Assign Subject</div>
            <div class="card-body">
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                  <thead>
                    <tr>
                      <th>Faculty name</th>
                      <th>subject</th>
                      <th>Subject</th>
                      <th>Sem</th>
                      <th>assign</th>
                      
                    </tr>
                  </thead>
                  <tfoot>
                    <tr>
                      <th>Faculty name</th>
                      <th>branch</th>
                      <th>Subject</th>
                      <th>Sem</th>
                      <th>assign</th>
                      
                    </tr>
                  </tfoot>
                  <tbody>
                   <%
                   
        		  try{
        			  Class.forName("com.mysql.jdbc.Driver");
        			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost/knowledgegraph","root","root");
        			  Statement st=con.createStatement();
        			  ResultSet rs=st.executeQuery("SELECT *from register");
        			 
        				  %>
        				  
        				  <tr>
        				
                      
                      <td><div class="form-group">
                                       
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                               <select class="form-control" name="name">
                                               <%
                                               while(rs.next()){
                                               %>
                                               <option value='<%=rs.getString(1)%>'><%=rs.getString(1)%></option>
                                                <%} %>
                                               </select>
                                            </div>
                                        </div>
                                    </div></td>
                                    <td><div class="form-group">
                                        
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                               <select class="form-control" name="branch">
                                              <option value="ece">ECE</option>
                                                <option value="cse">CSE</option>
                                                 <option value="me">ME</option>
                                                  <option value="cv">CV</option>
                                                
                                               </select>
                                            </div>
                                        </div>
                                    </div></td>
                                    	  <% 
        			  
        		  }
        		  catch(Exception e){
        			  e.printStackTrace();
        		  }
                   %>
                                    <% 
                                    try{
        			  Class.forName("com.mysql.jdbc.Driver");
        			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost/knowledgegraph","root","root");
        			  Statement st=con.createStatement();
        			  ResultSet res=st.executeQuery("SELECT *from sub");
        			  %>
        			  <td><div class="form-group">
                                       
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                               <select class="form-control" name="sub">
                                               <%
                                               while(res.next()){
                                               %>
                                               <option value='<%=res.getString(3)%>'><%=res.getString(3)%></option>
                                                <%} %>
                                               </select>
                                            </div>
                                        </div>
                                    </div></td>
                                    
                                    <td><div class="form-group">
                                        
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                               <select class="form-control" name="sem">
                                               <option value="1">1st</option>
                                                <option value="2">2nd</option>
                                                 <option value="3">3rd</option>
                                                  <option value="4">4th</option>
                                                   <option value="5">5th</option>
                                                <option value="6">6th</option>
                                                 <option value="7">7h</option>
                                                  <option value="8">8th</option>
                                               </select>
                                            </div>
                                        </div>
                                    </div></td>
                                      <% 
        			  
        		  }
        		  catch(Exception e){
        			  e.printStackTrace();
        		  }
                   %>
                     
                        <td><input type="submit" class="btn" value="Assing"   ></input></td></tr>

         
        				
                  
      
                 </table>
        		  </div>
        		  </div>
        		  </div>

  </form>
                            </div>

                        </div>
                    </div>
                </div>
</div>