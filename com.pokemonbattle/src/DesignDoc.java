public class DesignDoc {
}

/*
Pokemon Battle Simulator
Use case:
    1. Start a new game
    2. Generate player1 and player2
    3. (3) pokemons are generated for each player
    4. Each player select a pokemon for each round
    5. Pokemons battle automatically
    6. End game - determine the player that wins

Classes:
Class Game:
    - player1
    - player2
    - rounds - [0, 0, 0]
        - 1 -> player 1 wins
        - 2 -> player 2 wins
    - currRound = 0
    - result = ?

    + startNewGame:
        get player 1 and 2
    + battle(pokemon1, pokemon2)

 Class Player:
    - name:
    - list of pokemons
    + generate player
    + generate pokemons
    + select pokemon

Class abstract Pokemon:
    - type:
    - stats: {HP, Attack, Defense, Speed}
    - minStats:
    - maxStats:
    + generate Pokemon

Class Bulbasaur extends Pokemon:
    + final type: grass
    - stats: {HP, Attack, Defense, Speed}
    - minStats = [200, 121, 121, 85]
    - maxStats = [294, 251, 251, 207]
    + generate Pokemon

Class Charmander extends Pokemon:
    + final type: fire
    - stats: {HP, Attack, Defense, SpecialAttack, SpecialDefense, Speed}
    - minStats = [188, 112, 94, 121]
    - maxStats = [282, 240, 218, 251]
    + generate Pokemon

Class Squirtle extends Pokemon:
    + final type: water
    - stats: {HP, Attack, Defense, SpecialAttack, SpecialDefense, Speed}
    - minStats = [198, 94, 121, 81]
    - maxStats = [292, 218, 251, 203]
    + generate Pokemon

Class Pikachu extends Pokemon:
    + final type: electric
    - stats: {HP, Attack, Defense, SpecialAttack, SpecialDefense, Speed}
    - minStats = [180, 103, 76, 166]
    - maxStats = [274, 229, 196, 306]
    + generate Pokemon

 */
