package beans;

public class UserAlbumCatalog {

    private UserCatalog userCatalog;

    private AlbumsCatalog albumsCatalog;

    public UserAlbumCatalog(UserCatalog userCatalog, AlbumsCatalog albumsCatalog) {
        this.userCatalog = userCatalog;
        this.albumsCatalog = albumsCatalog;
    }

    public UserCatalog getUserCatalog() {
        return userCatalog;
    }

    public void setUserCatalog(UserCatalog userCatalog) {
        this.userCatalog = userCatalog;
    }

    public AlbumsCatalog getAlbumsCatalog() {
        return albumsCatalog;
    }

    public void setAlbumsCatalog(AlbumsCatalog albumsCatalog) {
        this.albumsCatalog = albumsCatalog;
    }
}
