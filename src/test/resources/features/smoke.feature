Feature: login
  Como jugador
  quiero que el juego me de la bienvenidad
  para engancharme al juego

  Scenario: veo la pantalla de bienvenida
    Given ingreso al juego
    Then veo el mensaje "Bienvenido al juego"

  Scenario: login exitoso
    Given ingreso al juego
    When ingreso "Daniel" como usario
    And password "1234"
    And hago login
    Then veo el mensaje "iniciaste tu juego"
