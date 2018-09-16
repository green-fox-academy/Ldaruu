function Validate() {
    var password = document.getElementById("password").value;
    var confirmPassword = document.getElementById("passwordConfirmation").value;
    if (password != confirmPassword) {
        alert("Passwords do not match.");
        return false;   // Not needed!!
    }
    return true;   // Not really needed!!
}