package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.*;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class PHPSteps extends PageSteps {
    /*@Given("The client is in google page")
    public void home() {
        Injector._page(GoogleHomePage.class).go();
    }*/

    @Given("el usuario se encuentra en la home de la app")
    public void elUsuarioSeEncuentraEnLaHomeDeLaApp() {
        Injector._page(PHPHomePage.class).go();
        Injector._page(PHPHomePage.class).VerifyPage();

    }

    @When("el usuario tapea el tour")
    public void elUsuarioTapeaElTour() {
        Injector._page(PHPHomePage.class).clickTour();
    }

    @And("el usuario completa los datos fecha <fecha> , cantidad de adultos <ctdadadultos>, niños <cantidadninos> e infantes <ctdasinf>")
    public void Usuario() {
        Injector._page(PHPTourPage.class).clickAdult();
        Injector._page(PHPTourPage.class).clickQuantityAdult();
        Injector._page(PHPTourPage.class).clickChild();
        Injector._page(PHPTourPage.class).clickQuantityChild();

    }

    @And("el usuario tapea el boton {string}")
    public void elUsuarioTapeaElBoton(String arg0) {
        Injector._page(PHPTourPage.class).clickSearch();
    }

    @And("el usuario completa el campo nombre: <nombre>, apellido <apellido>, email <email>, confirmacion de email <confiemail>,telefono <telefono>, direccion <direccion>, pais <pais>")
    public void UserCompletePersonalData() {

        Injector._page(PHPTourDataPage.class).clickFirst();


        /*Injector._page(PHPTourDataPage.class).clickFirstName();
        Injector._page(PHPTourDataPage.class).CompleteFirstName();
        Injector._page(PHPTourDataPage.class).clickSecondName();
        Injector._page(PHPTourDataPage.class).CompleteSecondName();
        Injector._page(PHPTourDataPage.class).clickEmail();
        Injector._page(PHPTourDataPage.class).CompleteEmail();
        Injector._page(PHPTourDataPage.class).clickConfirmEmail();
        Injector._page(PHPTourDataPage.class).clickConfirmEmail();
        Injector._page(PHPTourDataPage.class).clickPhone();
        Injector._page(PHPTourDataPage.class).CompletePhone();
        Injector._page(PHPTourDataPage.class).clickAddress();
        Injector._page(PHPTourDataPage.class).CompleteAddress();
        Injector._page(PHPTourDataPage.class).clickCountryButton();
        Injector._page(PHPTourDataPage.class).clickCountrySelected();*/
    }

    @And("el usuario selecciona los extras que requiere")
    public void elUsuarioSeleccionaLosExtrasQueRequiere() {
    }

    @And("el usuario completa el nombre <nombre> ,pasaporte <pasaporte> ,edad <edad> de las personas que estan involucradas en la reserva")
    public void elUsuarioCompletaElNombreNombrePasaportePasaporteEdadEdadDeLasPersonasQueEstanInvolucradasEnLaReserva() {
    }

    @And("el usuario tapea el boton de {string}")
    public void elUsuarioTapeaElBotonDe(String arg0) {
    }

    @Then("el usuario verifica que se realizo correctamente la reserva")
    public void elUsuarioVerificaQueSeRealizoCorrectamenteLaReserva() {
    }
}
