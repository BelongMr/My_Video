package com.belong.service;

import com.belong.model.Movies;
import com.belong.model.Review;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by belong on 16-11-6.
 */
public interface IMoviesService{
    String getPath(int Vid);
    Movies getPic(int Vid);
    ArrayList<Movies> search(Map map);
    void views(int Vid);
    void upload(Map map);
    Review review(Map map);
    ArrayList<Movies> getInfo(Map map);
}
