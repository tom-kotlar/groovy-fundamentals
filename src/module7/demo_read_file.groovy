package module7

import groovy.io.FileType

class demo_read_file {
    static void main(String[] args) {

        println("Please enter the directory to read the log files from")
        File dir = new File(System.in.newReader().readLine())

        println("You enterd $dir")

        try {
            dir.eachFile(FileType.FILES) {println( it)}
            dir.eachFile {
                if (it.name.endsWith("xml")) {
                    println("precess $it.name -->")
                }
            }

            dir.eachFileMatch(FileType.FILES,  ~/\.gitignore$/) { file ->
//                println "==> Reading ${file.absolutePath}"
//                file.eachLine { println it }
//                List lines = file.readLines()
//                println("Total number of gitignore lines ${lines.size()}") //5

                String line
                file.withReader {readLine ->
                    while((line = readLine.readLine()) != null) {
                        if (line.contains("#")) {
                            println(line)
                        }

                    }
                }

            }

        } catch (Exception e) {
            println("Exceprion occured ${e.getMessage()}")
        }

    }
}

