class Address(
    line1: String?,
    line2: String?,
    city: String?,
    state: String?,
    country: String?,
    pinCode: Int?
) {

    val line1: String
    val line2: String?
    val city: String
    val state: String
    val country: String
    val pinCode: Int

    init {
        if (line1.isNullOrBlank())
            throw IllegalArgumentException("Line1 must not be null or blank.")

        if (city.isNullOrBlank())
            throw IllegalArgumentException("City must not be null or blank.")
        if (state.isNullOrBlank())
            throw IllegalArgumentException("State must not be null or blank.")
        if (country.isNullOrBlank())
            throw IllegalArgumentException("Country must not be null or blank.")
        if (pinCode == null)
            throw IllegalArgumentException("Pin code must not be null.")

        this.line1 = line1
        this.line2 = line2
        this.city = city
        this.state = state
        this.country = country
        this.pinCode = pinCode
    }

    class Builder {
        private var line1: String? = null
        private var city: String? = null
        private var state: String? = null
        private var country: String? = null
        private var pinCode: Int? = null
        private var line2: String? = null

        fun setLine1(line1: String?) = apply {
            this.line1 = line1
        }

        fun setLine2(line2: String?) = apply {
            this.line2 = line2
        }

        fun setCity(city: String?) = apply {
            this.city = city
        }

        fun setState(state: String?) = apply {
            this.state = state
        }

        fun setCountry(country: String?) = apply {
            this.country = country
        }

        fun setPinCode(pinCode: Int) = apply {
            this.pinCode = pinCode
        }

        fun build(): Address {
            return Address(
                line1 = line1,
                line2 = line2,
                city = city,
                state = state,
                country = country,
                pinCode = pinCode
            )
        }
    }
}