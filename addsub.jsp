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

                                <form class="form-horizontal" method="post" action="addsub">

                                   
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
                                        <label for="confirm" class="cols-sm-2 control-label">Subject</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="subject" id="confirm" placeholder="Add subject" />
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