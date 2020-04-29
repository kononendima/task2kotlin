import javax.xml.bind.annotation.*

@XmlRootElement(name = "Persons")
@XmlAccessorType(XmlAccessType.FIELD)
class Persons() {
    @XmlElement(name = "person")
    var personsList = ArrayList<Person>()


}