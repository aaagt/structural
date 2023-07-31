plugins {
    application
}


group = "${rootProject.group}.binaryfacade"


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
