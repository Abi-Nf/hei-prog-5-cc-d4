package com.project.clean

import java.nio.file.Files
import kotlin.io.path.Path

object Logger {
    fun log(message: String) {
        Files.writeString(Path("error.log"), message)
    }
}