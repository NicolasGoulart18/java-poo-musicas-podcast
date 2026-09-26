# Audio System — Music & Podcast

Java study project focused on Object-Oriented Programming.

The application models music and podcasts, tracks plays and likes, calculates classifications, and uses those classifications to identify favorite content.

## Features

- Create music and podcast objects
- Track play counts
- Track likes
- Calculate classifications
- Filter content based on classification

## OOP Concepts Applied

- **Encapsulation:** object state is controlled through class attributes and methods.
- **Inheritance:** `Music` and `Podcast` reuse behavior from `Audio`.
- **Polymorphism:** subclasses provide their own classification behavior.
- **Abstraction:** shared audio behavior is centralized in the base class.

## Project Structure

```text
src/
├── Models/
│   ├── Audio.java
│   ├── Music.java
│   ├── Podcast.java
│   └── Favorites.java
└── Main/
    └── Main.java
```

## Classification Logic

### Music

- More than 2000 plays → classification 10
- From 1000 to 2000 plays → classification 7
- Fewer than 1000 plays → classification 5

### Podcast

- More than 500 likes → classification 10
- Up to 500 likes → classification 8

## Favorites Logic

The `Favorites` class evaluates the classification of an audio item:

- Classification 9 or higher → highlighted as a major success
- Classification below 9 → recommended for casual listening

## How to Run

1. Clone the repository:

```bash
git clone https://github.com/NicolasGoulart18/java-poo-musicas-podcast.git
```

2. Open the project in IntelliJ IDEA, Eclipse, VS Code, or another Java IDE.
3. Run the main class:

```text
Main.Main
```

## Learning Goal

This project was created to practice class relationships, inheritance, encapsulation, method overriding, and polymorphism in Java.

## Author

Nicolas Goulart
