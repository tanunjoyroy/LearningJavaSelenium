package Practise;

public class Song implements Comparable<Song>{

		//This is the custom class which is going to provide the data which is formed by combination of various primitive object datatypes.
		private String title;
		private String artist;
		private Integer year;
		
		//to generate public setter getter methods so that the private vars can be accessed outside of song class; 
		//Source>Generate Getters and Setters...
		
		
		
		public Song(String title, String artist, Integer year) {
			this.title = title;
			this.artist = artist;
			this.year = year;
			
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getArtist() {
			return artist;
		}
		public void setArtist(String artist) {
			this.artist = artist;
		}
		public Integer getYear() {
			return year;
		}
		public void setYear(Integer year) {
			this.year = year;
		}
		@Override
		public String toString() {
			return "Song [title=" + title + ", artist=" + artist + ", year=" + year + "]";
		}
		@Override
		public int compareTo(Song otherSong) {
			
			//sorting by year
			return this.getYear().compareTo(otherSong.getYear());
			
			//if we want the sorting to be in descending order then just put a negative sign
			
			//return -this.getYear().compareTo(otherSong.getYear());
			
			
			//this.getYear() - current object's year;it will return an Integer so we can use the in built compareTo() of integer class to compare it against the year of otherSong
			
			//or if we want to implement our own logic is as follows 
			
			//both will give same result
			
			/*if(this.getYear()>otherSong.getYear())
			{
				return +1; //sign matters value can be anything
			}
			if(this.getYear()<otherSong.getYear())
			{
				return -1; //sign matters value can be anything
			}
			return 0; //if they are equal
			*/
			
			
		}
		
		

	}

