package slugify;

import com.github.slugify.Slugify;


public class SlugifyUtils {
    public static void main(String[] args) {
        Slugify slugify = Slugify.builder().build();
        Slugify slugify1 = Slugify.builder().underscoreSeparator(true)  .build();

        final Slugify slg = Slugify.builder().underscoreSeparator(true).build();
        final String result = slg.slugify("Hello, world!");

        String inputString = "Hello, world!";
        String slug = slugify.slugify(inputString);

        System.out.println("Input String: " + inputString);
        System.out.println("Slug: " +slug);
        System.out.println(slugify1.slugify(inputString));
    }
    }

