/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class6
{
    public static Class158 aClass158_92;
    public static int anInt93;
    public static int anInt94;
    public static Class89 aClass89_95 = new Class89();
    public static Class56 aClass56_96;
    public static HashTable aClass180_97;
    public static int[] anIntArray98 = { 16, 32, 64, 128 };
    
    public static void method162(int arg0, int arg1, boolean arg2) {
	try {
	    Class121.aByteArrayArrayArray1590
		= (new byte[arg0][Class131_Sub41_Sub11_Sub1.map_sizeX - -1]
		   [arg1 + Class131_Sub2_Sub26.mapSizeY]);
	    Class193.anInt2830 = 99;
	    Class131_Sub41_Sub11.anIntArray6301
		= new int[Class131_Sub2_Sub26.mapSizeY];
	    Class88.aByteArrayArrayArray1150
		= (new byte[arg0][Class131_Sub41_Sub11_Sub1.map_sizeX]
		   [Class131_Sub2_Sub26.mapSizeY]);
	    Class131_Sub22.anIntArray4448
		= new int[Class131_Sub2_Sub26.mapSizeY];
	    Class83.anIntArray1097 = new int[Class131_Sub2_Sub26.mapSizeY];
	    Class121_Sub3_Sub1.aByteArrayArrayArray5434
		= (new byte[arg0][Class131_Sub41_Sub11_Sub1.map_sizeX]
		   [Class131_Sub2_Sub26.mapSizeY]);
	    Class78.anIntArray1054 = new int[Class131_Sub2_Sub26.mapSizeY];
	    if (!arg2)
		ItemDefinitions.aByteArrayArrayArray362 = null;
	    Class17.aByteArrayArrayArray184
		= (new byte[arg0][Class131_Sub41_Sub11_Sub1.map_sizeX]
		   [Class131_Sub2_Sub26.mapSizeY]);
	    Cryption.anIntArrayArrayArray1828
		= (new int[arg0][Class131_Sub41_Sub11_Sub1.map_sizeX + 1]
		   [Class131_Sub2_Sub26.mapSizeY + 1]);
	    Class131_Sub2_Sub16.anIntArray5789 = new int[5];
	    anInt93++;
	    Class131_Sub3.anIntArray4127
		= new int[Class131_Sub2_Sub26.mapSizeY];
	    Class131_Sub41_Sub18.aByteArrayArrayArray6402
		= (new byte[arg0][Class131_Sub41_Sub11_Sub1.map_sizeX]
		   [Class131_Sub2_Sub26.mapSizeY]);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("aj.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static void method163(int arg0) {
	try {
	    if (arg0 != 32)
		anIntArray98 = null;
	    aClass180_97 = null;
	    aClass89_95 = null;
	    anIntArray98 = null;
	    aClass158_92 = null;
	    aClass56_96 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"aj.B(" + arg0 + ')');
	}
    }
    
    static {
	aClass180_97 = new HashTable(8);
    }
}
