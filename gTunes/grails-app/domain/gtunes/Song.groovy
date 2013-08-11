package gtunes

class Song {
String title
String artist
Integer duration
Album album
Date date
    static constraints = {
		
		title blank:false
		artist blank:false
		duration(min:1)

		
    }
	
	
}
