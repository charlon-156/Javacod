funcionario1 = { nome: "charlon", matricula:"123", senha:"123", idade: 30}
funcionario2 = { nome: "Vanessa", matricula:"333", senha:"123", idade: 50}
funcionario3 = { nome: "charlon", matricula:"456", senha:"123", idade: 15}

funcionarios = [funcionario1, funcionario2, funcionario3]

produto1 = {nome: "biscoito", marca:"nestle", id:"001", preço:1.50}
produto2 = {nome: "pão", marca:"Treloso", id:"002", preço: 2}

produtos = [produtos1, produto2]

function validarSenha() {
    mat = document.getElementById('username').value
    sen = document.getElementById('senha').value

    for (let i = 0; i < funcionarios.length; i++) {
        fun_aux = funcionarios[i]
        if (fun_aux.senha == sen && fun_aux.matricula == mat) {
            alert("funcionou, ")
            location.href= "menu.html"
            return

        } else {
            alert("erro")
            return
        }
        
    }
}