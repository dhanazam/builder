class Contact(
    twitterHandle: String,
    githubHandle: String,
    phoneNumber: String,
    email: String,
) {
    val twitterHandle: String
    val githubHandle: String
    val phoneNumber: String
    val email: String

    init {
        this.twitterHandle = twitterHandle.ifBlank {
            throw IllegalArgumentException("Twitter handle must not be blank.")
        }

        this.githubHandle = githubHandle.ifBlank {
            throw IllegalArgumentException("GitHub handle must not be blank.")
        }

        this.phoneNumber = phoneNumber.ifBlank {
            throw IllegalArgumentException("Phone number must not be blank.")
        }

        this.email = email.ifBlank {
            throw IllegalArgumentException("Email must not be blank.")
        }
    }

    class Builder {
        private var twitterHandle: String = ""
        private var githubHandle: String = ""
        private var phoneNumber: String = ""
        private var email: String = ""

        fun setTwitterHandle(twitterHandle: String) = apply {
            this.twitterHandle = twitterHandle
        }

        fun setGithubHandle(githubHandle: String) = apply {
            this.githubHandle = githubHandle
        }

        fun setPhoneNumber(phoneNumber: String) = apply {
            this.phoneNumber = phoneNumber
        }

        fun setEmail(email: String) = apply {
            this.email = email
        }

        fun build(): Contact {
            return Contact(
                twitterHandle = twitterHandle,
                githubHandle = githubHandle,
                phoneNumber = phoneNumber,
                email = email
            )
        }
    }
}