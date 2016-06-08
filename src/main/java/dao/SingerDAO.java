package dao;

import model.SingersCatalog;
import model.Singer;

import java.time.Duration;

/**
 * Created by Mayer Roman on 03.06.2016.
 */
public interface SingerDAO {

    void createSingersCatalog(SingersCatalog catalog);

    void createSinger(Singer singer);


    SingersCatalog readSingersCatalog();

    Singer readSinger(int singerId);

    Duration getDurationOfAllSongsOfSinger(int singerId);


    void updateSinger(Singer singer);

    void deleteSinger(int singerId);
}
