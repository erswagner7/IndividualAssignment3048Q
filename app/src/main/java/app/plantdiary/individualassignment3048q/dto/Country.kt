package app.plantdiary.individualassignment3048q.dto

data class Country(var code: String, var name: String) {
    override fun toString(): String {
        return name + " " + code
    }
}
