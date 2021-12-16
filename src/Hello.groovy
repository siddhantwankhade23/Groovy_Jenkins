stage("Init") {
    print("Java Version  :- " + System.getProperty("java.version"))

    Check.getCommandOutput("where java")
}
