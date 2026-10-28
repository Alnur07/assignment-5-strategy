# Game Character Combat System

## Description

Game Character Combat System is a Java console application that demonstrates the Strategy design pattern.

The program allows a character to switch between three combat strategies: Aggressive, Defensive, and Balanced. Each strategy defines different combat behavior.

The main purpose of this project is to demonstrate how the Strategy pattern makes algorithms interchangeable at runtime.

## Features

- Three different combat strategies.
- Runtime strategy switching.
- Console-based user interface.
- Object-oriented design using interfaces and polymorphism.

## Technologies

- Java
- IntelliJ IDEA

## Project Structure

```text
GameCombatSystem/
├── src/
│   ├── CombatStrategy.java
│   ├── AggressiveStrategy.java
│   ├── DefensiveStrategy.java
│   ├── BalancedStrategy.java
│   ├── Character.java
│   └── Main.java
└── README.md
```

## Combat Strategies

### Aggressive Strategy
Focuses on dealing high damage but also receives more damage.

### Defensive Strategy
Focuses on reducing received damage while dealing less damage.

### Balanced Strategy
Provides a balance between dealing and receiving damage.

## Design Pattern

The project implements the Strategy design pattern.

- **Strategy Interface:** `CombatStrategy` defines the common `executeCombat()` method.
- **Concrete Strategies:** `AggressiveStrategy`, `DefensiveStrategy`, and `BalancedStrategy` implement different combat algorithms.
- **Context:** `Character` stores the current strategy and delegates combat execution to it.
- **Client:** `Main` allows the user to select and change combat strategies.

The strategy can be changed at runtime using the `setStrategy()` method.

## Clean Code Principles

1. **Meaningful Names:** Class and method names clearly describe their purpose.
2. **Single Responsibility Principle:** Each strategy class implements one combat algorithm.
3. **Polymorphism:** Different strategies are used through the common `CombatStrategy` interface.
4. **Encapsulation:** The current strategy is stored in a private field and changed through a public method.
5. **Open/Closed Principle:** New combat strategies can be added without modifying the existing `Character` class.

## How to Run

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA.
3. Make sure a Java JDK is configured.
4. Open `Main.java`.
5. Run the `main()` method.
6. Select a combat strategy from the console menu.

## Example Output

```text
=== Game Character Combat System ===
1. Aggressive
2. Defensive
3. Balanced
0. Exit

Choose your combat strategy: 1

Warrior attacks aggressively!
Damage dealt: 30
Damage received: 20
```

## Author

Java Software Design Patterns Assignment