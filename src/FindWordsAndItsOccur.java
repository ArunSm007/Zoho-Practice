import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWordsAndItsOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Jana gana mana adhinaayaka jaya hay Bhaaratha Bhaagya Vidhaata Punjab Sindhu Gujarat Maraatha Draavida Utkala Banga Vindhya Himaachala Yamuna Ganga Ucchala jaladhi taranga Tava Shubha naame jaage Tava shubha aashisha maage Gaahey tava jaya gaathaa Jana Gana Mangala Daayaka jaya hay Bhaaratha Bhaagya Vidhaata Jaya hay Jaya hay Jaya hay Jaya Jaya Jaya Jaya hay";
		Pattern ptn = Pattern.compile("Jana");
		Matcher mat = ptn.matcher(str);
		while(mat.find()) {
			System.out.println(mat.start());
		}
	}

}
