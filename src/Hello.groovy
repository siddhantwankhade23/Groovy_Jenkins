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

    List<String> lines = reader.readLines();

    print("output : = "+lines.toString())
}
