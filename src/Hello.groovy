stage("Init") {
    print("Java Version  :- " + System.getProperty("java.version"))

    int i = 0

    print("Waiting for 10 seconds")
    while(i<10){
        i++
        Thread.sleep(1000)
    }
    print("Waiting time ends")
}

stage("Checking Java Installations"){

    String output = null;       //the string to return

    Process process = null;
    BufferedReader reader = null;
    InputStreamReader streamReader = null;
    InputStream stream = null;

    process = Runtime.getRuntime().exec("where java");

    //Get stream of the console running the command
    stream = process.getInputStream();
    streamReader = new InputStreamReader(stream);
    reader = new BufferedReader(streamReader);

    String currentLine = null;  //store current line of output from the cmd
    StringBuilder commandOutput = new StringBuilder();  //build up the output from cmd
    while ((currentLine = reader.readLine()) != null) {
        print("current line : "+currentLine + "\n")
        commandOutput.append(currentLine);
        commandOutput.append("\n");
    }

    int returnCode = process.waitFor();
    if (returnCode == 0) {
        output = commandOutput.toString();
    }

    print("output : = "+output)
}
