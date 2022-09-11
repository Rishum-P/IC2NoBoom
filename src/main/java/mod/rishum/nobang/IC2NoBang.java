package mod.rishum.nobang;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = IC2NoBang.MODID, name = IC2NoBang.NAME, version = IC2NoBang.VERSION, acceptedMinecraftVersions = "[1.12.2]", dependencies = "required-after:mixinbooter;required-after:ic2", acceptableRemoteVersions="*")

public class IC2NoBang
{
    public static final String MODID = "ic2nobang";
    public static final String NAME = "IC2 NoBang";
    public static final String VERSION = "1.12.2-1.0.0";
    public static final Logger LOGGER = LogManager.getLogger();

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LOGGER.info("IC2-NoBang initialized");
    }
}