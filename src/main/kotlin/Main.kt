fun main(args: Array<String>) {
    val address = getAddress()
    val company = getCompany()
    val contact = getContact()

    val schoolEducation = getSchoolEducation()
    val universityEducation = getUniversityEducation()

    val educations = listOf(schoolEducation, universityEducation)

    val user = User.Builder()
        .setFirstName("Abhishek")
        .setLastName("Saxena")
        .setAddress(address)
        .setCompany(company)
        .setContact(contact)
        .setEducations(educations) // <- a list of education is set
        .build() // <- user object is built here

    val user1 = User.Builder()
        .setFirstName("Abhishek")
        .setLastName("Saxena")
        .setAddress(address)
        .setCompany(company)
        .addEducation(educations) // <- a list of education is added
        .build() // <- user object is built here

    val user2 = User.Builder()
        .setFirstName("Abhishek")
        .setLastName("Saxena")
        .setAddress(address)
        .addEducation(schoolEducation)
        .addEducation(universityEducation) // <- Education is added one at a time
        .build() // <- user object is built here
}

private fun getAddress(): Address = Address.Builder()
    .setLine1("test")
    .setCity("Delhi")
    .setState("Delhi")
    .setCountry("India")
    .setPinCode(123456)
    .build()

private fun getCompany(): Company = Company.Builder()
    .setName("ABC")
    .build()

private fun getContact(): Contact = Contact.Builder()
    .setEmail("abc@def.com")
    .build()

private fun getSchoolEducation(): Education = EducationBuilder()
    .setSchool("ABC School")
    .setYearOfPassing(2014)
    .build()

private fun getUniversityEducation(): Education = EducationBuilder()
    .setSchool("ABC University")
    .setDegree("B.Tech")
    .setYearOfPassing(2020)
    .build()