package slugify;

import com.github.slugify.Slugify;


public class SlugifyUtils {
    public static void main(String[] args) {
        String name=" usman khalid";
        System.out.println(slug(name));

    }

    public  static  String slug(String name){
        return name.toLowerCase()
                .strip()
                .replaceAll("[^a-zA-Z0-9 ]","")
                .replaceAll(" ","-");

    }
    }

