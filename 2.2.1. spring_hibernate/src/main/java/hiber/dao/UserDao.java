package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);

   List <User> getUsersByCarModelAndSeries(String model, int series);

   User getUserByCarModelAndSeries(String model, int series);

   List<User> listUsers();
}