# 🎧 Audio System (Music & Podcast) - Java

Project developed with a focus on learning **Object-Oriented Programming (OOP)** using Java.

This application simulates a simple audio system, including music and podcasts, with features like play count, likes, and automatic classification based on popularity.

---

## 🚀 Features

* Music and podcast creation
* Play count tracking
* Like system
* Automatic classification based on performance
* "Favorites" filter system

---

## 🧠 OOP Concepts Applied

* **Encapsulation**

    * Private attributes with getters and setters

* **Inheritance**

    * `Music` and `Podcast` extend the `Audio` class

* **Polymorphism**

    * Method overriding of `getClassification()` in different classes

* **Abstraction**

    * Base class `Audio` centralizing shared behaviors

---

## 🏗️ Project Structure

```
src/
├── Models/
│   ├── Audio.java
│   ├── Music.java
│   ├── Podcast.java
│   └── Favorites.java
│
├── Main/
│   └── Main.java
```

---

## ⚙️ How to Run

1. Clone the repository:

```
git clone https://github.com/your-username/java-poo-musicas-podcast.git
```

2. Open the project in an IDE (IntelliJ, Eclipse, or VS Code)

3. Run the main class:

```
Main.Main
```

---

## 💡 Classification Logic

### 🎵 Music

* > 2000 plays → ⭐ 10
* 1000 to 2000 → ⭐ 7
* < 1000 → ⭐ 5

### 🎙️ Podcast

* > 500 likes → ⭐ 10
* ≤ 500 likes → ⭐ 8

---

## ⭐ Favorites System

The `Favorites` class evaluates audio classification:

* Classification ≥ 9 → "Success everywhere"
* Classification < 9 → "Good for casual listening"

---

## 📌 Notes

This project was built for educational purposes, focusing on practicing core OOP concepts in Java and tracking learning progress as a developer.
