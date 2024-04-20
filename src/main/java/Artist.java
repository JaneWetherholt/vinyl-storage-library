import jakarta.persistence.GeneratedValue;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.UUID;

public class Artist {
    @GeneratedValue
    @Id
    private UUID artistId;
    final private String artistName;
    final private List<Album> albumList;

    @Autowired
    public Artist(String artistName, List<Album> albumList) {
        this.artistName = artistName;
        this.albumList = albumList;
    }

}
