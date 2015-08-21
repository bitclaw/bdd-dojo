Feature: login
  Como jugador
  quiero que el juego me de la bienvenidad
  para engancharme al juego

  Scenario: veo la pantalla de bienvenida
    Given ingreso al juego
    Then veo el mensaje "Bienvenido al juego"

  Scenario: login exitoso
    Given ingreso al juego
    When ingreso "Daniel" como usuario
    And password "1234"
    And hago login
    Then inicia el juego con este mensaje "iniciaste tu juego"

  Scenario: login fallida
    Given ingreso al juego
    When ingreso "Pepito" como usuario
    And password "123456"
    And hago login
    Then inicia el juego con este mensaje "credenciales invalidas"
