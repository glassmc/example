package com.github.glassmc.example.client.v1_8_9;

import com.github.glassmc.example.client.IExampleInterface;
import com.github.glassmc.loader.GlassLoader;
import com.github.glassmc.loader.Listener;
import com.github.glassmc.loader.util.Identifier;

public class ExampleInitializeListener implements Listener {

    @Override
    public void run() {
        GlassLoader.getInstance().registerInterface(IExampleInterface.class, new ExampleInterfaceImpl());

        GlassLoader.getInstance().registerTransformer(MinecraftClientTransformer.class);
        GlassLoader.getInstance().registerReloadClass(Identifier.parse("net/minecraft/client/MinecraftClient").getClassName());
    }

}
