import java.util.UUID;

abstract class AlbumBuilder {

    protected Album album;

    public Album getAlbum(UUID albumId) {
        return album;
    }

    public Album getAlbum(String albumName) {
        return album;
    }

}
