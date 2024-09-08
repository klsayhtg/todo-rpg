package res.development.todorpg

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform