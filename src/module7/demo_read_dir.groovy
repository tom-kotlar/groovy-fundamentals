package module7

import groovy.io.FileType

class demo_read_dir {
    static void main(String[] args) {
        println("Please enter the directory to read the log files from")
        File dir = new File(System.in.newReader().readLine())

        println("You enterd $dir")
        try {
            //        dir.eachFile {println( it)}
            dir.eachFile(FileType.FILES) {println( it)}
            dir.eachFile {
                if (it.name.endsWith("jar")) {
                    println("precess $it.name")
                }
            }

            dir.eachFileMatch(FileType.FILES, ~/.*ginq.*\.jar$/) { file ->
                println "Found: $file.name eachFileMatch"
            }

        } catch (Exception e) {
            println("Exceprion occured ${e.getMessage()}")
        }
    }
}
