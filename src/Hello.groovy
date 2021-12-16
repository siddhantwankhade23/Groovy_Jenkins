stage("Init") {
    print("Java Version  :- " + System.getProperty("java.version"))
    String environmentPath = Environment.GetEnvironmentVariable("JAVA_HOME");
    print("Path :-" + environmentPath);

    Check.getCommandOutput("where java")
}
