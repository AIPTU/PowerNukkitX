package cn.nukkit.item;

import cn.nukkit.item.trim.ItemTrimPatternType;

/**
 * @author Glorydark
 */
public class ItemShaperArmorTrimSmithingTemplate extends Item implements ItemTrimPattern {

    public ItemShaperArmorTrimSmithingTemplate() {
        this(0, 1);
    }

    public ItemShaperArmorTrimSmithingTemplate(Integer meta) {
        this(meta, 1);
    }

    public ItemShaperArmorTrimSmithingTemplate(Integer meta, int count) {
        super(SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE, meta, count, "Shaper Armor Trim Smithing Template");
    }

    @Override
    public ItemTrimPatternType getPattern() {
        return ItemTrimPatternType.SHAPER_ARMOR_TRIM;
    }
}
