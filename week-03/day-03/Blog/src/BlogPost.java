public class BlogPost {
  String authorName;
  String title;
  String text;
  String publicationDay;

  public BlogPost(String authorName,String title,String text,String publicationDay){
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDay = publicationDay;
  }

  @Override
  public String toString() {
    return "BlogPost{" +
        "Author Name='" + authorName + '\'' +
        ", Title='" + title + '\'' +
        ", Text='" + text + '\'' +
        ", Publication Date:'" + publicationDay + '\'' +
        '}';
  }

}
