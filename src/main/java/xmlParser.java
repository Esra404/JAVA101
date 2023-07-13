import com.apptasticsoftware.rssreader.Item;
import com.apptasticsoftware.rssreader.RssReader;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

public class xmlParser {
    public static void main(String[] args) throws IOException {
        RssReader rssReader = new RssReader();
        List<Item> items = rssReader.read("https://evrimagaci.org/kategori/biyoloji-21/rss.xml")
                .collect(Collectors.toList());

        List<Item> item = new RssReader()
                .addItemExtension("image", Item::setComments)
                .addItemExtension("dc:date", Item::setPubDate)
                .read("https://evrimagaci.org/kategori/biyoloji-21/rss.xml")
                .collect(Collectors.toList());
        System.out.println(item.toString());

        for(Item item1:item){
            System.out.println(item1.getDescription().get()+"  \n"+ item1.getTitle() );
//            System.out.println(item1.getTitle().get()+"\t \n \n \n");
////            System.out.println(item.getComments().get()+"\t \n \n \n");
//            System.out.println(item1.getCategories().stream().collect(Collectors.toList())+"\t \n \n \n");
        }
    }
}
