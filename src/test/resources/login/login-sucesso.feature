# language: pt

@login
Funcionalidade: Acesso ao EstoqueLab

  Cenario: Entrar com credenciais de demonstração
    Dado que estou na página inicial do EstoqueLab
    Quando informo o usuário "admin" e a senha "123456"
    E solicito a entrada
    Então devo visualizar a área de produtos