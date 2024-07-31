plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("maven-publish")
}

android {
    namespace = "com.tugbaolcer.curvedbottomnavlibrary"
    compileSdk = 34

    defaultConfig {
        minSdk = 26

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    viewBinding {
        enable = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}

publishing {
    publications {
        create<MavenPublication>("release") {
            afterEvaluate {
                from(components["release"])
            }

            groupId = "com.github.tugbaolcer"
            artifactId = "CurvedBottomNavLib"
            version = "1.0.7"

            pom {
                name.set("CurvedBottomNavLib")
                description.set("A curved bottom navigation library for Android.")
                url.set("https://github.com/tugbaolcer/CurvedBottomNavLib")

                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("tugbaolcer")
                        name.set("Tuğba")
                    }
                }
                scm {
                    connection.set("scm:git:github.com/tugbaolcer/CurvedBottomNavLib.git")
                    developerConnection.set("scm:git:ssh://github.com/tugbaolcer/CurvedBottomNavLib.git")
                    url.set("https://github.com/tugbaolcer/CurvedBottomNavLib")
                }
            }
        }
    }
}

//dosya yolu falan aramada kullanırım bu infoyu
tasks.register("printComponents") {
    doLast {
        println("Available components: ${components.names}")
    }
}
