<!DOCTYPE html>
<html>
<body>
<h1>JavaScript Object Constructors</h1>
<p id="demo0"></p>
<p id="demo1"></p>
<p id="demo2"></p>
<p id="demo3"></p>
<script>
// Constructor Function for Person objects
function Person(first, last, age, eye) {
    this.firstName = first;
    this.lastName = last;
    this.age = age;
    this.eyeColor = eye;
}

// Create a Person object
const myFather = new Person("John", "Doe", 50, "blue");

// Display age
document.getElementById("demo2").innerHTML =
"My father age is " + myFather.age + ".";
document.getElementById("demo0").innerHTML =
"My father firstName is " + myFather.firstName + ".";
document.getElementById("demo1").innerHTML =
"My father lastName is " + myFather.lastName + ".";
document.getElementById("demo3").innerHTML =
"My father eyeColor is " + myFather.eyeColor + ".";
</script>
</body>
</html>