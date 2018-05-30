"use script"
  function validate_form() {
       alert("hiii");
	/*		if (document.emp.email.value == "") {
                alert("Please fill in the 'Your Employee Name' box.");
                return false;
            }

            if (document.emp.pwd.value == "") {
                alert("Enter Employee Number");
                return false;
            }

            //alert("sucessfully Submitted");
			 if (document.emp.pwd-password.value == "") {
                alert("Enter Employee  Email");
                return false;
            }
           
            if (!(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/).test(document.emp.email.value)) {
                alert("You have entered an invalid email address!")
                return false;
            }  */
			
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