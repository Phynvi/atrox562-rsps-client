import java.util.HashMap;
import java.util.Map;


public class ParticleAttachment {
    private static final Map<Integer, int[][]> attachments = new HashMap<>();


    public static int[][] getAttachments(int model) {
        return attachments.get(model);
    }


    static {
        /* Master Capes */
        attachments.put(15293, new int[][] {{494, 3}, {488 , 3}, {485 , 3}, {476 , 3}, {482 , 3}, {479 , 3}, {491 , 3},});
        //attachments.put(65328, new int[][] {{494, 3}, {488 , 3}, {485 , 3}, {476 , 3}, {482 , 3}, {479 , 3}, {491 , 3},});
       }
}