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

                                <form class="form-horizontal" method="post" action="facaltyreg">

                                    <div class="form-group">
                                        <label for="name" class="cols-sm-2 control-label">Faculty Name</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="name" id="name" placeholder="Enter your Name" />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="email" class="cols-sm-2 control-label"> Email</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="email" id="email" placeholder="Enter your Email" />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="username" class="cols-sm-2 control-label">Address</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                                                <textarea  class="form-control" name="address" id="username" placeholder="Enter your Address" ></textarea>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="password" class="cols-sm-2 control-label">Branch</label>
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
                                    </div>
                                    <div class="form-group">
                                        <label for="confirm" class="cols-sm-2 control-label">Sem</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="sem" id="confirm" placeholder="Enter Semister" />
                                            </div>
                                        </div>
                                    </div>
                                     <div class="form-group">
                                        <label for="confirm" class="cols-sm-2 control-label">SSLC Percentage</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="sslc" id="confirm" placeholder="SSLC Percentage" />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="confirm" class="cols-sm-2 control-label">PUC Percentage</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="puc" id="confirm" placeholder="PUC Percentage" />
                                            </div>
                                        </div>
                                    </div>
                                     <div class="form-group">
                                        <label for="confirm" class="cols-sm-2 control-label">UG Percentage</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="ug" id="confirm" placeholder="UG Percentage" />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="confirm" class="cols-sm-2 control-label">PG Percentage</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="pg" id="confirm" placeholder="pg Percentage" />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group ">
                                        <input type="Submit" class="btn btn-primary btn-lg btn-block login-button">Submit</input>
                                    </div>
                                    <div class="login-register">
                                        
                                    </div>
                                </form>
                            </div>

                        </div>
                    </div>
                </div>
</div>