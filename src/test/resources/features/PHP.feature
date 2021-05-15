Feature: As a potential client i need to reserve a Tour in PHPTravels

  @Test
  Scenario: Realizar Reserva en un Tour en PHP Travels
    Given el usuario se encuentra en la home de la app
    When el usuario tapea el tour
    And el usuario completa los datos fecha <fecha> , cantidad de adultos <ctdadadultos>, niños <cantidadninos> e infantes <ctdasinf>
    And el usuario tapea el boton "BOOK NOW"
    And el usuario completa el campo nombre: <nombre>, apellido <apellido>, email <email>, confirmacion de email <confiemail>,telefono <telefono>, direccion <direccion>, pais <pais>
    And el usuario selecciona los extras que requiere
    And el usuario completa el nombre <nombre> ,pasaporte <pasaporte> ,edad <edad> de las personas que estan involucradas en la reserva
    And el usuario tapea el boton de "CONFIRM THIS BOOKING"
    Then el usuario verifica que se realizo correctamente la reserva