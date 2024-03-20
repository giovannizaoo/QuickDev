package quickdev.steps;

import quickdev.drivers.Drivers;
import quickdev.elementos.Elementos;
import quickdev.metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends Drivers {

    Metodos metodos = new Metodos();
    Elementos elementos = new Elementos();

    @Given("que acesse a pagina de teste")
    public void queAcesseAPaginaDeTeste() {

        metodos.acessarOSite();
    }

    @When("preencher todos os campos obrigatorios com dados validos")
    public void preencherTodosOsCamposObrigatoriosComDadosValidos() {

        elementos.preencherFomulario();

    }

    @Then("confirmo se o produto foi cadastrado com sucesso")
    public void confirmoSeOProdutoFoiCadastradoComSucesso() {

        //  metodos.finalizarOAmbiente();
    }

}
