package AsyncCatalogs;

import beans.AlbumsCatalog;
import beans.UserAlbumCatalog;
import beans.UserCatalog;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.codehaus.jackson.map.ObjectMapper;

import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class AsyncCatalogs {

    /*public static void getBothCatalogsAtOnce(){
        final CompletableFuture<UserCatalog> usersFuture = CompletableFuture.supplyAsync(() -> {
            HttpGet getRequest = new HttpGet("https://jsonplaceholder.typicode.com/users");
            HttpResponse usersResponse = null;
            UserCatalog userCatalog = null;
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                usersResponse = (HttpResponse) HttpClientBuilder.create().build().execute(getRequest);
                userCatalog = objectMapper.convertValue(usersResponse.body().toString(), UserCatalog.class);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            return userCatalog;
        });

        final CompletableFuture<AlbumsCatalog> albumsFuture = CompletableFuture.supplyAsync(() -> {
            HttpGet getRequest = new HttpGet("https://jsonplaceholder.typicode.com/albums");
            HttpResponse albumsResponse = null;
            AlbumsCatalog albumsCatalog = null;
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                albumsResponse = (HttpResponse) HttpClientBuilder.create().build().execute(getRequest);
                albumsCatalog = objectMapper.convertValue(albumsResponse.body().toString(), AlbumsCatalog.class);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            return albumsCatalog;
        });

        final CompletableFuture<Void> allOf = CompletableFuture.allOf(usersFuture, albumsFuture);

        try {
            allOf.get();
            final UserCatalog userCatalog = usersFuture.get();
            final AlbumsCatalog albumsCatalog = albumsFuture.get();

            UserAlbumCatalog userAlbumCatalog = new UserAlbumCatalog(userCatalog, albumsCatalog);
            System.out.println(userAlbumCatalog.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }*/
}
