package com.korbstech.spacexm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform