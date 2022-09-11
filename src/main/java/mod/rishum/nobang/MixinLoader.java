package mod.rishum.nobang;

import java.util.ArrayList;
import java.util.List;

import zone.rong.mixinbooter.ILateMixinLoader;

public class MixinLoader implements ILateMixinLoader
{
    @Override
    public List<String> getMixinConfigs()
    {
        List<String> mixins = new ArrayList<>();
        mixins.add("ic2nobang.mixins.json");
        return mixins;
    }
}