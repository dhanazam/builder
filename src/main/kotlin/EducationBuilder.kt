class EducationBuilder {
    private var school: String = ""
    private var yearOfPassing: Int? = null
    private var degree: String? = null // optional

    fun setSchool(school: String): EducationBuilder = apply {
        this.school = school
    }

    fun setYearOfPassing(yearOfPassing: Int?): EducationBuilder = apply {
        this.yearOfPassing = yearOfPassing
    }

    fun setDegree(degree: String?): EducationBuilder = apply {
        this.degree = degree
    }

    fun build(): Education {
        return Education(school, yearOfPassing, degree)
    }
}