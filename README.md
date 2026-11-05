<div align="center">

# 🛒 Automação Selenium + Java + Cucumber

**Framework de testes automatizados com BDD para a aplicação Automation Pratice (QAzando Shop)**

<br>

<a href="https://www.automationpratice.com.br/" target="_blank">
  <img src="https://img.shields.io/badge/🌐_Aplicação-Automation_Pratice-0F172A?style=for-the-badge" alt="Automation Pratice" />
</a>

<br><br>

<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
<img src="https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white" alt="Selenium" />
<img src="https://img.shields.io/badge/Cucumber-23D96C?style=for-the-badge&logo=cucumber&logoColor=white" alt="Cucumber" />
<img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven" />
<img src="https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit5&logoColor=white" alt="JUnit" />

<br><br>

<img src="https://img.shields.io/badge/BDD-Gherkin-38BDF8?style=flat-square" alt="BDD" />
<img src="https://img.shields.io/badge/Padrão-Page_Object_Model-38BDF8?style=flat-square" alt="POM" />
<img src="https://img.shields.io/badge/Testes-E2E_Web-38BDF8?style=flat-square" alt="E2E" />

</div>

---

## 📌 Sobre o projeto

Este repositório contém um **framework de automação de testes web** construído com **Java**, **Selenium WebDriver** e **Cucumber**, seguindo a abordagem **BDD (Behavior Driven Development)**.

Os cenários são escritos em **Gherkin**, em linguagem natural, o que aproxima o time de negócio e o time técnico. Cada passo é ligado a um código Java que controla o navegador e valida o comportamento esperado.

A aplicação testada é o site de demonstração **[Automation Pratice](https://www.automationpratice.com.br/)**, criado para estudo e prática de automação.

---

## ✨ Destaques

- 🥒 **Cenários em Gherkin** legíveis por qualquer pessoa do time
- 🧱 **Organização em camadas** (features, steps e páginas)
- ⚙️ **Gerenciamento de dependências com Maven**
- ✅ **Execução e asserções com JUnit**
- 🏷️ **Execução por tags**, para rodar só o que for necessário
- 📊 **Relatórios do Cucumber** com o resultado dos cenários

---

## 🛠️ Tecnologias

| Categoria | Ferramenta |
|---|---|
| Linguagem | Java |
| Automação Web | Selenium WebDriver |
| BDD | Cucumber + Gherkin |
| Gerenciador de build | Maven |
| Framework de testes | JUnit |
| Aplicação testada | [Automation Pratice](https://www.automationpratice.com.br/) |

---

## 📁 Estrutura do projeto

> Ajuste os nomes conforme a organização real do seu repositório.

```
.
├── src
│   └── test
│       ├── java
│       │   ├── pages/        # Page Objects (mapeamento das telas)
│       │   ├── steps/        # Step Definitions (código dos passos)
│       │   └── runner/       # Classe que executa o Cucumber
│       └── resources
│           └── features/     # Arquivos .feature (cenários em Gherkin)
└── pom.xml                   # Dependências e configuração do Maven
```

---

## 🥒 Exemplo de cenário

```gherkin
# language: pt
Funcionalidade: Login

  Cenário: Login com credenciais válidas
    Dado que estou na página de login
    Quando informo e-mail e senha válidos
    E clico no botão de login
    Então devo ver a mensagem de login realizado com sucesso
```

> Troque este exemplo por um cenário real do seu projeto.

---

## 🚀 Como executar

### Pré-requisitos

Antes de começar, tenha instalado:

- ☕ [JDK](https://adoptium.net/) 11 ou superior
- 📦 [Maven](https://maven.apache.org/)
- 🌐 Google Chrome (ou o navegador configurado no projeto)

Confira se está tudo certo:

```bash
java -version
mvn -version
```

### Instalação

```bash
# Clone o repositório
git clone https://github.com/Alissongdb/selenium-qazandoShop.git

# Entre na pasta do projeto
cd selenium-qazandoShop

# Baixe as dependências
mvn clean install -DskipTests
```

### Rodando os testes

| Objetivo | Comando |
|---|---|
| Executar todos os testes | `mvn test` |
| Limpar e executar | `mvn clean test` |
| Executar por tag | `mvn test -Dcucumber.filter.tags="@login"` |
| Executar um cenário por nome | `mvn test -Dcucumber.filter.name="Login com credenciais válidas"` |

---

## 📊 Relatórios

Ao final da execução, o Cucumber gera um relatório com o resultado de cada cenário e passo. Normalmente ele fica na pasta `target/`, e você abre o arquivo HTML no navegador.

---

## 🔭 Próximos passos

- [ ] Integrar a execução ao **GitHub Actions** (CI/CD)
- [ ] Adicionar **screenshots automáticos** em caso de falha
- [ ] Ampliar a cobertura com novos fluxos da loja
- [ ] Executar em **modo headless** na pipeline

---

## 👨‍💻 Autor

<div align="center">

**Alisson Gabriel Dal Bosco**
QA Engineer | Automação de Testes

<a href="https://www.linkedin.com/in/Alissongdb" target="_blank">
  <img src="https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn" />
</a>
<a href="https://github.com/Alissongdb" target="_blank">
  <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub" />
</a>

<br><br>

⭐ Se este projeto te ajudou ou te inspirou, deixe uma estrela no repositório!

</div>
