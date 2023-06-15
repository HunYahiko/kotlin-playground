
class Song(val title: String, val artist: String) {
    fun play() = println("Playing the song $title by $artist")
    fun stop() = println("Stop playing $title")
}

fun main() {
    val masterOfPuppets = Song("Master Of Puppets", "Metallica")
    val sweetChildOMine = Song("Sweet Child O' Mine", "Guns&Roses")
    val glimpseOfUs = Song("Glimpse Of Us", "Joji")

    masterOfPuppets.play()
    masterOfPuppets.stop()
    glimpseOfUs.play()
    glimpseOfUs.stop()
    sweetChildOMine.play()
}