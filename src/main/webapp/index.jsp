<!DOCTYPE html>
<html>
<head>
<title>User Form</title>

<script>
function validate() {
    let name = document.forms["f"]["username"].value;
    let email = document.forms["f"]["email"].value;
    let desig = document.forms["f"]["designation"].value;

    if (name == "" || email == "" || desig == "") {
        alert("All fields are required!");
        return false;
    }
    return true;
}
</script>

</head>
<body>

<h2>User Form</h2>

<form name="f" action="UserDataServlet" method="post" onsubmit="return validate()">
    Username: <input type="text" name="username"><br><br>
    Email: <input type="email" name="email"><br><br>
    Designation: <input type="text" name="designation"><br><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>