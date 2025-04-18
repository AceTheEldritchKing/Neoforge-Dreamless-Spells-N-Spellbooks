package net.Iceforkkk.DreamlessAditions.entity.armor;

import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.Iceforkkk.DreamlessAditions.item.armor.SleeplessArmorArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class SleeplessArmorArmorModel extends DefaultedEntityGeoModel<SleeplessArmorArmorItem> {

    public SleeplessArmorArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, ""));
    }

    // Just replace where the path is with the file path of your texture, EZ PZ
    @Override
    public ResourceLocation getModelResource(SleeplessArmorArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "geo/sleepless_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SleeplessArmorArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "textures/models/armor/sleepless_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SleeplessArmorArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}
