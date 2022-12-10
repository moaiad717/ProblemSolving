import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {

    public static void main(String[] args) {
        String [] s = new String[]{"ss","sd"};
        List<String> ff= List.of("dds");
        Stream<String> stringStream=ff.stream();
        Stream<String> stringStream2=Stream.of(s);

        List<BlogPost> posts = Arrays.asList();

        //Group by Type
        Map<BlogPostType, List<BlogPost>> postsPerType = posts.stream()
                .collect(Collectors.groupingBy(BlogPost::getType));

        //ConvertToMap <string author,string title>
        Map<String, String> postsTMap = posts.stream()
                .collect(Collectors.toMap(BlogPost::getAuthor,BlogPost::getTitle));
    }
}





class BlogPost {
    public String getAuthor() {
        return author;
    }

    public BlogPostType getType() {
        return type;
    }

    public int getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }

    String title;
    String author;
    BlogPostType type;
    int likes;
}
enum BlogPostType {
    NEWS,
    REVIEW,
    GUIDE
}