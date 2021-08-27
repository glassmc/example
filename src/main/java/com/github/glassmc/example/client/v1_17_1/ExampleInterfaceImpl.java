package com.github.glassmc.example.client.v1_17_1;

import com.github.glassmc.example.client.IExampleInterface;
import v1_17_1.net.minecraft.client.MinecraftClient;

public class ExampleInterfaceImpl implements IExampleInterface {

    @Override
    public boolean isMAC() {
        return MinecraftClient.IS_SYSTEM_MAC;
    }

}
