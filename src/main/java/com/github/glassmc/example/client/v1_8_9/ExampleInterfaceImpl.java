package com.github.glassmc.example.client.v1_8_9;

import com.github.glassmc.example.client.IExampleInterface;
import v1_8_9.net.minecraft.client.MinecraftClient;

public class ExampleInterfaceImpl implements IExampleInterface {

    @Override
    public boolean isMAC() {
        return MinecraftClient.IS_MAC;
    }

}