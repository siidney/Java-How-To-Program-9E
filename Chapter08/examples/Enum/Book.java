/*
 *       Filename:  Book.java
 *
 *    Description:  8.10 - Declaring an enum type with constructor and explicit
 *                  instance fields and accessors for these fields.
 *
 *        Created:  26/10/15 16:29:26
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public enum Book{
    // declare constants of enum type
    JHTP("Java How to Program", "2012"),
    CHTP("C How to Program", "2007"),
    IW3HTP("Internet & World Wide Web How to Program", "2008"),
    CPPHTP("C++ How to Program", "2012"),
    VBHTP("Visual Basic 22010 How to Program", "2011"),
    CSHARPHTP("Visual C# 2010 How to Program", "2011");

    // instance fields
    private final String title;
    private final String copyrightYear;

    // enum constructor
    Book(String title, String copyrightYear){
        this.title = title;
        this.copyrightYear = copyrightYear;
    }
    // accessor for field title
    public String getTitle(){
        return this.title;
    }
    // accessor for field copyrightYear
    public String getCopyrightYear(){
        return this.copyrightYear;
    }
}
