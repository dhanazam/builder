class Education(
    school: String,
    yearOfPassing: Int?,
    degree: String? // optional
) {
    val school: String
    val yearOfPassing: Int
    val degree: String? // optional

    init {

        if (school.isBlank())
            throw IllegalArgumentException("School must not be blank.")

        if (yearOfPassing == null) {
            throw IllegalArgumentException("School must not be blank.")
        }

        this.school = school
        this.yearOfPassing = yearOfPassing
        this.degree = degree
    }
}