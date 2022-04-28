plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}
dependencies {
    api(libs.javax.inject)
    api(libs.coroutines.core)
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}