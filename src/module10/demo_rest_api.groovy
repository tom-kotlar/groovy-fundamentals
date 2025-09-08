package module10

def connection = new URL("https://swapi.py4e.com/api/people/1").openConnection()
connection.setRequestProperty('Accept', 'application/json')
def jsonResponse = connection.inputStream.text
 println(jsonResponse)