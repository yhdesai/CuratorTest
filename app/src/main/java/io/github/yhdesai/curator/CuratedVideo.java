package io.github.yhdesai.curator;

/**
 * Created by Harshil on 30/11/17.
 */

public class CuratedVideo {
    private String name;
    private String url;

    public CuratedVideo(){
    }

    public CuratedVideo(String name, String url){
        this.name = name;
        this.url = url;
    }

    public String getName(){
        return name;
    }

    public String getUrl(){
        return url;
    }


}
