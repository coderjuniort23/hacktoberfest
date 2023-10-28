import java.util.*;  
class DateI  
{  
    String date;   
    /* Constructor */  
    DateI(String date)  
    {  
        /* This keyword is used to refer current object */  
        this.date = date;  
    }  
}  
class sortCompare implements Comparator<DateI>   
{  
    // Method of this class  
    @Override  
    public int compare(DateI a, DateI b)  
    {  
        /* Returns sorted data in ascending order */  
        return a.date.compareTo(b.date);  
    }  
}  
public class SortDate1   
{  
    /* Driver Code */  
    public static void main(String args[])  
    {  
        ArrayList<DateI> dates = new ArrayList<>();  
        /* Adding data to the ArrayList */  
        dates.add(new DateI("2021-05-14"));  
        dates.add(new DateI("2019-06-24"));  
        dates.add(new DateI("1998-02-20"));  
        dates.add(new DateI("1999-04-26"));  
        /* Sort the ArrayList with Collections.sort() method */  
        Collections.sort(dates, new sortCompare());  
        System.out.println("Dates sorted in Ascending Order");  
        for (DateI d : dates)   
        {  
            System.out.println(d.date);  
        }  
    }  
}  