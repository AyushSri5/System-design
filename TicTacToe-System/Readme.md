# Improvements

## Design Patterns that can be used

- Singleton Pattern
  - Can be used in Game class as we want only one instance of game running as it is managing all operations
- Strategy Pattern
  - Can be used in the player class as there are different levels for which there are different strategy like EasyStrategy, MediumStrategy, HardStrategy
- State Pattern
  - Can be used in Game class to manage different states like player 1 move player 2 move Result state and waiting state
- Observer Pattern
  - Can be used to notify Game class through UI class on every state change
