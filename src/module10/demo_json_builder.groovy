package module10

import groovy.json.JsonBuilder

class demo_json_builder {
    static void main(String[] args) {
        JsonBuilder builder = new JsonBuilder()
        File jsonOutput = new File("test.json")
        builder {
            cards([
                    [ name: "Visa",  digits: 16 ],
                    [ name: "Monzo", digits: 15 ]
            ])
        }
        jsonOutput.write(builder.toPrettyString())
        println(builder.toPrettyString())
    }
}
