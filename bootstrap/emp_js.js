 "use strict"
  function validate_form() {

  
       
			if (document.emp.email.value == "") {

                alert("email is required");
                return false;
            }

            if (document.emp.psw.value == "") {
                alert("password is required");
                return false;
            }

            //alert("sucessfully Submitted");
			 if (document.emp.pswr.value == "") {
                alert(" repeat password is required");
                return false;
            }
           
            if (!(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/).test(document.emp.email.value)) {
                alert("You have entered an invalid email address!")
                return false;
            }
			
        }//function
 
     function isNumberKey(evt) {
            var charCode = (evt.which) ? evt.which : event.keyCode;
            if (charCode != 46 && charCode > 31 &&
                (charCode < 48 || charCode > 57)) {
                alert("Enter Number Only boss");
                return false;
            }
            return true;
        }