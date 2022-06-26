function validarSenha() {
    alert("Testando, Socorro")
    var t = 0;
    var password = document.getElementById('pass').value
    var expres4 = /[!@#$]/g
    var text4 = password.match(expres4)

    var expres1 = /[0-9]/g
    var text1 = password.match(expres1)

    var expres3 = /[A-Z]/g
    var text3 = password.match(expres3)

    var expres2 = /[a-z]/g
    var text2 = password.match(expres2)

    var text5 = /[a-zA-Z]/g

    if (text1.length>=2 && text2.length>=1 && text3.length>=1 && text4.length>=2 && text5.test(password.substr(0,1))) {
        alert("O site está funcionando");
        t++;
    } 
    if (t==0) {
        alert("cuuu")
    }


}