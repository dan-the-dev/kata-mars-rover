class Instructions(val instructions: CharArray) {

    fun instructions(): CharArray {
        return this.instructions
    }

    fun equals(anotherInstructions: Instructions): Boolean {
        return this.instructions.equals(anotherInstructions)
    }

    companion object {
        fun fromString(instructionsString: String) : Instructions
        {
            return Instructions(instructionsString.toCharArray())
        }
    }
}
