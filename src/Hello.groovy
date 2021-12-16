import org.fusesource.hawtjni.runtime.Library

import Check;
stage("Init") {
    print("Java Version  :- " + System.getProperty("java.version"))

    Check.getCommandOutput("where java")
}
