<div align="center">

# 🛒 Automação Selenium + Java + Cucumber

**Projeto de treinamento de automação de testes para o EstoqueLab**

<br>

<a href="https://estoquelab.netlify.app/" target="_blank">
  <img src="https://img.shields.io/badge/🌐_Aplicação-EstoqueLab-0F172A?style=for-the-badge" alt="EstoqueLab" />
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

Este projeto tem como objetivo praticar automação de testes web de ponta a ponta no **[EstoqueLab](https://estoquelab.netlify.app/)**, um sistema educacional de estoque criado para treinamento de QA. Os testes usam **Java**, **Selenium WebDriver**, **Cucumber** e a abordagem **BDD (Behavior Driven Development)**.

Os cenários são escritos em **Gherkin** e executados no navegador pelo Selenium. Os seletores dos fluxos usam atributos `name`, facilitando a prática com elementos identificados de forma explícita.

Atualmente, o projeto cobre o login com as credenciais de demonstração (`admin` / `123456`) e o cadastro de um produto. O EstoqueLab é um ambiente de simulação: os dados são temporários e devem ser fictícios.

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
| Aplicação testada | [EstoqueLab](https://estoquelab.netlify.app/) |

---

## 📁 Estrutura do projeto

```
.
├── src
│   └── test
│       ├── java
│       │   ├── login/        # Página, passos e runner do Cucumber
│       │   ├── produto/      # Página e passos do cadastro de produtos
│       │   └── utils/        # Driver do navegador e hooks
│       └── resources
│           ├── login/        # Cenários de login em Gherkin
│           └── produto/      # Cenários de produto em Gherkin
└── pom.xml                   # Dependências e configuração do projeto
```
---

## 🚀 Como executar

### Pré-requisitos

Antes de começar, tenha instalado:

- ☕ [JDK](https://adoptium.net/) 21 ou superior
- 📦 [Maven](https://maven.apache.org/)
- 🌐 Google Chrome

Confira as instalações:

```bash
java -version
mvn -version
```

### Instalação

```bash
# Clone o repositório
git clone https://github.com/Alissongdb/selenium-automationpratice-frontend.git

# Entre na pasta do projeto
cd selenium-automationpratice-frontend

# Execute os cenários
mvn test
```

### Rodando os testes

| Objetivo | Comando |
|---|---|
| Executar todos os cenários | `mvn test` |
| Limpar e executar | `mvn clean test` |
| Executar cenário de login | `mvn test -Dcucumber.filter.tags="@login"` |
| Executar cenário de novo produto | `mvn test -Dcucumber.filter.tags="@novo-produto"` |
| Executar um cenário por nome | `mvn test -Dcucumber.filter.name="Cadastrar um novo produto"` |

---

## 📊 Relatórios

Ao final da execução, o Cucumber gera um relatório com o resultado de cada cenário e passo. Normalmente ele fica na pasta `target/`, e você abre o arquivo HTML no navegador.

---

## 🔭 Próximos passos

- [ ] Integrar a execução ao **GitHub Actions** (CI/CD)
- [ ] Adicionar **screenshots automáticos** em caso de falha
- [ ] Ampliar a cobertura com novos fluxos de estoque
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
