package com.project.app

class Snake private constructor(
    private val position: Point
) : Reset {
    class Builder {
        private lateinit var position: Point
        private lateinit var direction: Direction
        private var size: Int = 0

        fun size(size: Int) = apply {
            this.size = size
        }

        fun direction(direction: Direction) = apply {
            this.direction = direction
        }

        fun initialPosition(position: Point) = apply {
            this.position = position
        }

        fun build(): Snake {
            return Snake(position)
        }
    }

    override fun reset() {
        TODO("Not yet implemented")
    }
}