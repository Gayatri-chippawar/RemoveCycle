# 🔁 Cycle Detection & Removal in Linked List (Java)
## 📌 Project Overview

This project implements cycle detection and removal in a singly linked list using Java.
The solution is based on Floyd’s Cycle Detection Algorithm (Tortoise and Hare Algorithm), which efficiently detects loops in linear time.

The program:

Detects whether a cycle exists in the linked list.

Identifies the starting node of the cycle.

Removes the cycle safely without losing any nodes.

Prints the updated linked list after removal.

## 🧠 Algorithm Used
1️⃣ Cycle Detection

Uses Floyd’s Tortoise and Hare Algorithm:

Two pointers move at different speeds.

If they meet → cycle exists.

If fast pointer reaches null → no cycle.

Time Complexity: O(n)
Space Complexity: O(1)

2️⃣ Cycle Removal

Once a cycle is detected:

Move one pointer to the head.

Move both pointers one step at a time.

The meeting point is the start of the cycle.

Break the loop by setting the last node’s next to null.

## ⚙️ Features

✔ Create linked list
✔ Manually create a cycle (for testing)
✔ Detect cycle
✔ Remove cycle
✔ Print final linked list

## ▶️ How to Run

Clone the repository

git clone <repository-url>


Compile

javac Main.java


Run

java Main

🧪 Example Output
Cycle Detected: Yes
Cycle Removed Successfully
Linked List after removal:
1 → 2 → 3 → 4 → 5 → null

## 🎯 Learning Outcomes

Understanding Floyd’s Algorithm

Linked List pointer manipulation

Efficient cycle detection

In-place loop removal

Time and space complexity optimization

## 📚 Concepts Covered

Data Structures

Singly Linked List

Two Pointer Technique

Algorithm Optimization

## 👩‍💻 Author

Gayatri Chippawar
Computer Science Engineering Student
