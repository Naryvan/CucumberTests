plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("io.cucumber:cucumber-junit:6.10.4")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.7.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("io.cucumber:cucumber-java:6.10.4")
}

tasks.test {
    useJUnitPlatform()
}