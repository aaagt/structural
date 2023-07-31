plugins {
    application
}


group = "${rootProject.group}.calculator"


application {
    mainClass.set("${group}.Main")
}


dependencies {
    val junitVersion: String by project

    testImplementation("org.junit.jupiter:junit-jupiter:$junitVersion")
}


tasks.test {
    useJUnitPlatform()
}
