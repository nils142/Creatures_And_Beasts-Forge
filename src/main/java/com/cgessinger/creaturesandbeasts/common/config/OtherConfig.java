package com.cgessinger.creaturesandbeasts.common.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OtherConfig<T>
{
    private final ForgeConfigSpec.ConfigValue<T> configValue;

    public T value;
    
    public OtherConfig(ForgeConfigSpec.ConfigValue<T> val)
    {
        configValue = val;
    }

    public void bake ()
    {
        this.value = configValue.get();
    }

    public static <E> OtherConfig<E> with (ForgeConfigSpec.Builder builder, String comment, String name, E value)
    {
        return new OtherConfig<>(builder.comment(comment + " (default: " + value + ")").define(name, value));
    }
}
