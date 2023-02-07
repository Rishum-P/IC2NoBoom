package mod.rishum.nobang.mixin;

import ic2.core.IC2;
import net.minecraft.entity.EntityLivingBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ic2.core.entity.misc.EntityMiningLaser.class)
public abstract class EntityMiningLaser {

    @Shadow EntityLivingBase shooter;

        /**
     * @author Rishum
     * @reason Removes Mining Lasers Explosive
     */
    @Overwrite(remap = false)
    public void explode() {
        IC2.log.info("Player: " + shooter.getName() + " tried to use Mining Laser Explosive at: " + shooter.getPosition().getX() + "," + shooter.getPosition().getY() + "," + shooter.getPosition().getZ());
        return;
    }
}