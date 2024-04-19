import java.util.List;
import java.util.UUID;

public class Artist {
    final private UUID artistId;
    final private String artistName;
    final private List<Album> albumList;

    public Artist(UUID artistId, String artistName, List<Album> albumList) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.albumList = albumList;
    }

}
