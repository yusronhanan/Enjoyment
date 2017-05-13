package id.sch.smktelkom_mlg.privateassignment.xirpl136.enjoyment.Sugar;

import com.orm.SugarRecord;

import java.io.Serializable;

/**
 * Created by Yuzron on 13/05/2017.
 */

public class Place extends SugarRecord implements Serializable {
    public String poster;
    public String overview;
    public String terbit;
    public String judul;
    public String backdrop;
    public String rate;


    public Place(String rate, String poster, String overview, String terbit, String judul, String backdrop) {
        this.poster = poster;
        this.overview = overview;
        this.terbit = terbit;
        this.judul = judul;
        this.backdrop = backdrop;
        this.rate = rate;

    }

}