plugins {
    id("java")
}

group = "net.cytonic"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.foxikle.dev/cytonic")
}

dependencies {
    compileOnly("net.cytonic:Cytosis:1.0-SNAPSHOT")
}

tasks.test {
    useJUnitPlatform()
}