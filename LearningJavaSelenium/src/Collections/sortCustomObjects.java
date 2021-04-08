package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import Practise.Song;

public class sortCustomObjects {

	public static void main(String[] args) {
		
		//the type of objects to be added in the arraylist will be of type class 'Song'
		
		ArrayList<Song> playlist = new ArrayList<Song>();
		
		//we have to create Song class objects & add them to the arraylist 'playlist'
		
		Song song1 = new Song("Kaise hua","Vishal Mishra",2019); //Resolve the compile time error by creating a constructor in Song class
		Song song2 = new Song("sajan","kumar",1992);
		Song song3 = new Song("zalima","arijit",2017);
		Song song4 = new Song("bekhayalia","sachet",2018);
		
		
		playlist.add(song1);
		playlist.add(song2);
		playlist.add(song3);
		playlist.add(song4);
		
		/*for(Song temp:playlist)
		{
			System.out.println(temp); //this gives us the object reference but we want the content
		}*/
		
		//To print the content we should override the tostring() method of object class in Song class
		//Source>Generate to String()...
		
		for(Song temp :playlist)
		{
			System.out.println(temp); 
		}
		
		//Now that we have the arraylist ready we will sort
		
		//Collections.sort(playlist); //throwing a compile time error 
									//The method sort(List<T>) in the type Collections is not applicable for the arguments (ArrayList<Song>)
		
		//The fix is to make our class Song implements Comparable Interface //Refer https://www.youtube.com/watch?v=LLbmyp3DUlw&list=PL3NrzZBjk6m_hMXyO_QbI9Z4w10Bd8gt9&index=5  to know why
		
		//The compile time error will go but the sorting wont happen because we need to implement compareTo()  method of Comparable Interface
		
		//If we open declaration of Integer,String class we would see they are implementing comparable interface hence we also need to implement the same in our custom class Song
		
		//Even now we would get a compile time error at the implements line as we haven't implemented the compareTo() abstract method of implements interface
		
		//If we open String,Integer class declaration & search for the compareTo() by ctrl+o we can see the method as implemented hence for our custom class Song we have to implement it
		
		//In  compareTo() method we need add the code to sort the list on the basis of any one of the fields(title,artist,year) as per requirement
		
		//Check Song.java we have added added in compareTo() method to compare year of one song with another i.e sort them in natural order on the basis of year
		
		Collections.sort(playlist); //sort() will internally call compareTo() of Song class
		
		System.out.println("After Sorting");
		
		for(Song temp :playlist)
		{
			System.out.println(temp); 
		}
	}

}
