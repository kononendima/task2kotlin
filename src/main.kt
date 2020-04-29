import java.io.File
import java.text.SimpleDateFormat
import javax.xml.bind.JAXBContext
import javax.xml.bind.Marshaller


val jaxbContext:JAXBContext = JAXBContext.newInstance(Persons::class.java)
val persons = Persons()
fun main(args: Array<String>) {

    unmarhall()
}

fun marhaller(){
    createPerson()
    try {
    val marshaller = jaxbContext.createMarshaller()
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true)
    marshaller.marshal(persons,File("res/Persons.xml"))
    }catch (e:Exception){
        print("не смог замаршалить")
    }
}
fun unmarhall(){
    try {
        val jaxbUnmarshaller = jaxbContext.createUnmarshaller()
        val personsJaxb: Persons = jaxbUnmarshaller.unmarshal(File("res/Persons.xml")) as Persons
        personsJaxb.personsList.forEach() {
            println("${it.name},${it.birthday}")
        }
    }catch (e: Exception){
        print("не получилось размаршалить")
    }
}
fun createPerson(){
    try {
        val format = SimpleDateFormat("dd/MM/yyyy")
        val person = Person("Леха", format.parse("15/11/2008"))
        val person2 = Person("Вася", format.parse("23/12/2008"));
        persons.personsList.add(person)
        persons.personsList.add(person2)
    }catch (e: Exception){
        print("пользователи не создались")
    }
}