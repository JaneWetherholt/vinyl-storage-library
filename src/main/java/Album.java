import java.util.List;

abstract class Album {

    public Album () {
    }

    public abstract void setAlbumTitle(String title);
    public abstract void setAlbumArtist(Artist artist);
    public abstract void setAlbumSideList(List<Side> sideList);
    public abstract void setAlbumGenre(String genre);
    public abstract void setAlbumYear(String year);
    public abstract void setAlbumRecordLabel(RecordLabel recordLabel);

}
