package module7

import groovy.io.FileType

class demo_write_files {
    static void main(String[] args) {

        println("Please enter the directory to read the log files from")
        File dir = new File(System.in.newReader().readLine())
        File output = new File("ignoreCopy.txt")
        output.setWritable(true)
        output.setText("")

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
//                            output.append(line+"\n")

                            output.withWriterAppend {
                                it.writeLine(line)
                            }
                        }

                    }
                }

            }

        } catch (Exception e) {
            println("Exceprion occured ${e.getMessage()}")
        }


        println("Readable : ${output.canRead()}")
        println("Readable : ${output.canWrite()}")
        println("Readable : ${output.canExecute()}")
        dir.traverse {println("$it >>>>")} // reads files in the folder
    }
}
