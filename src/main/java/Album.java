import java.util.List;
import java.util.UUID;

public class Album {
    final private UUID albumId;
    String albumTitle;
    Artist artist;
    List<Side> sideList;
    String genre;
    String year;
    RecordLabel recordLabel;

    public Album (UUID albumId, String albumTitle, Artist artist, List<Side> sideList, String genre, String year, RecordLabel recordLabel) {
        this.albumId = albumId;
        this.albumTitle = albumTitle;
        this.artist = artist;
        this.sideList = sideList;
        this.genre = genre;
        this.year = year;
        this.recordLabel = recordLabel;
    }
}
