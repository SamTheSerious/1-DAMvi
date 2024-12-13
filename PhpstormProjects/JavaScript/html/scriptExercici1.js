function funcioExercici1(){
    let randomNum = Math.floor(Math.random() * 10) + 1;
    let usuario = prompt("Introdueix un nombre del 1 al 10");

    if(randomNum == usuario){
        document.getElementById("resultado").innerHTML = "Has encertat!";
    }else{
        document.getElementById("resultado").innerHTML = "Has fallat :(";
    }
}