/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author pituzdg
 */
public class AudioCD extends CD {
     private int NumbersSongs=0;
     private String author="";
     public String getAuthor() 
    {
        return author;
    }
    public void setTitle(String author) 
    {
        this.author = author;
    }
    public int getNumbersSongs() 
    {
        return NumbersSongs;
    }

    public void setNumbersSongs(int NumbersSongs) 
    {
        this.NumbersSongs = NumbersSongs;
    }
}
