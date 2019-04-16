import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class ServersList {

	private static final int FLAG_MEMBERS   = 1;
	@SuppressWarnings("unused")
	private static final int FLAG_QUICKCHAT = 2;
	@SuppressWarnings("unused")
	private static final int FLAG_PVP       = 4;
	private static final int FLAG_LOOTSHARE = 8;
	private static final int FLAG_HIGHLIGHT = 16;
	
    public static void loadServerList() {
    	
    	if(ClientSettings.disable_server_list)
    		return;
    	if(Class131_Sub17.anInt4371 != 0) {
    		Class131_Sub17.anInt4371 = 0;
    		return;
    	}
    	if(!createConnection())
    		return;
    	ListedServer[] servers = loadServers();
    	destroyCon();
    	if(servers == null)
    		return;
	    Class28.aClass84Array282 = new Class84[servers.length];
	    for (int serverIndex = 0; serverIndex < servers.length; serverIndex++) { //doesnt matter this
		Class28.aClass84Array282[serverIndex] = new Class84();
		Class28.aClass84Array282[serverIndex].anInt1102 = 31; //UK location
		Class28.aClass84Array282[serverIndex].aString1100 = "EN"; //read region
	    }
	    Class127_Sub1.anInt4008 = 0;
	    Class212.anInt3110 = servers.length-1;
	    Class131_Sub2_Sub19.anInt5826 = servers.length;
	    Class193.aClass128_Sub1Array2835
	 		= new Class128_Sub1[Class131_Sub2_Sub19.anInt5826];
	    for (int serverIndex = 0; Class131_Sub2_Sub19.anInt5826 > serverIndex; serverIndex++) {
			Class128_Sub1 class128_sub1
			    = (Class193.aClass128_Sub1Array2835[serverIndex]
			       = new Class128_Sub1());
			class128_sub1.location = 0; //location
			class128_sub1.extraInformHash = FLAG_MEMBERS+FLAG_LOOTSHARE+FLAG_HIGHLIGHT;
			class128_sub1.serverId = servers[serverIndex].id;//server id read from mysql
			class128_sub1.ip = servers[serverIndex].ip; //read server ip
			class128_sub1.portId = servers[serverIndex].portId; //portid read from mysql
			class128_sub1.activity = servers[serverIndex].name+" - "+servers[serverIndex].description; //read server name and description
	    }
	    Class131_Sub17.anInt4371 = 1;
	    Class23_Sub1.aBoolean3701 = true;
	    
	    
	    //ppl ammt
	    for (int serverIndex = 0; Class131_Sub2_Sub19.anInt5826 > serverIndex; serverIndex++) {
		int i_1_ = servers[serverIndex].online ? 2000 : -1; //-1 if off, 2000 if on, read from mysql
		if ((i_1_ ^ 0xffffffff) == -65536)
		    i_1_ = -1;
		if (Class193.aClass128_Sub1Array2835[serverIndex] != null)
		    Class193.aClass128_Sub1Array2835[serverIndex].anInt1744 = i_1_;
	    }
	    
    }
	
        public static Connection con;
        public static Statement stm;

               public static boolean createConnection() {
                try {
                	
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        con = DriverManager.getConnection("jdbc:mysql://"+ClientSettings.server_list_database, ClientSettings.server_list_user, ClientSettings.server_list_pass);
                        stm = con.createStatement();
                        return true;
                } catch (Exception e) {
                        e.printStackTrace();
                        return false;
                }
        }

        public static final ResultSet getResults(String query) throws SQLException {
        	return stm.executeQuery(query);
        }

        public static void destroyCon() {
                try {
                		if(stm != null)
                			stm.close();
                		if(con != null)
                			con.close();
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }
        
        
        /**
         * @return
         */
        private static ListedServer[] loadServers() {
        	try {
            	ResultSet results = getResults("SELECT * FROM servers"); 
               	List<ListedServer> servers = new LinkedList<ListedServer>();
            	while(results.next()) {
            		servers.add(new ListedServer(results.getString("server_ip")
            				, results.getString("server_name")
            				, results.getString("discription")
            				, results.getInt("server_port")
            				, results.getInt("id")
            				,results.getString("status").equals("Online"))); //TODO 
            	}
            	return servers.toArray(new ListedServer[servers.size()]);
        	}catch (Exception e) {
        		e.printStackTrace();
        		return null;
        	}
        }
        
        private static class ListedServer {
        	
        	protected String ip, name, description;
        	protected int portId, id;
        	protected boolean online; 
        	
        	private ListedServer(String ip, String name, String description, int portId, int id, boolean online) {
        		this.ip = ip;
        		this.name = name;
        		this.description = description;
        		this.portId = portId;
        		this.id = id;
        		this.online = online;
        	}
        	
        }
}
        
