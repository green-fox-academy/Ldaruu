public class Main {
  public static void main(String[] args) {
    // write your code here
    BlogPost first =new BlogPost("J.J", "When I got my first bike",
        "We star our jouney in september","1995.19.13");
    BlogPost second =new BlogPost("Peter Parker", "Under the Rainbow", "Its raining", "1990.06.20");
    BlogPost third = new BlogPost("B.J", "My new Car", "This is a red car", "2014.03.08");

    Blog myBlog = new Blog();   //Creating the new Bloglist and adding the elements
    myBlog.addBlogs(first);
    myBlog.addBlogs(second);
    myBlog.addBlogs(third);

    System.out.println(myBlog.getAllBlogs().size()); //Printing out the List size
    System.out.println(myBlog.getAllBlogs().get(0));  //Printing the first // element from the list
   myBlog.deletBlog(1);                         //Deleting the first blog
    System.out.println(myBlog.getAllBlogs().size());   // Printing the List size
    System.out.println(myBlog.getAllBlogs().get(1));   //Printing the first element from the List
    myBlog.update(1, first);                    //Updating index 1 with the first post
    System.out.println(myBlog.getAllBlogs().size());
    System.out.println(myBlog.getAllBlogs().get(1));    //Printing out the second element from the lsit
  }
}