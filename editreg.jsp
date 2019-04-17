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
                      <th>branch</th>
                      <th>name</th>
                      <th>Edit</th>
                     
                      
                    </tr>
                  </thead>
                  <tfoot>
                    <tr>
                      <th>Faculty name</th>
                      <th>branch</th>
                      <th>name</th>
                      <th>Edit</th>
                    </tr>
                  </tfoot>
                  <tbody>
                    
                   <%
                 
        		  try{
        			  Class.forName("com.mysql.jdbc.Driver");
        			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost/knowledgegraph","root","root");
        			  Statement st=con.createStatement();
        			  ResultSet rs=st.executeQuery("SELECT *from register");
        			  while(rs.next()){
        				  
        			
        			 
        				  %>
        				    <form action="editreg1.jsp" mehode="post">
        				  
        				  <tr>
        				  <td><%=rs.getString(1) %></td>
        				   <td><%=rs.getString(4) %></td>
        				    <td><%=rs.getString(9) %></td>
        				     <input type="hidden" name="name" value='<%=rs.getString(1)%>'></input>
        				     <td><input type="submit" class="btn" value="edit"></input></td>
        				     
        				  </tr>
        				 </form>
                      
                     
                                    	  <% 
        			  }
        			  
        		  }
        		  catch(Exception e){
        			  e.printStackTrace();
        		  }
                   %>
                                    
                  
      
                 </table>
        		  </div>
        		  </div>
        		  </div>

  
                            </div>

                        </div>
                    </div>
                </div>
</div>