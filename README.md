CurvedBottomNavLib


CurvedBottomNavLib is an Android library for implementing a curved bottom navigation view with a custom floating action button (FAB) in your app. This library allows developers to easily create an attractive bottom navigation bar with a centered FAB, providing a modern and clean UI/UX experience.

Features
Customizable curved bottom navigation bar.
Floating Action Button (FAB) integrated into the bottom navigation view.
Easy integration and configuration.
Support for adding icons and labels to the navigation items.
Compatible with Android projects using BottomNavigationView.
Preview
<p align="center"> <img src="preview_image_link" width="300" /> </p>
Installation
Add the following dependency to your build.gradle file:

gradle
Copy code
dependencies {
    implementation 'com.github.tugbaolcer:CurvedBottomNavLib:1a91e1c525'
}
Make sure to add the following Maven repository to your project’s root build.gradle file:

gradle
Copy code
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
Usage
In your XML layout, add the CurvedBottomNavigationView:

xml
Copy code
<com.tugbaolcer.curvedbottomnav.CurvedBottomNavigationView
    android:id="@+id/bottomNavigationView"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:itemIconTint="@color/colorPrimary"
    app:itemTextColor="@color/colorPrimary"
    app:menu="@menu/bottom_nav_menu" />
Then, in your MainActivity or relevant activity, initialize and set up the CurvedBottomNavigationView:

kotlin
Copy code
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
Adding a Floating Action Button (FAB)
You can also add a custom FAB to the center of the curved bottom navigation. Use the following XML structure:

xml
Copy code
<com.google.android.material.floatingactionbutton.FloatingActionButton
    android:id="@+id/fab"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_gravity="center"
    app:srcCompat="@drawable/ic_add" />
You can control the behavior of the FAB within your activity:

kotlin
Copy code
val fab = findViewById<FloatingActionButton>(R.id.fab)
fab.setOnClickListener {
    // Handle FAB click
}
Customization
The CurvedBottomNavigationView allows you to customize the appearance and behavior of the navigation bar:

Colors: Customize the background color, icon tint, and text color.
Shape: Modify the curvature of the navigation bar.
FAB Size: Adjust the size and position of the FAB.
License
This project is licensed under the MIT License. See the LICENSE file for details.

This is a basic template. You can customize it further based on your project's specific details or requirements.
