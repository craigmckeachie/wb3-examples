The **Feature-Based Naming Convention** is a strategy where method names are derived from the functional "domain" or "task" the user is currently interacting with. Instead of using generic terms like `Screen1` or `SubMenuA`, we use names that describe the application's actual features.

By incorporating the **Parent-Child-Grandchild** hierarchy into this convention, the code becomes a self-documenting map of the application's architecture.

### The Anatomy of the Convention

1.  **Level 1 (The Root):** Use `runMainScreen()`. This is the "Parent" and acts as the entry point for the entire application.
2.  **Level 2 (The Domain):** Use `run[FeatureName]Screen()`. These are the "Children." They represent major sections of the app (e.g., `runCatalogScreen`).
3.  **Level 3 (The Specific Task):** Use `run[SubFeatureName]Screen()`. These are the "Grandchildren." They represent a deep dive into a specific functional task (e.g., `runBookSearchScreen`).

---

### Updated Feature-Based Architecture Diagram

This diagram shows the final structure we built: two child features, where only one branches into a grandchild task.

```text
[CLASS: LibraryApp]
   │
   └── runMainScreen()  (PARENT)
       │
       ├── (1) ──► runCatalogScreen() (CHILD A - Deep Path)
       │              │
       │              ├── (1) ──► runBookSearchScreen() (GRANDCHILD)
       │              │              └─ (B) ─► Back to Catalog
       │              │
       │              ├── (A) ──► [Direct Action: Add Book]
       │              └── (R) ──► [Return to Main Menu]
       │
       ├── (2) ──► runMemberScreen()  (CHILD B - Shallow Path)
       │              │
       │              ├── (A) ──► [Direct Action: Register Member]
       │              └── (R) ──► [Return to Main Menu]
       │
       └── (X) ──► [Exit Application]
```

---

### Why This Works for Students

* **Logical Traceability:** When a student sees an error in a method called `runBookSearchScreen`, they immediately know it belongs to the Catalog feature.
* **Contextual Actions:** It allows for "Actions" (like `Add Book`) to exist at any level. You don't have to go to a Grandchild screen to do work; the Child screen can handle logic *and* navigation.
* **Stack Discipline:** It reinforces how the **Call Stack** works. Each method call is a new layer. To get back to the Parent, you must finish (exit) the Child.



### Reference Code Summary

In the code, this convention looks like this:

* **Parent:** `runMainScreen()` handles the high-level switch.
* **Child:** `runCatalogScreen()` handles catalog logic and calls the search screen.
* **Grandchild:** `runBookSearchScreen()` handles the specific search task and provides a way back.

This pattern ensures that as the application grows from 3 screens to 30, the naming remains predictable and the hierarchy remains easy to follow.

