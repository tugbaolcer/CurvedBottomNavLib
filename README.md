# CurvedBottomNavLib

**CurvedBottomNavLib** is an Android library for implementing a curved bottom navigation view with a custom floating action button (FAB) in your app. This library allows developers to easily create an attractive bottom navigation bar with a centered FAB, providing a modern and clean UI/UX experience.

## Features

- Customizable curved bottom navigation bar.
- Floating Action Button (FAB) integrated into the bottom navigation view.
- Easy integration and configuration.
- Support for adding icons and labels to the navigation items.
- Compatible with Android projects using `BottomNavigationView`.

## Preview
<img width="327" alt="Screenshot 2024-09-16 at 13 10 04" src="https://github.com/user-attachments/assets/1f9cc1e4-1c2e-4659-b594-29c357405067">

## Installation

Add the following dependency to your `build.gradle` file:

```gradle
dependencies {
    implementation 'com.github.tugbaolcer:CurvedBottomNavLib:1a91e1c525'
}
```
Make sure to add the following Maven repository to your project’s root `build.gradle` file:

```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

## Usage
In your XML layout, add the `CurvedBottomNavigationView`:

```xml
<com.tugbaolcer.curvedbottomnav.CurvedBottomNavigationView
    android:id="@+id/bottomNavigationView"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:itemIconTint="@color/colorPrimary"
    app:itemTextColor="@color/colorPrimary"
    app:menu="@menu/bottom_nav_menu" />

```
Then, in your `MainActivity` or relevant activity, initialize and set up the `CurvedBottomNavigationView`:

```kotlin
val bottomNavigationView = findViewById<CurvedBottomNavigationView>(R.id.bottomNavigationView)
bottomNavigationView.setOnNavigationItemSelectedListener { item ->
    when (item.itemId) {
        R.id.nav_home -> {
            // Handle navigation to home
            true
        }
        R.id.nav_profile -> {
            // Handle navigation to profile
            true
        }
        else -> false
    }
}
```
## Customization

The `CurvedBottomNavigationView` allows you to customize the appearance and behavior of the navigation bar:

- **Colors:** Customize the background color, icon tint, and text color.
- **Shape:** Modify the curvature of the navigation bar.
- **FAB Size:** Adjust the size and position of the FAB.



