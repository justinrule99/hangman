
function onSignUp(){
	console.log("you signed up");
	var fullname = prompt("What is your full name?");
	var password = prompt("Choose a password");
}

function onLogIn(){
	console.log("you logged in");
}


//JQUERY HERE 
$(function(){

	$("#closesection").on("click",function(){
			console.log("you clicked it");
			$(".profiles").slideToggle(500);
	});
});