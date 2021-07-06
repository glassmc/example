package io.github.glassmc.example.client.v1_8_9;

import io.github.glassmc.example.client.IExampleInterface;
import io.github.glassmc.loader.GlassLoader;
import io.github.glassmc.loader.Listener;
import io.github.glassmc.loader.util.Identifier;

public class ExampleClientInitializeListener implements Listener {

    @Override
    public void run() {
        GlassLoader.getInstance().registerInterface(IExampleInterface.class, new ExampleInterfaceImpl());

        GlassLoader.getInstance().registerTransformer(new MinecraftClientTransformer());
        GlassLoader.getInstance().registerReloadClass(Identifier.parse("net/minecraft/client/MinecraftClient").getClassName());
    }

}
