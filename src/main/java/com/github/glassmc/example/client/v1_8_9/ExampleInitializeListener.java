package com.github.glassmc.example.client.v1_8_9;

import com.github.glassmc.example.client.IExampleInterface;
import com.github.glassmc.loader.api.GlassLoader;
import com.github.glassmc.loader.api.Listener;
import com.github.glassmc.loader.api.loader.TransformerOrder;

public class ExampleInitializeListener implements Listener {

    @Override
    public void run() {
        GlassLoader.getInstance().registerInterface(IExampleInterface.class, new ExampleInterfaceImpl());

        GlassLoader.getInstance().registerTransformer(MinecraftClientTransformer2.class, TransformerOrder.LAST);
        GlassLoader.getInstance().registerTransformer(MinecraftClientTransformer.class);
    }

}
