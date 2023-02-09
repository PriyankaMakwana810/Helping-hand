package com.example.halpinghand;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface blinduserdbDao {
    @Query("select * from blindUser")
    List<blinduserdb> selectAll();

    @Insert
    void addUser(blinduserdb bd);

    @Update
    void updateUser(blinduserdb bd);

    @Delete
    void deleteUser(blinduserdb bd);
}
