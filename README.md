 Campsite Commander

 Overview

Campsite Commander is an Android application developed in Kotlin using Android Studio. The purpose of the application is to help outdoor adventurers manage camping gear and food supplies by creating and viewing a packing checklist.

The application demonstrates the use of:

- Arrays
- Parallel Arrays
- Loops
- User Input
- Screen Navigation
- Error Handling
- Logging
- Splash Screens

---

 Objective

The application allows users to:

- Add camping gear items
- Categorize gear items
- Store quantities and comments
- Calculate the total number of packed items
- View a detailed gear checklist
- Navigate between different screens

---

 Features

 Splash Screen

- Displays the Campsite Commander logo and title
- Shows for 3 seconds (3000ms)
- Automatically navigates to the Main Screen

 Main Screen

- Enter Item Name
- Enter Category
- Enter Quantity
- Enter Comments
- Add Gear button
- View Detailed List button
- Display Total Items Packed

 Detailed View Screen

- Displays all gear information
- Shows:
  - Item Name
  - Category
  - Quantity
  - Comments
- Includes a Back To Base button

---

 Technologies Used

- Kotlin
- Android Studio
- XML Layouts
- Android SDK
- GitHub

---

 Data Structures

The application uses parallel arrays to store camping information.

```kotlin
val itemNames = ArrayList<String>()
val categories = ArrayList<String>()
val quantities = ArrayList<Int>()
val comments = ArrayList<String>()

Sample Data

| Item | Category | Quantity | Comment |
|--------|----------|----------|----------|
| Tent | Shelter | 1 | 4-person waterproof |
| Marshmallows | Food | 3 | For Smores |
| Flashlight | Safety | 2 | Check batteries |

---

 Loop Implementation

A loop is used to calculate the total quantity of packed items.

```kotlin
var total = 0

for (qty in quantities) {
    total += qty
}
```

---

Navigation Structure

```text
SplashActivity
      ↓
MainActivity
      ↓
DetailActivity
      ↓
MainActivity
```

---

 Error Handling

The application validates user input before adding gear.

Examples:

- Empty item name
- Empty category
- Empty quantity
- Empty comment

Example:

```kotlin
if(item.isEmpty() ||
   category.isEmpty() ||
   quantity.isEmpty() ||
   comment.isEmpty()) {

    Toast.makeText(
        this,
        "Please fill all fields",
        Toast.LENGTH_SHORT
    ).show()
}
```

---

 Logging

The application uses Logcat messages for debugging.

Example:

```kotlin
Log.d("APP", "New gear added")
```

---

 How to Run

1. Open Android Studio.
2. Clone the repository from GitHub.
3. Open the project.
4. Allow Gradle to sync.
5. Run the application using an emulator or Android device.
6. Test all functionality.

---

 Screenshots

 Splash Screen

Insert screenshot here.

 Main Screen

Insert screenshot here.

 Add Gear Example

Insert screenshot here.

 Detailed View Screen

Insert screenshot here.

 Logcat Output

Insert screenshot here.

---

 Learning Outcomes Achieved

-  Arrays
-  Parallel Arrays
-  Loops
-  User Input
-  Navigation
-  Splash Screen
-  Error Handling
-  Logging
-  Kotlin Development
-  Android Studio Development
-  GitHub Version Control

---

 Author

**Mpho Rantete**

Mobile Application Development Practical Assignment

2026
