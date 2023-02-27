package apis;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import beans.User;
import dao.UserDAO;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Path("/userManager")
public class UsersManageAPI {

    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public void addUser(User user){
        Future<User> futureAddUser = UserDAO.createUser(user);
        futureAddUser.isDone();
    }

    @GET
    @Path("/get/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser(@PathParam("userId") String userId){
        Future<User> futureGetUser = UserDAO.readUser(userId);
        try {
            return futureGetUser.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PUT
    @Path("/update")
    @Produces(MediaType.APPLICATION_JSON)
    public void updateUser(User user){
        Future<User> futureUpdateUser = UserDAO.updateUser(user);
        futureUpdateUser.isDone();
    }

    @DELETE
    @Path("/delete/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteUser(@PathParam("userId") String userId){
        Future<User> futureDeleteUser = UserDAO.deleteUser(userId);
        futureDeleteUser.isDone();
    }

}
