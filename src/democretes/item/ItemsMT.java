package democretes.item;

import cpw.mods.fml.common.registry.GameRegistry;
import democretes.item.tools.ItemDebugger;
import democretes.item.tools.ItemNodeLinker;
import democretes.item.tools.ItemPuritySyphon;
import democretes.lib.ItemNames;
import net.minecraft.item.Item;

public class ItemsMT {
	
	public static Item debugger;
	public static Item syphon;
	public static Item link;
	
	public static void init() {
		debugger = new ItemDebugger();
		syphon = new ItemPuritySyphon();
		link = new ItemNodeLinker();
		
		GameRegistry.registerItem(debugger, ItemNames.DEBUGGER_NAME);
		GameRegistry.registerItem(syphon, ItemNames.SYPHON_NAME);
		GameRegistry.registerItem(link, ItemNames.LINKER_NAME);
		
	}

}
