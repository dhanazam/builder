class User private constructor(
    firstName: String?,
    middleName: String?, // optional
    lastName: String?,
    address: Address?,
    contact: Contact?, // optional
    company: Company?, // optional
    educations: List<Education>,
) {
    val firstName: String
    val middleName: String? // optional
    val lastName: String
    val address: Address
    val contact: Contact? // optional
    val company: Company? // optional
    val educations: List<Education>

    init {
        if (firstName.isNullOrBlank())
            throw IllegalArgumentException("First name is required")

        if (lastName.isNullOrBlank())
            throw IllegalArgumentException("Last name is required")

        if (address == null)
            throw IllegalArgumentException("Address is required")

        if (educations.isEmpty())
            throw IllegalArgumentException("Education list is required")

        this.firstName = firstName
        this.middleName = middleName
        this.lastName = lastName
        this.address = address
        this.contact = contact
        this.company = company
        this.educations = educations
    }

    class Builder {
        private var firstName: String? = null
        private var middleName: String? = null // optional
        private var lastName: String? = null
        private var address: Address? = null
        private var contact: Contact? = null // optional
        private var company: Company? = null // optional
        private val educations = mutableListOf<Education>()

        fun setFirstName(firstName: String): Builder {
            this.firstName = firstName
            return this
        }

        // OR

        fun setMiddleName(middleName: String) = apply {
            this.middleName = middleName
        }

        fun setLastName(lastName: String) = apply {
            this.lastName = lastName
        }

        fun setAddress(address: Address) = apply {
            this.address = address
        }

        fun setContact(contact: Contact) = apply {
            this.contact = contact
        }

        fun setCompany(company: Company) = apply {
            this.company = company
        }

        fun addEducation(education: Education) = apply {
            this.educations.add(education)
        }

        fun addEducation(educations: List<Education>) = apply {
            this.educations.addAll(educations)
        }

        fun setEducations(educations: List<Education>) = apply {
            this.educations.clear()
            this.educations.addAll(educations)
        }

        fun build(): User {
            return User(
                firstName,
                middleName,
                lastName,
                address,
                contact,
                company,
                educations
            )
        }
    }
}