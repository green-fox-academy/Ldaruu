package com.greenfoxacademy;

public class Main {

  public static void main(String[] args) {
    // write your code here
    BlogPost one = new BlogPost();
    one.authorName = "John Doe";
    one.publicationDay = "2000.05.04.";
    one.title = "Lorem Ipsum";
    one.text = "Lorem ipsum dolor sit amet.";

    BlogPost two = new BlogPost();
    two.authorName = "Tim Urban";
    two.title = "Wait but why";
    two.publicationDay = "2010.10.10.";
    two.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

    BlogPost three = new BlogPost();
    three.authorName = "William Turton";
    three.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    three.publicationDay = "2017.03.28.";
    three.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";

    System.out.println(three.text);
  }
}
