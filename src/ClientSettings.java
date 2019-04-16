
import java.awt.Color;

public class ClientSettings {

	public static String getCacheDir() {
		return System.getProperty("user.home") + "/.AtroxPK_Cache";
	}

	//public static final String cacheLink = "https://www.dropbox.com/s/t74r8w8ojgpys8h/562cache.zip?dl=1";
	public static int cacheRevision = 1;
	public static final String ip = "127.0.0.1";
	public static final int port = 43594;
	public static final String background_music_name = "Pest Control";
	public static final String serverName = "Atrox PK";
	public static final String slogan = "2009 Emulation";
	public static final String serverVersion = "1.0";
	public static final String websiteLink = "http://atroxrsps.com/";
	public static final String clientIcon = "http://atroxrsps.com/img/news/news1.jpg";
	public static final Color startLoadClientBackgroundColor = Color.black;
	public static final boolean disable_server_list = true;
	public static final boolean disable_ukeys_check = true;
	public static final boolean disable_keys_request = true;

	/*
	 * WEBCLIENT
	 */
	//for webclient all you have to do is jar and sign
	//I RECOMMENT YOU TO USE JARMAKER APP FOR THAT http://download.cnet.com/JAR-Maker/3000-2213_4-10588876.html
	//main-class: client
	//applet-class:client too
	
	/*
	 * dont worry even trying hacking, this user is limited :)
	 */
	public static final String server_list_database = "127.0.0.1/servers"; //ip, database
	public static final String server_list_user = "ostava"; //user
	public static final String server_list_pass = "ostava"; //pass
	public static final boolean DISABLE_RSA = true;

	public static final boolean DISABLE_ISAAC = true;
}
