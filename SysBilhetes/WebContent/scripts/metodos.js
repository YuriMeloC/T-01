/**
 * @author Yuri de Melo Camilo
 */

function validaCadastro() {

	let nome = formCadastro.nome.value
	let cpf = formCadastro.cpf.value
	let email = formCadastro.email.value
	let telefone = formCadastro.telefone.value
	let senha = formCadastro.senha.value
	let confSenha = formCadastro.confSenha.value

    if (nome === "") {
		alert("Preencha o campo Nome!");
		formCadastro.nome.focus();
		return false;
	} else if (cpf === "") {
		alert("Preencha o campo CPF!");
		formCadastro.cpf.focus();
		return false;
	} else if (email === "") {
		alert("Preencha o campo Email!");
		formCadastro.email.focus();
		return false;
	} else if (telefone === "") {
		alert("Preencha o campo Telefone!");
		formCadastro.telefone.focus();
		return false;
	} else if (senha === "") {
		alert("Preencha o campo Senha!");
		formCadastro.senha.focus();
		return false;
	} else if (confSenha === "") {
        alert("Confirme sua senha!");
		formCadastro.confSenha.focus();
		return false;
    } else if (confSenha !== senha) {
        alert("As senhas divergem!");
		formCadastro.confSenha.focus();
		formCadastro.senha.value="";
		formCadastro.confSenha.value="";
		return false;
    } else {
		document.forms["formCadastro"].submit();
		window.alert("Cadastro realizado com sucesso");
	}
}

function validaDadosPagamento() {
	let nome = formCadastro.nome.value
	let cpf = formCadastro.cpf.value
	let email = formCadastro.email.value
	let telefone = formCadastro.telefone.value
	let senha = formCadastro.senha.value
	let confSenha = formCadastro.confSenha.value
}