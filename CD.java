/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author pituzdg
 */
public class CD {
    
    private String title="";
    private int year=0;

    /**
     * @return the title
     */
    public String getTitle() 
    {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) 
    {
        this.title = title;
    }

    /**
     * @return the year
     */
    public int getYear() 
    {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) 
    {
        this.year = year;
    }
     
    @Override //przyslanianie, nadpisywanie
    public String toString(){
        String nl=System.getProperty("line.separator");
    return getClass().getSimpleName() + nl + " title: " + title + " , " + year + " year";
    }
    
}
