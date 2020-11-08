package sample;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

class SongsTest {
    Songs song = new Songs(1,"NF","The Search", "Hip-Hop",2019);

    @Test
    void getId() {
        assertEquals(1, song.getId());
    }

    @Test
    void getArtist() {
        assertEquals("NF", song.getArtist());
    }

    @Test
    void getAlbum() {
        assertEquals("The Search", song.getAlbum());
    }

    @Test
    void getGenre() {
        assertEquals("Hip-Hop", song.getGenre());
    }

    @Test
    void getYear() {
        assertEquals(2019, song.getYear());
    }
}