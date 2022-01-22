package com.github.glassmc.example.client.v1_18_1;

import com.github.glassmc.example.client.IExampleInterface;
import v1_18_1.net.minecraft.client.Minecraft;

public class ExampleInterfaceImpl implements IExampleInterface {

    @Override
    public boolean isMAC() {
        return Minecraft.ON_OSX;
    }

}
