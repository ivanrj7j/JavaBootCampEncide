# 🚀 2-Day Java Bootcamp: From C to Java Foundations
### Organized by ENICDE

Welcome to the Java Bootcamp! This repository is designed to bridge your existing C/C++ knowledge into the world of Java, Object-Oriented Programming (OOP), and the "Write Once, Run Anywhere" (WORA) ecosystem.

---

## 🍴 How to Follow Along (Fork & Clone)

To save your progress and complete the homework, you should create your own copy of this repository:

1.  **Fork this Repository:** Click the **Fork** button at the top-right of this GitHub page. This creates a copy of the project in your own GitHub account.
2.  **Clone Your Fork:** Open your terminal (or Git Bash) and run:
    ```bash
    git clone https://github.com/YOUR_USERNAME/JavaBootCampEncide.git
    ```
    *(Replace `YOUR_USERNAME` with your GitHub handle)*
3.  **Open in IntelliJ IDEA:**
    *   Open IntelliJ IDEA.
    *   Select **Open** and navigate to the folder where you cloned the repository.
    *   IntelliJ will automatically detect the modules and project structure.

---

## 🛠️ Repository Structure
The project is divided into two days, with separate folders for instructor-led demonstrations and student practice:

- **`day1/`**: The Java Engine & Object-Oriented Foundations.
  - `classwork/`: Source code from live demonstrations.
  - `homework/`: Practical exercises for you to complete.
- **`day2/`**: Rules, Relationships, and Inheritance.
  - `day2classwork/`: Source code from live demonstrations.
  - `day2homework/`: Practical exercises for you to complete.

---

## 📅 Day 1: The Java Engine & OO Foundations

### Concepts Covered
*   **The Java Pipeline:** Understanding the JDK, JRE, and JVM.
*   **Compilation:** Using `javac` to generate bytecode (`.class` files).
*   **OO Mindset Shift:** Functional (FOD) vs. Object-Oriented Design (OOD).
*   **Classes & Objects:** Blueprints vs. Instances.
*   **The String Debate:** Memory impact of `String` vs. `StringBuffer`.
*   **Encapsulation:** Using `private` modifiers and getters/setters.

### 📝 Day 1 Homework Tasks
Find these in `day1/homework/src/`:
1.  **`BasicOperations.java`**: Practice Java's loop and conditional syntax.
2.  **`BankAccount.java`**: Implement your first class with a constructor, private state, and transaction logic.
3.  **`StringPractice.java`**: Learn to manipulate strings and compare them safely using `.equals()`.

---

## 📅 Day 2: Rules, Relationships, and Inheritance

### Concepts Covered
*   **Inheritance:** Using `extends` to promote code reusability (DRY).
*   **The `super` Keyword:** Understanding constructor execution order (Parent -> Child).
*   **Polymorphism:** 
    *   **Overloading:** Same method name, different parameters.
    *   **Overriding:** Redefining parent methods in child classes.
*   **Rule Enforcers:** 
    *   `static`: Logic belonging to the class, not the instance.
    *   `final`: Constants and preventing inheritance.
    *   `abstract`: Enforcing templates for subclasses.

### 📝 Day 2 Homework Tasks
Find these in `day2/day2homework/src/`:
1.  **`Vehicle.java` & `Car.java`**: Create a relationship between an abstract base class and a concrete child class.
2.  **`MathHelper.java`**: Implement overloaded methods to handle different data types (ints and doubles).

---

## 💻 How to Use This Repo

### In IntelliJ IDEA:
1.  Open the project folder in IntelliJ.
2.  Navigate to the `src` folder of any module.
3.  Right-click a file and select **Run 'FileName.main()'**.

### In the Terminal:
1.  Navigate to the `src` directory of the relevant module.
2.  **Compile:** `javac FileName.java`
3.  **Run:** `java FileName`

---

## 🎓 Learning Tips
*   **Check the Classwork:** If you get stuck on homework, look at the corresponding file in the `classwork` folder. It contains the "completed" version of the concepts you're practicing.
*   **Watch the Console:** Java compiler errors are very descriptive. If it says "cannot find symbol," check your spelling and imports!
*   **Experiment:** Try changing a `public` variable to `private` in the classwork and see what happens when you try to run `Main`.

**Happy Coding! ☕**
