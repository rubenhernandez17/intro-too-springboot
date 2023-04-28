function validateForm() {
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
  
    // Check if the name field is empty.
    if (name == "") {
      alert("Please enter your name.");
      return false;
    }
  
    // Check if the email field is empty.
    if (email == "") {
      alert("Please enter your email address.");
      return false;
    }
  
    // Check if the email address is valid.
    var re = /^[a-zA-Z0-9.!#$%&'*+\/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
    if (!re.test(email)) {
      alert("Please enter a valid email address.");
      return false;
    }
  
    // Everything is valid, so return true.
    return true;
  }
  