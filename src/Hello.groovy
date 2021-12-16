import Check

stage("Init") {
    print("Java Version  :- " + System.getProperty("java.version"))

print(Check.getCommandOutput("where java"))
}
