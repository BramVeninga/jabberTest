plugins {
    id("java")
    id("org.sonarqube") version "4.4.1.3373"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

sonar {
    properties {
        property("sonar.login", "sqp_d85aa2c54777d57e21494ab21432e61a037d6d3a")
        property("sonar.projectKey", "Test123")
        property("sonar.projectName", "Test123")
        property("sonar.host.url", "http://localhost:9000") // Hier localhost en poort 9000 gebruiken
    }
}
