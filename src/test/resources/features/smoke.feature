Feature: MK enter game
  As a player
  I would like to start a game session

  Scenario: View Mortal Kombat welcome screen
    Given game loaded
    Then I see the game title "Mortal Kombat"
    And I see a button with text "Press Start"

  Scenario: Press start should show the Select player screen
    Given game loaded
    When click on "Press start" button
    Then I see the game title "Select Player"
    And I see a "player1" text box
    And I see a "player2" text box
    And I see a button with text "Fight"

  Scenario: Start a fight
    Given player selected
    When click on "Fight" button
    Then I see "player1" life gauge
    And I see "player2" life gauge
+

#  Scenario: login exitoso
#    Given ingreso al juego
#    When ingreso "Daniel" como usuario
#    And password "1234"
#    And hago login
#    Then inicia el juego con este mensaje "iniciaste tu juego"
#
#  Scenario: login fallida
#    Given ingreso al juego
#    When ingreso "Pepito" como usuario
#    And password "123456"
#    And hago login
#    Then inicia el juego con este mensaje "credenciales invalidas"
