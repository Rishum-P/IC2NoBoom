package mod.rishum.nobang.mixin;

import ic2.api.classic.reactor.IChamberReactor;
import ic2.core.IC2;
import ic2.core.block.base.tile.TileEntityMachine;
import ic2.core.block.base.util.info.ReactorHeat;
import ic2.core.inventory.base.IHasGui;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ic2.core.block.base.tile.TileEntityNuclearReactorBase.class)
public abstract class TileEntityNuclearReactorBase extends TileEntityMachine implements ITickable, IChamberReactor, IHasGui {

    public TileEntityNuclearReactorBase(int slots) {
        super(54);
        this.addInfos(new InfoComponent[]{new ReactorHeat(this)});
    }

    /**
     * @author Rishum
     * @reason Removes Reactor Explosions and instead just deletes the block. Way better for servers
     */
    @Overwrite(remap = false)
    public void explode() {
        IC2.log.info("Nuclear Reactor at " + this.world.provider.getDimension() + ":(" + this.pos.getX() + "," + this.pos.getY() + "," + this.pos.getZ() + ") - Meltdown! Block has been removed!");
        this.world.setBlockToAir(new BlockPos(this.pos.getX(), this.pos.getY(), this.pos.getZ()));
    }
}