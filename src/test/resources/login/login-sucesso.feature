# language: pt

@login
Funcionalidade: Realizar login com sucesso
Cenario: Realizar login com sucesso

Dado que estou no site Automation Pratice
    E clico no botao Login da pagina principal
Quando preencho o campo email com "alissondalbosco@hotmail.com"
    E preencho o campo senha com "123456"

    E clico no botao Login
Entao deve ser aberto uma janela popup com a mensagem Login realizado