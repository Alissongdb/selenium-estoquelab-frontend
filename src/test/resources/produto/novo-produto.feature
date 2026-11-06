# language: pt

@novo-produto
Funcionalidade: Cadastro de produtos no EstoqueLab

  Cenario: Cadastrar um novo produto
    Dado que estou autenticado no EstoqueLab com usuário "admin" e senha "123456"
    E que acesso o formulário de novo produto
    Quando informo o produto "Caderno QA", SKU "QAT-001" e categoria "Livros"
    E informo o preço "19,90" e o estoque "25"
    E salvo o produto
    Então o produto "Caderno QA" deve aparecer na lista
