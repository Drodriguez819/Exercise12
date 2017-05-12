* Name: David Rodriguez
* Section: COSC/ITSE 1336
* Homework: Excercise 17
* Description: program that read in arbitrary numbers of integers that are in the range 0 to 50 inclusive 
*               and counts how many occurrence of each are entered.
*/

/*
* -------------------------------PSUDO CODE---------------------------------------------
*   1) Create strings for title, author ,publisher
*       a) Create getters and setters for each and put a string method to display each
*    
*---------------------------------------------------------------------------------------
*/

public class Book {

private String title = "The lonesome Book";
private String author = "David Rodriguez";
private String publisher = "My Computer";
private String copyright = "computerC";



public String getTitle(){
    return title;
}
public void setTitle(String userTitle){
    title = userTitle;
}
public String getAuthor(){
    return author;
}
public void setAuthor(String userAuthor){
    author = userAuthor;
}
public String getPublisher(){
    return publisher;
}
public void setPublisher(String userPublisher){
    publisher = userPublisher
}
public String getCopyrigth(){
    return copyright;
}
public void setCopyright(String userCopyright){
    copyright = userCopyright;
}
public Book ( String title, String author, String publisher, String copyright){

    title  = userTitle;
    author = userAuthor;
    publisher = userPublisher;
    copyright = userCopyright;
    
    }

public String toString(){
    return "Title:"+ title + "\n" + author + "\n"
+ publisher + "\n" + copyright "\n\n");

}
}
