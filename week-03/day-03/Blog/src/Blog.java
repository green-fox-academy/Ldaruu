import java.util.ArrayList;
import java.util.List;

public class Blog {

  private List<BlogPost> allBlogs = new ArrayList<>();

  public void addBlogs(BlogPost blogPost ){
    allBlogs.add( blogPost);
  }
  public void deletBlog(int index) {
    allBlogs.remove(index);
  }
  public void update(int index, BlogPost blogPost){
    allBlogs.set(index,blogPost);
  }

  public List<BlogPost> getAllBlogs() {
    return allBlogs;
  }
}