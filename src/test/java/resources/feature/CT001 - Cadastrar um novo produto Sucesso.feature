@cadastro
Feature: Cadastrar um novo produto Sucesso

  Scenario: Cadastrando um novo produto
    Given que acesse a pagina de teste
    When preencher todos os campos obrigatorios com dados validos
    Then confirmo se o produto foi cadastrado com sucesso