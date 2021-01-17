data class Coordinates(var latitude: Int, var longitude: Int) {
    fun incrementLatitude(): Coordinates {
        return Coordinates(this.latitude + 1, this.longitude)
    }

    fun decrementLatitude(): Coordinates {
        return Coordinates(this.latitude - 1, this.longitude)
    }
}